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
    private int position; // 현재 위치(길이)

    public void initializeGame(int bridgeLength) {
        // 정답 bridge 생성
    }

    public boolean canPlayTurn(String move) {
        // isCorrect로 플레이 가능 여부 판별
        return false;
    }

    public void move(BridgeOption bridgeOption) {
        //
    }

    public void retry() {

    }

    private List<String> makeBridgeImage() {
        // 다리 형태 만들기 (출력용)
        // 윗줄과 아랫줄 두 줄

        return new ArrayList<String>();
    }
}
