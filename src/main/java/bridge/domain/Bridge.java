package bridge.domain;

import bridge.utils.BridgeMaker;
import bridge.utils.BridgeNumberGenerator;
import bridge.utils.BridgeRandomNumberGenerator;

import java.util.List;

public class Bridge {
    private static final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    private static final BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);
    private int length;
    private List<String> information;

    public Bridge(int length) {
        this.length = length;
        this.information = bridgeMaker.makeBridge(length);
    }

    public boolean isCorrect(String move, int position) {
        // 사용자의 position번째 입력이 정답이면
        if (move.equals(information.get(position))) {
            return true;
        }
        return false;
    }

    public int getLength() {
        return length;
    }

    public List<String> getInformation() {
        return information;
    }
}
