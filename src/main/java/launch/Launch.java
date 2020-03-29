package main.java.launch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.view.PlayersWindow;
import main.java.view.PrincipalWindow;

public class Launch extends Application {


    @Override
    public void start(Stage stage) throws Exception {
       // PrincipalWindow pw = new PrincipalWindow();
       // FXMLLoader loader = new FXMLLoader(getClass().getResource("/PrincipalWindow.fxml"));
       // loader.setController(pw);
       // Parent root = loader.load();
       // Scene scene = new Scene(root);
//
       // stage.setTitle("Jeu de la boite");
       // stage.setScene(scene);
       // stage.show();

        PlayersWindow playersWindow = new PlayersWindow(stage);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/PlayersWindow.fxml"));
        loader.setController(playersWindow);

        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Choix du nombre de joueur");
        stage.show();

    }
}
