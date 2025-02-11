# java-racingcar-precourse

## 구현 기능 목록

### 1) 입력
   1) 경주할 자동차의 이름 입력 받기
   2) 시도할 횟수 입력 받기
   3) 잘못된 입력 시, `IllegalArgumentException` 을 발생
      - 입력에 대해 공백으로 입력하였는지 검증
      - 자동차 이름들을 쉼표(,)로 구분하였는지 검증
      - 자동차 이름을 두 개 이상으로 입력하였는지 검증
      - 이름을 5자 이하로 작성하였는지 검증
      - 같은 이름을 입력하였는지 검증
      - 시도할 횟수를 양수로 입력하였는지 검증


### 2) 처리 과정
   1) 경주 준비
      - 입력 받은 자동차 이름 문자열 분리
      - 분리된 자동차 이름 개수 만큼 자동차 생성
      - 생성한 자동차들을 경주에 참여


   2) 경주 진행
      - 입력 받은 횟수만큼 이동을 실행
      - 자동차별로 0~9 숫자 중 랜덤으로 하나를 선정
        - `camp.nextstep.edu.missionutils.Randoms`의
          `pickNumberInRange()` 사용
      - 4 이상이라면 앞으로 한 칸이동, 아니라면 이동 X


   3) 경주 종료
      - 경주에 참여한 자동차들의 위치 비교
      - 최종 우승자 선정

### 3) 출력
   1) 경주할 자동차 이름 입력 요청 출력
   2) 시도할 횟수 입력 요청 출력
   3) 실행 결과 출력
   4) 최종 우승자 출력
      - 두 명 이상일 경우 쉼표(,)로 구분

----------------------------------------------------

### 4) 기타 

   - Movement(enum)
      - 전진을 의미하는 GO, 멈추는 것을 의미하는 STOP 선언

   - Separator
      - 쉼표(,)를 기준으로 문자열을 잘라주는 클래스

   - MovementGenerator
     - 0에서 9 사이에서 무작위 값을 구하고 4 이상일 경우 GO, 4 미만일 경우 STOP 반환하는 클래스

   