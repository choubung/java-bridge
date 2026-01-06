package bridge.domain;

import java.util.Arrays;

public enum BridgeOption {
    UP("U"),
    DOWN("D");

    private final String name;

    BridgeOption(String name) {
        this.name = name;
    }

    public static boolean isCorrect(String input, BridgeOption answer) {
        // TODO: 사용자 입력과 정답 옵션이 동일한지 비교
        return false;
    }
}
