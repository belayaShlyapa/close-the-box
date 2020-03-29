package main.java.controller;

import javafx.beans.property.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import main.java.model.DisplayDice;
import main.java.model.IA;
import main.java.model.Model;
import main.java.view.PrincipalWindow;

import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.List;

public class PrincipalWindowController implements PropertyChangeListener {

    private Model model;
    boolean enfOfGame;
    IA ia;
    List<Circle> circleListOfFirstDice;
    List<Circle> circleListOfSecondDice;
    DisplayDice displayDice = new DisplayDice();
    Stage stage;

    private BooleanProperty selectedCheckBoxSumModel = new SimpleBooleanProperty(true);
        public BooleanProperty selectedCheckBoxSumModelProperty() { return selectedCheckBoxSumModel; }
        public boolean getSelectedCheckBoxSumModel() { return selectedCheckBoxSumModel.get(); }
        public void setSelectedCheckBoxSumModel(boolean selectedCheckBoxSumModel) { this.selectedCheckBoxSumModel.set(selectedCheckBoxSumModel); }

    public PrincipalWindowController(List<CheckBox> checkBoxList, List<Circle> circleListOfFirstDice, List<Circle> circleListOfSecondDice){
         model = new Model(checkBoxList);
         model.addObserver(this);
        System.out.println("selectedCheckBoxSumModel : " + selectedCheckBoxSumModel);
        enfOfGame = false;
         ia = new IA();
        this.circleListOfFirstDice = circleListOfFirstDice;
        this.circleListOfSecondDice = circleListOfSecondDice;
        this.stage = new Stage();
    }

    public void rollDice(){
        model.rollDice();

        //createListOf


        if(ia.endOfTheGame(model.getDiceSum(), model.getCheckBoxThatCanBeActivatedList())){
            System.out.println("Fin de la partie");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        if(pce.getPropertyName().equals(Model.CHANGE_FIRST_DICE)) {
            displayDice.display((int)pce.getNewValue(), this.circleListOfFirstDice);

        }else if(pce.getPropertyName().equals(Model.CHANGE_SECOND_DICE)){
            displayDice.display((int)pce.getNewValue(), this.circleListOfSecondDice);
        }else if(pce.getPropertyName().equals(Model.CHANGE_SELECTED_CHECKBOX_SUM)){
            if(pce.getNewValue().equals(model.getDiceSum())){
                setSelectedCheckBoxSumModel(false);
            }else{
                setSelectedCheckBoxSumModel(true);
            }
        }
    }

    public void checkCheckBox(CheckBox tickedCheckBox) {
        if(tickedCheckBox.isSelected()){ // If checkBox become selected
            model.addSelectedCheckBoxValueToSelectedCheckBoxSum(tickedCheckBox);
        }else{ // if checkBox become deselected
            model.substractSelectedCheckBoxValueToSelectedCheckBoxSum(tickedCheckBox);
        }
    }

    public void disableRollButton(Button rollButton) {
        rollButton.setDisable(true);
    }

    public void activateCheckBox() {
            for(CheckBox cb : model.getCheckBoxThatCanBeActivatedList()){
                if(cb != null){
                    cb.setDisable(false);
                }
            }
    }

    public void clickValidate(Button rollButton) {
        for(CheckBox cb : model.getCheckBoxThatCanBeActivatedList()){
            if(cb != null){
                cb.setDisable(true);
            }
        }
        model.clickValidate();
        rollButton.setDisable(false);
    }
}
