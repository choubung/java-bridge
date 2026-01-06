package bridge.service;

import bridge.domain.Bridge;
import bridge.domain.BridgeOption;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    private Bridge bridge;
    private int position = 0; // 현재 위치(길이)
    private List<BridgeOption> userMoves = new ArrayList<>();
    private StringBuilder sb;

    public void initializeGame(int bridgeLength) {
        this.bridge = new Bridge(bridgeLength);
    }

    public boolean move(String move) {
        userMoves.add(BridgeOption.findByName(move));

        if (bridge.isCorrect(move, position)) {
            return true;
        }

        return false;
    }

    public void retry() {
        userMoves.clear();
    }

    public List<String> makeBridgeImage() {
        List<String> bridgeImage = new ArrayList<>();

        bridgeImage.add(makeBridgeImage(BridgeOption.UP));
        bridgeImage.add(makeBridgeImage(BridgeOption.DOWN));

        return bridgeImage;
    }

    private String makeBridgeImage(BridgeOption upOrDown) {
        sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < position; i++) {
            BridgeOption userOption = userMoves.get(i);
            if (i != 0) {
                sb.append("|");
            }
            sb.append(compareBridge(userOption, upOrDown, i));
        }

        sb.append("]\n");
        return sb.toString();
    }

    private String compareBridge(BridgeOption userOption, BridgeOption upOrDown, int i) {
        if (userOption.equals(upOrDown)){
            if (userOption.equals(bridge.isCorrect(userOption.getName(), i))){
                return sb.append(" ").append("O").append(" ").toString();
            }

            return sb.append(" ").append("X").append(" ").toString();
        }

        return sb.toString();
    }
}
