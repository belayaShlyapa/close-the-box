package main.java.model;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class Model {
    public static final String CHANGE_FIRST_DICE = "First dice";
    public static final String CHANGE_SECOND_DICE = "Second dice";
    public static final String CHANGE_SELECTED_CHECKBOX_SUM = "Selected CheckBox Sum";
    private int diceSum;
    private int selectedCheckBoxSum;
    private PropertyChangeSupport support;
    private List<CheckBox> checkBoxThatCanBeActivatedList;
    private Button validateButton;


    public Model(List<CheckBox> checkBoxThatCanBeActivatedList) {
        this.selectedCheckBoxSum = 0;
        this.diceSum = 0;
        support = new PropertyChangeSupport(this);
        this.checkBoxThatCanBeActivatedList = checkBoxThatCanBeActivatedList;
    }

    public void rollDice(){
        int dice_1 = (int)(Math.random() * 6 + 1);
        support.firePropertyChange(CHANGE_FIRST_DICE, null, dice_1);

        int dice_2 = (int)(Math.random() * 6 + 1);
        support.firePropertyChange(CHANGE_SECOND_DICE, null, dice_2);

        setDiceSum(dice_1 + dice_2);
    }

    public void addSelectedCheckBoxValueToSelectedCheckBoxSum(CheckBox tickedCheckBox) {

            int oldSelectedCheckBoxSum = this.selectedCheckBoxSum;
            this.selectedCheckBoxSum += checkBoxThatCanBeActivatedList.indexOf(tickedCheckBox) + 1;
            support.firePropertyChange(CHANGE_SELECTED_CHECKBOX_SUM, oldSelectedCheckBoxSum, selectedCheckBoxSum);
    }

    public void substractSelectedCheckBoxValueToSelectedCheckBoxSum(CheckBox tickedCheckBox) {

            int oldSelectedCheckBoxSum = this.selectedCheckBoxSum;
            this.selectedCheckBoxSum -= checkBoxThatCanBeActivatedList.indexOf(tickedCheckBox) + 1;
            support.firePropertyChange(CHANGE_SELECTED_CHECKBOX_SUM, oldSelectedCheckBoxSum, selectedCheckBoxSum);
    }

    public void addObserver(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public int getSelectedCheckBoxSum(){
        return this.getSelectedCheckBoxSum();
    }

    public void setSelectedCheckBoxSum(int selectedCheckBoxSum){
        this.selectedCheckBoxSum = selectedCheckBoxSum;
    }

    public int getDiceSum() {
        return diceSum;
    }

    public void setDiceSum(int diceSum) {
        this.diceSum = diceSum;
    }

    public List<CheckBox> getCheckBoxThatCanBeActivatedList(){
        return this.checkBoxThatCanBeActivatedList;
    }

    public void clickValidate() {
        int oldSelectedCheckBoxSum = this.selectedCheckBoxSum;
        this.selectedCheckBoxSum = 0;
        support.firePropertyChange(CHANGE_SELECTED_CHECKBOX_SUM, oldSelectedCheckBoxSum, selectedCheckBoxSum);

        for (CheckBox cb : checkBoxThatCanBeActivatedList){
            if(cb != null && cb.isSelected()){
                checkBoxThatCanBeActivatedList.set(checkBoxThatCanBeActivatedList.indexOf(cb), null);
            }
        }
    }
}
