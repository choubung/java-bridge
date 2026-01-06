package bridge;

import bridge.controller.MainController;
import bridge.service.BridgeGame;

public class Application {

    public static void main(String[] args) {
        BridgeGame bridgeGame = new BridgeGame();
        MainController mainController = new MainController(bridgeGame);
    }
}
