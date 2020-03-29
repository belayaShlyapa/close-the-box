package main.java.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.java.controller.PlayersWindowsController;

import java.io.IOException;

public class PlayersWindow {

    Stage stage;

    @FXML
    TextField nbbPlayersTextField;

    @FXML
    Button nbPlayersButton;

    PlayersWindowsController playerController;

    public PlayersWindow(Stage stage){
        this.stage = stage;
        playerController = new PlayersWindowsController();
    }

    public void clickNbPlayerButton() throws IOException {
        playerController.clickNbPlayerButton(nbbPlayersTextField, stage);
    }
}
