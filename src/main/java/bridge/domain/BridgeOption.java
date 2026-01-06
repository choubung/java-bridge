package bridge.domain;

import java.util.Arrays;

public enum BridgeOption {
    UP("U", 1),
    DOWN("D", 0);

    private final String name;
    private final int direction;

    BridgeOption(String name, int direction) {
        this.name = name;
        this.direction = direction;
    }

    public static BridgeOption findByName(String input) {
        return Arrays.stream(values())
                .filter(o -> o.name.equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 옵션입니다."));
    }

    public static BridgeOption findByDirection(int input) {
        return Arrays.stream(values())
                .filter(o -> o.direction == input)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 옵션입니다."));
    }

    public int getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }
}
