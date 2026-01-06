package bridge.service;

import bridge.domain.Bridge;
import bridge.domain.BridgeOption;

import java.util.ArrayList;
import java.util.List;

public class BridgeGame {
    private Bridge bridge;
    private int position = 0; // 현재 위치(길이)
    private List<BridgeOption> userMoves = new ArrayList<>();
    private StringBuilder sb;
    private String win = "성공";
    private int tryTimes = 1;

    public void initializeGame(int bridgeLength) {
        this.bridge = new Bridge(bridgeLength);
    }

    public boolean move(String move) {
        userMoves.add(BridgeOption.findByName(move));
        position++;

        if (bridge.isCorrect(move, position-1)) {
            return true;
        }

        win = "실패";
        return false;
    }

    public void retry() {
        win = "성공";
        tryTimes++;
        userMoves.clear();
    }

    public List<String> makeBridgeImage() {
        List<String> bridgeImage = new ArrayList<>();

        bridgeImage.add(makeBridgeImage(BridgeOption.UP));
        bridgeImage.add(makeBridgeImage(BridgeOption.DOWN));

        return bridgeImage;
    }

    public boolean isReachedEnd() {
        if (position == bridge.getLength()) {
            return true;
        }

        return false;
    }

    private String makeBridgeImage(BridgeOption upOrDown) {
        sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < position; i++) {
            BridgeOption userOption = userMoves.get(i);
            if (i != 0) {
                sb.append("|");
            }
            compareBridge(userOption, upOrDown, i);
        }

        sb.append("]");
        return sb.toString();
    }

    private void compareBridge(BridgeOption userOption, BridgeOption upOrDown, int i) {
        if (userOption.equals(upOrDown)){
            if (bridge.isCorrect(userOption.getName(), i)){
                sb.append(" ").append("O").append(" ");
                return;
            }

            sb.append(" ").append("X").append(" ");
            return;
        }
        sb.append(" ").append(" ").append(" ");
    }

    public int getTryTimes() {
        return tryTimes;
    }

    public String getWin() {
        return win;
    }
}
