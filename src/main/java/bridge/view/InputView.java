package bridge.view;

import bridge.utils.Validator;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    public int readBridgeSize() {
        System.out.println("다리 건너기 게임을 시작합니다.\n" +
                "\n" +
                "다리의 길이를 입력해주세요.");
        String input = Console.readLine();
        int len = Validator.parseBridgeLength(input);
        return len;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
