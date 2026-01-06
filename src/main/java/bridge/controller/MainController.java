package bridge.controller;

import bridge.service.BridgeGame;
import bridge.view.InputView;
import bridge.view.OutputView;

public class MainController {
    private final InputView inputView;
    private final OutputView outputView;

    public MainController(BridgeGame bridgeGame) {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        // TODO: 1. 다리 길이 입력 받기
        retryUntilValid(this::startGame);

        // TODO: 2. Play Game (이동할 칸 선택 (반복) + 결과 출력 + 재시도/종료 여부 입력)
        retryUntilValid(this::playGame);

        // TODO: 3. 최종 게임 결과 출력
        retryUntilValid(this::endGame);
    }

    private void startGame() {
        int bridgeLen = inputView.readBridgeSize();
    }

    private void playGame() {
        // 선택
        String move = inputView.readMoving();

        // 선택이 옳은지 판별해서
            // 옳으면
                // move
            // 틀리면
                // 재시작
                String command = inputView.readGameCommand();
    }

    private void endGame() {

    }

    private <T> T retryUntilValid(java.util.function.Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }

    private void retryUntilValid(Runnable action) {
        while (true) {
            try {
                action.run();
                return;
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }
}