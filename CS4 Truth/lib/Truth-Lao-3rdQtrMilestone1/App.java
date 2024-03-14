import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //title screen has buttons that open other screens however the other screens aren't finished yet
        Parent root = FXMLLoader.load(getClass().getResource("TitleScreen.fxml"));
        Scene scene = new Scene(root);
      
        primaryStage.setTitle("Milestone 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
 public static void main(String[] args) {
        launch(args);
    }
}