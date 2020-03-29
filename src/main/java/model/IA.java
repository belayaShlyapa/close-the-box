package main.java.model;

import javafx.scene.control.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class IA {

    public boolean endOfTheGame(int diceSum, List<CheckBox> checkBoxThatCanBeActivatedList) {
        List<List<Integer>> addersListOfDiceSum = createAddersListOfDiceSum(diceSum);
        List<Integer> integersThatCanBeActivatedList = createIntegerListThatCanBeActivated(checkBoxThatCanBeActivatedList);

        int nbNumber = 0;

        for(int row = 0; row < addersListOfDiceSum.size(); row ++){
            for(int column = 0; column < addersListOfDiceSum.get(row).size(); column ++){
                if((column % (row + 1)) == 0){
                    nbNumber = 0;
                }
                if(integersThatCanBeActivatedList.contains(addersListOfDiceSum.get(row).get(column))){
                    nbNumber += 1;
                    if(nbNumber == (row + 1)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public List<Integer> createIntegerListThatCanBeActivated(List<CheckBox> checkBoxThatCanBeActivatedList){
        List<Integer> itcbal = new ArrayList();
        for(CheckBox cb : checkBoxThatCanBeActivatedList){
            if (cb != null){
                itcbal.add(checkBoxThatCanBeActivatedList.indexOf(cb) + 1);
            }
        }

        return itcbal;
    }

    private List<List<Integer>> createAddersListOfDiceSum(int diceSum) {
        List<List<Integer>> alods = new ArrayList();
        List<Integer> alods_0 = new ArrayList();
        List<Integer> alods_1 = new ArrayList();
        List<Integer> alods_2 = new ArrayList();
        List<Integer> alods_3 = new ArrayList();

        switch (diceSum) {
            case 12:
                alods_1.add(3); alods_1.add(9);
                alods_1.add(4); alods_1.add(8);
                alods_1.add(5); alods_1.add(7);
                alods_2.add(1); alods_2.add(2); alods_2.add(9);
                alods_2.add(1); alods_2.add(3); alods_2.add(8);
                alods_2.add(1); alods_2.add(4); alods_2.add(7);
                alods_2.add(1); alods_2.add(5); alods_2.add(6);
                alods_2.add(2); alods_2.add(3); alods_2.add(7);
                alods_2.add(2); alods_2.add(4); alods_2.add(6);
                alods_2.add(3); alods_2.add(4); alods_2.add(5);
                alods_3.add(1); alods_3.add(2); alods_3.add(4); alods_3.add(5);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 11:
                alods_1.add(2); alods_1.add(9);
                alods_1.add(3); alods_1.add(8);
                alods_1.add(4); alods_1.add(7);
                alods_1.add(5); alods_1.add(6);
                alods_2.add(1); alods_2.add(2); alods_2.add(8);
                alods_2.add(1); alods_2.add(4); alods_2.add(6);
                alods_2.add(2); alods_2.add(3); alods_2.add(6);
                alods_2.add(2); alods_2.add(4); alods_2.add(5);
                alods_3.add(1); alods_3.add(2); alods_3.add(3); alods_3.add(5);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 10:
                alods_1.add(1); alods_1.add(9);
                alods_1.add(2); alods_1.add(8);
                alods_1.add(3); alods_1.add(7);
                alods_1.add(4); alods_1.add(6);
                alods_2.add(1); alods_2.add(2); alods_2.add(7);
                alods_2.add(1); alods_2.add(4); alods_2.add(5);
                alods_2.add(2); alods_2.add(3); alods_2.add(5);
                alods_3.add(1); alods_3.add(2); alods_3.add(3); alods_3.add(4);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 9:
                alods_0.add(9);
                alods_1.add(1); alods_1.add(8);
                alods_1.add(2); alods_1.add(7);
                alods_1.add(3); alods_1.add(6);
                alods_1.add(4); alods_1.add(5);
                alods_2.add(1); alods_2.add(2); alods_2.add(6);
                alods_2.add(1); alods_2.add(3); alods_2.add(5);
                alods_2.add(2); alods_2.add(3); alods_2.add(4);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 8:
                alods_0.add(8);
                alods_1.add(1); alods_1.add(7);
                alods_1.add(2); alods_1.add(6);
                alods_1.add(3); alods_1.add(5);
                alods_2.add(1); alods_2.add(2); alods_2.add(5);
                alods_2.add(1); alods_2.add(3); alods_2.add(4);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 7:
                alods_0.add(7);
                alods_1.add(1); alods_1.add(6);
                alods_1.add(2); alods_1.add(5);
                alods_1.add(3); alods_1.add(4);
                alods_2.add(1); alods_2.add(2); alods_2.add(4);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 6:
                alods_0.add(6);
                alods_1.add(1); alods_1.add(5);
                alods_1.add(2); alods_1.add(4);
                alods_2.add(1); alods_2.add(2); alods_2.add(3);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 5:
                alods_0.add(5);
                alods_1.add(1); alods_1.add(4);
                alods_1.add(2); alods_1.add(3);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 4:
                alods_0.add(4);
                alods_1.add(1); alods_1.add(3);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 3:
                alods_0.add(3);
                alods_1.add(1); alods_1.add(2);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 2:
                alods_0.add(2);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
            case 1:
                alods_0.add(1);
                alods.add(alods_0); alods.add(alods_1); alods.add(alods_2); alods.add(alods_3);
                break;
        }
        return alods;
    }
}
