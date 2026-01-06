package bridge.view;

import java.util.List;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {
    private static final String ERROR_PREFIX = "[ERROR] ";

    public void printMap(List<String> results) {
        results.forEach(System.out::println);
    }

    public void printResult(List<String> results, int retry, String win) {
        System.out.println("최종 게임 결과");
        results.forEach(System.out::println);
        System.out.println();
        System.out.println("게임 성공 여부: "  + win);
        System.out.println("총 시도한 횟수: " + retry);

    }

    public void printError(String message) {
        System.out.println(ERROR_PREFIX + message);
    }
}
