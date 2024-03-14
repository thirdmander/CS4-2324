package lib.exercise14truthlaolaureano;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lauan 03
 */
public class FXExer14 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        new Subject("Math", "math.png", 4, 1.75);
        new Subject("Biology", "biology.png", 3, 2.0);
        new Subject("Chemistry", "chemistry.png", 3, 1.5);
        new Subject("Physics", "physics.png", 3, 1.75);
        new Subject("Computer Science", "computer science.png", 1, 1.5);
        new Subject("Social Science", "social science.png", 1, 1.5);
        new Subject("English", "english.png", 1, 1.75);
        new Subject("Research", "research.png", 5, 1.5);
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
