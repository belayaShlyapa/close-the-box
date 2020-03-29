package main.java.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.java.view.PrincipalWindow;

import java.io.IOException;

public class PlayersWindowsController {

    public void clickNbPlayerButton(TextField nbbPlayersTextField, Stage playerStage) throws IOException {
        int nbPlayers;
        try{
            nbPlayers = Integer.parseInt(nbbPlayersTextField.getText());
            if(nbPlayers <= 0){
                throw new NumberFormatException();
            }else{
                PrincipalWindow pw = new PrincipalWindow();
                Stage principalStage = new Stage();

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/PrincipalWindow.fxml"));
                loader.setController(pw);
                Parent root = loader.load();
                Scene scene = new Scene(root);
                principalStage.setTitle("Jeu de la boite");
                principalStage.setScene(scene);
                principalStage.show();
                playerStage.close();
            }

        }
        catch (NumberFormatException e){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Veuillez saisir une valeur supérieure à 0");
            a.show();
        }
    }
}
