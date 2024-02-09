import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainSceneController {
    Subject math = new Subject("Math", "math.png", 4, 1.75);
    Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
    Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
    Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
    Subject cs = new Subject("CS", "computer science.png", 1, 1.5);

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label currentSubject;

    @FXML
    private ImageView currentImg;

    @FXML
    private Label currentUnits;

    @FXML
    private Label currentGrades;

    @FXML
    private Button nextButton;

    @FXML
    private void nextSubject(ActionEvent event) {
        Subject displayedSubject = bio;

        Image img = new Image(displayedSubject.getImgFileName());
        currentSubject.setText(displayedSubject.getName());
        currentUnits.setText(Double.toString(displayedSubject.getUnits()));
        currentGrades.setText(Double.toString(displayedSubject.getGrade()));
        currentImg.setImage(img);
    }
    
    @FXML
    void initialize() {
        Subject displayedSubject = math;

        Image img = new Image(displayedSubject.getImgFileName());
        currentSubject.setText(displayedSubject.getName());
        currentUnits.setText(Double.toString(displayedSubject.getUnits()));
        currentGrades.setText(Double.toString(displayedSubject.getGrade()));
        currentImg.setImage(img);

        assert currentSubject != null : "fx:id=\"currentSubject\" was not injected: check your FXML file 'View.fxml'.";
        assert currentImg != null : "fx:id=\"currentImg\" was not injected: check your FXML file 'View.fxml'.";
        assert currentUnits != null : "fx:id=\"currentUnits\" was not injected: check your FXML file 'View.fxml'.";
        assert currentGrades != null : "fx:id=\"currentGrades\" was not injected: check your FXML file 'View.fxml'.";
        assert nextButton != null : "fx:id=\"nextButton\" was not injected: check your FXML file 'View.fxml'.";
    }

}
