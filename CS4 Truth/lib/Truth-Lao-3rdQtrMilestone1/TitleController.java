import java.io.IOException;

import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TitleController {

    @FXML
    private ImageView bgTitleImage;

    @FXML
    private Label title;

    @FXML
    private Button startButton, settingsButton, exitButton;

    @FXML
    private void startGame(Event event) throws IOException{
        Node node = (Node) event.getSource();
        Scene currScene = node.getScene();
        Stage currStage = (Stage) currScene.getWindow();
    
        //main screen is a draft for now, not fully encoded yet
        Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));

        Scene mainScene = new Scene(root);
        currStage.hide();
        currStage.setScene(mainScene);
        currStage.show();
    }

    @FXML
    private void settingsMenu(Event event) throws IOException{
        Node node = (Node) event.getSource();
        Scene currScene = node.getScene();
        Stage currStage = (Stage) currScene.getWindow();
    
        // the settings screen hasn't been made yet
        Parent root = FXMLLoader.load(getClass().getResource("SettingsScreen.fxml"));

        Scene settingsScene = new Scene(root);
        currStage.hide();
        currStage.setScene(settingsScene);
        currStage.show();
    }

    @FXML
    private void exitGame(Event event) throws IOException{
        Platform.exit();
    }
}
