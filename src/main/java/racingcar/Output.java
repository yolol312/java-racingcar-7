package racingcar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class Output {
    private static final String CAR_NAME_REQUEST_MESSAGE =
            "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static void printCarNameRequestMessage(){
        System.out.println(CAR_NAME_REQUEST_MESSAGE);
    }

    public static void printNumberRequestMessage(){
        System.out.println("시도할 횟수는 몇 회인가요?");
    }
}
