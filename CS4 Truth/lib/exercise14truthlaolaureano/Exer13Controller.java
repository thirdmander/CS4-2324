package lib.exercise14truthlaolaureano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Exer13Controller {
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
    public void display(Subject s){
        Image img = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
        currentSubject.setText(s.getName());
        currentUnits.setText(Double.toString(s.getUnits()));
        currentGrades.setText(Double.toString(s.getGrade()));
        currentImg.setImage(img);
        displayedSubject = s;

        currentIndex = Subject.getSubjectIndex(s);
        if(currentIndex > 0) {
            prevButton.setDisable(false);
        } else if (currentIndex == 0) {
            prevButton.setDisable(true);
        } else if(currentIndex == Subject.subjectList.size() - 1) {
        nextButton.setDisable(true);
        }
    }

    @FXML
    public void nextSubject(ActionEvent event) {
        currentIndex = Subject.getSubjectIndex(displayedSubject);
        currentIndex++;
        prevButton.setDisable(false);
        if(currentIndex == Subject.subjectList.size() - 1) {
            nextButton.setDisable(true);
        }
        displayedSubject = Subject.subjectList.get(currentIndex);

        display(displayedSubject);
    }

    @FXML
    public void prevSubject(ActionEvent event) {
        currentIndex = Subject.getSubjectIndex(displayedSubject);
        currentIndex--;
        nextButton.setDisable(false);
        if(currentIndex == 0){
            prevButton.setDisable(true);
        }  
        if(currentIndex == Subject.subjectList.size() - 1){
            nextButton.setDisable(true);
        }
        displayedSubject = Subject.subjectList.get(currentIndex);

        display(displayedSubject);
    }

    @FXML
    public void searchSubj(ActionEvent event) {
        String userInput = searchText.getText();
        notFound.setText(" ");
        try{
        displayedSubject = Subject.searchSubject(userInput);
        currentIndex = Subject.getSubjectIndex(userInput);
        if(currentIndex == 0){
            prevButton.setDisable(true);
        }  

        }catch(NullPointerException e){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText("Error");
            alert.setContentText("Subject not found...");

            alert.showAndWait();
            notFound.setText("Subject not found.");
        }
        display(displayedSubject);
    }

    @FXML
    void initialize(){
        prevButton.setDisable(true);
    }
}
