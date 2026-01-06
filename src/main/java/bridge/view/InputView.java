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

    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String input = Console.readLine();
        Validator.validateIsOption(input);
        return input;
    }

    public String readGameCommand() {
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
        String input = Console.readLine();
        Validator.validateIsCommand(input);
        return input;
    }
}
