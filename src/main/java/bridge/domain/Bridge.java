package bridge.domain;

import bridge.utils.BridgeRandomNumberGenerator;

import java.util.ArrayList;

public class Bridge {
    private static final BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
    private int length;
    private ArrayList<BridgeOption> information;

    public Bridge(int length) {
        this.length = length;
        this.information = initializeBridge();
    }

    // 건널 수 있는 칸 초기화 메소드
    private ArrayList<BridgeOption> initializeBridge() {
        ArrayList<BridgeOption> information = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            BridgeOption option = BridgeOption.findByDirection(bridgeRandomNumberGenerator.generate());
            information.add(option);
        }
        return information;
    }

    public boolean isCorrect(String move, int position) {
        // 사용자의 position번째 입력이 정답이면
        if (BridgeOption.findByName(move).equals(information.get(position))) {
            return true;
        }
        return false;
    }

    public int getLength() {
        return length;
    }

    public ArrayList<BridgeOption> getInformation() {
        return information;
    }
}
