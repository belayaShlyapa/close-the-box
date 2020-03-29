package main.java.model;

import javafx.scene.shape.Circle;

import java.util.List;

public class DisplayDice {

    public void display(int diceValue, List<Circle> circleList){
        switch (diceValue){
            case 1:
                diceValue_1(circleList);
                break;
            case 2:
                diceValue_2(circleList);
                break;
            case 3:
                diceValue_3(circleList);
                break;
            case 4:
                diceValue_4(circleList);
                break;
            case 5:
                diceValue_5(circleList);
                break;
            case 6:
                diceValue_6(circleList);
                break;
        }
    }

    // 1
    private void diceValue_1(List<Circle> circleList){
        circleList.get(0).setVisible(false);
        circleList.get(1).setVisible(false);
        circleList.get(2).setVisible(false);
        circleList.get(3).setVisible(true);
        circleList.get(4).setVisible(false);
        circleList.get(5).setVisible(false);
        circleList.get(6).setVisible(false);
    }
    // 2
    private void diceValue_2(List<Circle> circleList){
        circleList.get(0).setVisible(true);
        circleList.get(1).setVisible(false);
        circleList.get(2).setVisible(false);
        circleList.get(3).setVisible(false);
        circleList.get(4).setVisible(false);
        circleList.get(5).setVisible(false);
        circleList.get(6).setVisible(true);
    }
    // 3
    private void diceValue_3(List<Circle> circleList){
        circleList.get(0).setVisible(false);
        circleList.get(1).setVisible(true);
        circleList.get(2).setVisible(false);
        circleList.get(3).setVisible(true);
        circleList.get(4).setVisible(false);
        circleList.get(5).setVisible(true);
        circleList.get(6).setVisible(false);
    }
    // 4
    private void diceValue_4(List<Circle> circleList){
        circleList.get(0).setVisible(true);
        circleList.get(1).setVisible(true);
        circleList.get(2).setVisible(false);
        circleList.get(3).setVisible(false);
        circleList.get(4).setVisible(false);
        circleList.get(5).setVisible(true);
        circleList.get(6).setVisible(true);
    }
    // 5
    private void diceValue_5(List<Circle> circleList){
        circleList.get(0).setVisible(true);
        circleList.get(1).setVisible(true);
        circleList.get(2).setVisible(false);
        circleList.get(3).setVisible(true);
        circleList.get(4).setVisible(false);
        circleList.get(5).setVisible(true);
        circleList.get(6).setVisible(true);
    }
    // 6
    private void diceValue_6(List<Circle> circleList){
        circleList.get(0).setVisible(true);
        circleList.get(1).setVisible(true);
        circleList.get(2).setVisible(true);
        circleList.get(3).setVisible(false);
        circleList.get(4).setVisible(true);
        circleList.get(5).setVisible(true);
        circleList.get(6).setVisible(true);
    }
}
