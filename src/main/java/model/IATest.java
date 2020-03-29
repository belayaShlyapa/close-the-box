package main.java.model;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import main.java.launch.Launch;
import org.junit.jupiter.api.Test;



import java.util.ArrayList;
import java.util.List;

class IATest {

    @Test
    public void testA() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                new JFXPanel(); // Initializes the JavaFx Platform
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                        try {
                            new Launch().start(new Stage()); // Create and
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        // initialize
                        // your app.
                        IA ia = new IA();
                        List<CheckBox> checkBoxList = new ArrayList();
                        checkBoxList.add(new CheckBox());             // 1
                        checkBoxList.add(new CheckBox());   // 2
                        checkBoxList.add(new CheckBox());   // 3
                        checkBoxList.add(null);             // 4
                        checkBoxList.add(null);   // 5
                        checkBoxList.add(null);   // 6
                        checkBoxList.add(null);             // 7
                        checkBoxList.add(null);   // 8
                        checkBoxList.add(null);             // 9

                        List<Integer> integerList = ia.createIntegerListThatCanBeActivated(checkBoxList);

                        ia.endOfTheGame(7, checkBoxList);

                    }
                });
            }
        });
        thread.start();// Initialize the thread
        Thread.sleep(2500); // Time to use the app, with out this, the thread
        // will be killed before you can tell.
    }

   // @Test
   // public void shoudlReturnElevenAdders(){
   //     IA ia = new IA();
   //     List<CheckBox> checkBoxList = new ArrayList();
   //     ia.endOfTheGame(5)


   // }

   //@Test
   //public void shouldReturnOnlyValuesOfNotNullCheckboxList(){

   //    List<CheckBox> checkBoxList = new ArrayList();
   //    CheckBox cb = new CheckBox();
   //    checkBoxList.add(cb);
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());
   //    checkBoxList.add(new CheckBox());

   //    System.out.println(checkBoxList.get(5));
   //}
}