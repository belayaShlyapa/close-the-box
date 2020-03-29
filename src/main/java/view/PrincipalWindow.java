package main.java.view;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Circle;
import main.java.controller.PrincipalWindowController;
import main.java.stub.Stub;

import java.io.IOException;
import java.util.List;

public class PrincipalWindow {

    @FXML
    private CheckBox checkBox_1;
    @FXML
    private CheckBox checkBox_2;
    @FXML
    private CheckBox checkBox_3;
    @FXML
    private CheckBox checkBox_4;
    @FXML
    private CheckBox checkBox_5;
    @FXML
    private CheckBox checkBox_6;
    @FXML
    private CheckBox checkBox_7;
    @FXML
    private CheckBox checkBox_8;
    @FXML
    private CheckBox checkBox_9;
    @FXML
    private Button validateButton;
    @FXML
    private Button rollButton;

    @FXML
    private Circle circleTopLeftFirstDice, circleTopRightFirstDice,
            circleMiddleLeftFirstDice, circleMiddleMiddleFirstDice, circleMiddleRightFirstDice,
            circleBottomLeftFirstDice, circleBottomRightFirstDice;

    @FXML
    private Circle circleTopLeftSecondDice, circleTopRightSecondDice,
            circleMiddleLeftSecondDice, circleMiddleMiddleSecondDice, circleMiddleRightSecondDice,
            circleBottomLeftSecondDice, circleBottomRightSecondDice;

    private List<CheckBox> checkBoxeList;

    PrincipalWindowController principalController;
    Stub stub = new Stub();

    public void initialize() {
        principalController = new PrincipalWindowController(stub.createCheckBoxList(checkBox_1, checkBox_2, checkBox_3, checkBox_4, checkBox_5,
                checkBox_6, checkBox_7, checkBox_8, checkBox_9),
                stub.createCircleListOfFirstDice(circleTopLeftFirstDice, circleTopRightFirstDice,
                        circleMiddleLeftFirstDice, circleMiddleMiddleFirstDice, circleMiddleRightFirstDice,
                        circleBottomLeftFirstDice, circleBottomRightFirstDice),
                stub.createCircleListOfSecondDice(circleTopLeftSecondDice, circleTopRightSecondDice,
                        circleMiddleLeftSecondDice, circleMiddleMiddleSecondDice, circleMiddleRightSecondDice,
                        circleBottomLeftSecondDice, circleBottomRightSecondDice));
        validateButton.disableProperty().bind(principalController.selectedCheckBoxSumModelProperty());
    }

    @FXML
    private void rollDice() {
        principalController.rollDice();
        principalController.disableRollButton(rollButton);
        principalController.activateCheckBox();
    }

    @FXML
    private void checkCheckBox(ActionEvent event){
        principalController.checkCheckBox((CheckBox)event.getSource());
    }

    @FXML
    private void clickValidate(){
        principalController.clickValidate(rollButton);
        System.out.println(7 / 2);
    }
}
