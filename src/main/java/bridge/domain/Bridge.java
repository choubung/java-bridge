package bridge.domain;

import java.util.ArrayList;

public class Bridge {
    // int 다리 길이
    // ArrayList<BridgeOption> 건널 수 있는 칸 정보

    public Bridge(int length) {
        // 길이 초기화
        // 건널 수 있는 칸 초기화 = 건널 수 있는 칸 정보 메이킹 메소드 호츨
    }

    // TODO: 건널 수 있는 칸 초기화 메소드
    private ArrayList<BridgeOption> initializeBridge() {
        // 브릿지 넘버 제너레이터로 다리 만들기
        return new ArrayList<BridgeOption>();
    }
}
