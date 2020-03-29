package main.java.stub;

import javafx.scene.control.CheckBox;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

public class Stub {

    public List<CheckBox> createCheckBoxList(CheckBox checkBox_1, CheckBox checkBox_2, CheckBox checkBox_3,
                                                    CheckBox checkBox_4, CheckBox checkBox_5, CheckBox checkBox_6,
                                                    CheckBox checkBox_7, CheckBox checkBox_8, CheckBox checkBox_9){
        List<CheckBox> checkBoxList = new ArrayList<>();
        checkBoxList.add(checkBox_1);
        checkBoxList.add(checkBox_2);
        checkBoxList.add(checkBox_3);
        checkBoxList.add(checkBox_4);
        checkBoxList.add(checkBox_5);
        checkBoxList.add(checkBox_6);
        checkBoxList.add(checkBox_7);
        checkBoxList.add(checkBox_8);
        checkBoxList.add(checkBox_9);

        return checkBoxList;
    }

    public List<Circle> createCircleListOfFirstDice(Circle circleTopLeftFirstDice, Circle circleTopRightFirstDice,
                                                           Circle circleMiddleLeftFirstDice, Circle circleMiddleMiddleFirstDice, Circle circleMiddleRightFirstDice,
                                                           Circle circleBottomLeftFirstDice, Circle circleBottomRightFirstDice){
        List<Circle> circlesOfFirstDice = new ArrayList();
        circlesOfFirstDice.add(circleTopLeftFirstDice);
        circlesOfFirstDice.add(circleTopRightFirstDice);
        circlesOfFirstDice.add(circleMiddleLeftFirstDice);
        circlesOfFirstDice.add(circleMiddleMiddleFirstDice);
        circlesOfFirstDice.add(circleMiddleRightFirstDice);
        circlesOfFirstDice.add(circleBottomLeftFirstDice);
        circlesOfFirstDice.add(circleBottomRightFirstDice);
        return  circlesOfFirstDice;
    }

    public List<Circle> createCircleListOfSecondDice(Circle circleTopLeftSecondDice, Circle circleTopRightSecondDice,
                                                           Circle circleMiddleLeftSecondDice, Circle circleMiddleMiddleSecondDice, Circle circleMiddleRightSecondDice,
                                                           Circle circleBottomLeftSecondDice, Circle circleBottomRightSecondDice){
        List<Circle> circlesOfSecondDice = new ArrayList();
        circlesOfSecondDice.add(circleTopLeftSecondDice);
        circlesOfSecondDice.add(circleTopRightSecondDice);
        circlesOfSecondDice.add(circleMiddleLeftSecondDice);
        circlesOfSecondDice.add(circleMiddleMiddleSecondDice);
        circlesOfSecondDice.add(circleMiddleRightSecondDice);
        circlesOfSecondDice.add(circleBottomLeftSecondDice);
        circlesOfSecondDice.add(circleBottomRightSecondDice);
        return  circlesOfSecondDice;
    }

}
