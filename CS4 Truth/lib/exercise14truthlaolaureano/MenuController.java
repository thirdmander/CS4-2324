package lib.exercise14truthlaolaureano;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.css.Styleable;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Lauan 03
 */
public class MenuController implements Initializable {
    
    @FXML private ImageView icon1, icon2, icon3;
    @FXML private Button prev, next;
    
    private int page;
    private int maxPage;
    private ArrayList<ImageView> iconList;
    Subject displayedSubject;

    @FXML private void next(){
        clearIcons();
        page++;
        setSubjectIcons();
        checkLimit();
    }
    
    @FXML private void previous(){
        clearIcons();
        page--;
        setSubjectIcons();
        checkLimit();
    }

    @FXML private void openFirstSubject(Event event) throws IOException {
        int subjIndex = 0;
        for(int i = 0; i < maxPage; i++) {
            if (i == page){
                displayedSubject = Subject.getSubjectByIndex(subjIndex);
            } else {
                subjIndex += 3;
            }
        }

        Node node = (Node) event.getSource();
        Scene currScene = node.getScene();
        Stage currStage = (Stage) currScene.getWindow();
    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root = loader.load();
        Exer13Controller controller = loader.getController();
        controller.display(displayedSubject);

        Scene subjectScene = new Scene(root);
        currStage.hide();
        currStage.setScene(subjectScene);
        currStage.show();
    }

    @FXML private void openSecondSubject(Event event) throws IOException {
        int subjIndex = 1;
        for(int i = 0; i < maxPage; i++) {
            if (i == page){
                displayedSubject = Subject.getSubjectByIndex(subjIndex);
            } else {
                subjIndex = subjIndex + 3;
            }
        }

        Node node = (Node) event.getSource();
        Scene currScene = node.getScene();
        Stage currStage = (Stage) currScene.getWindow();
    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root = loader.load();
        Exer13Controller controller = loader.getController();
        controller.display(displayedSubject);

        Scene subjectScene = new Scene(root);
        currStage.hide();
        currStage.setScene(subjectScene);
        currStage.show();
    }

    @FXML private void openThirdSubject(Event event) throws IOException {
        int subjIndex = 2;
        for(int i = 0; i < maxPage; i++) {
            if (i == page){
                displayedSubject = Subject.getSubjectByIndex(subjIndex);
            } else {
                subjIndex = subjIndex + 3;
            }
        }

        Node node = (Node) event.getSource();
        Scene currScene = node.getScene();
        Stage currStage = (Stage) currScene.getWindow();
    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root = loader.load();
        Exer13Controller controller = loader.getController();
        controller.display(displayedSubject);

        Scene subjectScene = new Scene(root);
        currStage.hide();
        currStage.setScene(subjectScene);
        currStage.show();
    }
    
    public void setSubjectIcons(){
        int index = page*3;
        for(int i=0; i<iconList.size(); i++){
            try{
                Subject s = Subject.getSubjectByIndex(index + i);
                Image img = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
                iconList.get(i).setImage(img);
            }
            catch(IndexOutOfBoundsException e){
                Image img = new Image(getClass().getResourceAsStream("imgs/empty.png"));
                iconList.get(i).setImage(img);
            }
        }
    }
    
    public void checkLimit(){
        if(page == maxPage) next.setDisable(true);
        else next.setDisable(false);
        if(page == 0) prev.setDisable(true);
        else prev.setDisable(false);
    }
    
    public void clearIcons(){
        for(ImageView i : iconList){
            i.setImage(null);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iconList = new ArrayList();
        iconList.add(icon1);
        iconList.add(icon2);
        iconList.add(icon3);
        page = 0;
        maxPage = Subject.getListLength()/3;
        setSubjectIcons();
        checkLimit();
    }    
    
}
