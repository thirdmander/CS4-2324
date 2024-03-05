import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exer13Controller {
    Subject math = new Subject("Math", "math.png", 4, 1.75);
    Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
    Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
    Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
    Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
    Subject displayedSubject;
    int currentIndex;

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
    private Button prevButton;

    @FXML
    private TextField searchText;

    @FXML
    private Button searchButton;

    @FXML
    private Label notFound;

    @FXML
    void display(Subject s){
        Image img = new Image(displayedSubject.getImgFileName());
        currentSubject.setText(displayedSubject.getName());
        currentUnits.setText(Double.toString(displayedSubject.getUnits()));
        currentGrades.setText(Double.toString(displayedSubject.getGrade()));
        currentImg.setImage(img);
    }

    @FXML
    void nextSubject(ActionEvent event) {
        currentIndex = Subject.getSubjectIndex(displayedSubject);
        currentIndex++;
        prevButton.setDisable(false);
        if(currentIndex == 4){
            nextButton.setDisable(true);
        }
        displayedSubject = Subject.subjectList.get(currentIndex);

        display(displayedSubject);
    }

    @FXML
    void prevSubject(ActionEvent event) {
        currentIndex = Subject.getSubjectIndex(displayedSubject);
        currentIndex--;
        nextButton.setDisable(false);
        if(currentIndex == 0){
            prevButton.setDisable(true);
        }  
        displayedSubject = Subject.subjectList.get(currentIndex);

        display(displayedSubject);
    }

    @FXML
    void searchSubj(ActionEvent event) {
        String userInput = searchText.getText();
        notFound.setText(" ");
        try{
        displayedSubject = Subject.searchSubject(userInput);
        }catch(NullPointerException e){
            notFound.setText("Subject not found.");
        }
        display(displayedSubject);
    }

    @FXML
    void initialize(){
        displayedSubject = math;
        prevButton.setDisable(true);
        display(math);
    }
}
