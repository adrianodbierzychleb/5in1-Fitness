package sample;

import com.sun.org.omg.CORBA.Initializer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class WorkoutController implements Initializable
{
    @FXML
    private Button backButton;

    @FXML private TextField searchByExercise;
    @FXML private TextField searchByType;
    @FXML private Button searchButton;
    @FXML private Label searchResults;

    @Override
    public void initialize(URL location, ResourceBundle rb) {


       /* Exercise ex1 = new Exercise(1, "Bench Press", "Chest");
        Exercise ex2 = new Exercise(2,"Leg Press", "Legs");

        ArrayList<Exercise> list = new ArrayList<Exercise>();
        list.add(ex1);
        list.add(ex2);*/
    }


    public void setSearchButton(ActionEvent event) throws IOException
    {
        System.out.println("Button pressed");
        //String checker = "";
        Exercise ex1 = new Exercise(1, "Bench Press", "Chest", "Using a barbell on a flat bench, the \nperson  lies down and moves the barbell \nby pushing it up from their chest up \nuntil the arms are straight.");
        Exercise ex2 = new Exercise(2,"Incline Bench Press", "Chest", "Same as the bench press, however \ninstead of a flat bench, the bench used \nis slightly inclined at a relatively \nsmall angle.");
        Exercise ex3 = new Exercise(3,"Dumbbell Press", "Chest", "Same previous two, however instead of using \na barbell, use one dumbbell in each hand, \nallowing variation as the weight \ndoes not need to be perpendicular to the body.");
        Exercise ex4 = new Exercise(4,"Dumbbell Fly", "Chest", "Using two dumbbells the person lies down, \nand starts in position with two straight \narms holding the dumbbells up, and \nproceeds to exercise by spreading the arms \nsideways as low as possible.");
        Exercise ex5 = new Exercise(5,"Push Ups", "Chest", "Easiest one as does not require any equipment, \nthe person lies down in horizontal position \nand lifts their body up only using \ntheir arms, and using the feet to support \nthe balance. ");
        Exercise ex6 = new Exercise(6,"Barbell row", "Back", "The user gets in to position, which is a lean \nforward so the angle between the top body and \nlegs is around 90 degrees and back \nis straight to avoid injury, and proceeds \nby lifting a barbell and pulling it towards \nhis chest.\n");
        Exercise ex7 = new Exercise(7,"Deadlift", "Back", "Works similar as the row, however the position \nis not kept constant, only starting position \nis the same, once lifting the barbell is \npulled and the person try’s to straighten \nup holding the barbell.");
        Exercise ex8 = new Exercise(8,"Pull Ups", "Back","Hang down on a pull up bar until the person’s \narms are not straight, and use their arms to \npull their chin above the bar.");
        Exercise ex9 = new Exercise(9,"Lateral Pull Down", "Back", "Done on a special machine, where the person \nsits down and pulls the bar towards their \nchest from above.");
        Exercise ex10 = new Exercise(10,"Machine Row", "Back", "Similar to barbell row, but is done siting \non a machine, where the person pulls a \nv-bar towards their chest. \n");
        Exercise ex11 = new Exercise(11,"Squat","Legs","Approach a squat rack, and place the loaded \nbarbell on your traps. Once loaded proceed \nto go down by bending your knees, \ntrying to go as low as possible.\n");
        Exercise ex12 = new Exercise(12, "Calf Raises","Legs","Holding two dumbbells in your hands, \nraise your body using your toes.");
        Exercise ex13 = new Exercise(13, "Lunges","Legs","Using two dumbbells walk up and down, \nput upon each step make sure your knee \ntouches the ground");
        Exercise ex14 = new Exercise(14, "Leg Press","Legs","Using the leg press machine, load \nit with desired weight, and while \nseated bush the weight away from each \nother using your legs.");
        Exercise ex15 = new Exercise(15,"Leg Extension","Legs","Using the leg extension machine, \nsit down on it, and bend your legs either \nback or forward, depending on the \nmachine variation.\n");
        Exercise ex16 = new Exercise(16, "Overhead Press","Shoulders","As the name suggests, start by \ngrabbing a barbell standing up, and lift \nit up until your arms are straight \nabove your head.");
        Exercise ex17 = new Exercise(17,"Shoulder Press","Shoulders","Similar to overhead press, but \nis carried out seated and using dumbbells.");
        Exercise ex18 = new Exercise(18,"Arnold Press","Shoulders","Identical as shoulder press, except \nfor the fact that the dumbbells are rotated \n180 degrees when lifting it up.");
        Exercise ex19 = new Exercise(19,"Shrugs","Shoulders","While holding two dumbbells in your arms, \nand with arms straight move your shoulders \nup and down.");
        Exercise ex20 = new Exercise(20,"Lateral Raises","Shoulders","While holding two dumbbells in your arms, \nlift them up along your body towards \nyour head.");
        Exercise ex21 = new Exercise(21,"Dumbbell Curls", "Biceps","While holding tow dumbbells, lift \nthem up by bending your arms in \nthe elbow.");
        Exercise ex22 = new Exercise(22, "Dumbbell Hammer Curls","Biceps","While holding tow dumbbells, lift \nthem up by bending your arms in the elbow, \ndifference in this is to make sure your \narms are twisted 90 degrees out wards, \nas if a hammer was to be held and used.");
        Exercise ex23 = new Exercise(23,"Cable Curls","Biceps","While holding a barbell lift it with \nyour arms, by bending them in your \nelbows.");
        Exercise ex24 = new Exercise(24,"Preacher Curls","Biceps","The same as barbell curls, except \nyou use a cable on a machine.\n");
        Exercise ex25 = new Exercise(25,"Barbell Curls","Biceps","While holding a barbell place your \narms on the preacher bench by leaning on \nthem with your upper arms, and lift the \nbarbell by bending your elbows.");
        Exercise ex26 = new Exercise(26,"French Press","Triceps","While holding a barbell and lying on \nyour back, lift it up until arms are straight, \nnext proceed with lowering it towards \nyour head by bending the elbows. ");
        Exercise ex27 = new Exercise(27,"Seated French Press","Triceps","As the name suggests, similar to the \nFrench press except seated, and instead \nof using a barbell use a dumbbell.");
        Exercise ex28 = new Exercise(28,"Dips","Triceps","Stand between two hand rail and grab \nthem with your arms, lift yourself \nin the air and proceed to lower your \nbody then go back up.");
        Exercise ex29 = new Exercise(29,"Cable Extension","Triceps","Using a machine, grab a cable and \npull it down with your arms by bending \nthe elbows.");
        Exercise ex30 = new Exercise(30,"Triceps Push Ups","Triceps","Sit down next to a bench with straight \nlegs, grab the bench behind you and proceed \nto lift your body up with your arms.");
        Exercise ex31 = new Exercise(31,"Crunches","ABS","Lay down and proceed to raise your \nupper body without the help of any limbs.");
        Exercise ex32 = new Exercise(32,"Bicycle Crunches","ABS","Lay down and raise your upper body \nas well as your knees towards the diagonal \nelbow.");
        Exercise ex33 = new Exercise(33,"Leg Raises","ABS","Lay down and precede to raise your legs \nup without the help of any limbs.");
        Exercise ex34 = new Exercise(34,"Torso bends on a Machine","ABS","Go on your knees, and grab a cable \nbehind your head, and proceed to lean \nforward.");
        Exercise ex35 = new Exercise(35,"Scissors","ABS","Lay down, and slightly raise your legs \nabove the ground, proceed to move them left \nand right alternating each leg on top.");


        ArrayList<Exercise> list = new ArrayList<>();
        list.add(ex1);
        list.add(ex2);
        list.add(ex3);
        list.add(ex4);
        list.add(ex5);
        list.add(ex6);
        list.add(ex7);
        list.add(ex8);
        list.add(ex9);
        list.add(ex10);
        list.add(ex11);
        list.add(ex12);
        list.add(ex13);
        list.add(ex14);
        list.add(ex15);
        list.add(ex16);
        list.add(ex17);
        list.add(ex18);
        list.add(ex19);
        list.add(ex20);
        list.add(ex21);
        list.add(ex22);
        list.add(ex23);
        list.add(ex24);
        list.add(ex25);
        list.add(ex26);
        list.add(ex27);
        list.add(ex28);
        list.add(ex29);
        list.add(ex30);
        list.add(ex31);
        list.add(ex32);
        list.add(ex33);
        list.add(ex34);
        list.add(ex35);

        if(searchByExercise.getText().equals(""))
        {
            setSearchByType(list);
        }
        else
        {
            setSearchByExercise(list);
        }

        /*for(int i = 0; i < list.size(); i++ )
        {
            System.out.println("loop");
            if(searchByExercise.getText().equals(list.get(i).getName()))
            {
                System.out.println("result");
                result = list.get(i).getName();
                break;
            }

        }
        if(result.equals(""))
        {
            searchResults.setText("No exercise found, try again.");
        }
        else {
            searchResults.setText(result);
        }*/

    }

    public void setSearchByType(ArrayList<Exercise> list)
    {
        System.out.println("type");
        ArrayList<Exercise> resultslist = new ArrayList<>();

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println("Loop type");
            if(searchByType.getText().toUpperCase().equals(list.get(i).getType().toUpperCase()))
            {
                resultslist.add(list.get(i));
            }
        }

        String displaytext = "";

        for(int i = 0; i < resultslist.size(); i++)
        {
            displaytext = displaytext + "\n" + resultslist.get(i).getName();
        }



        if(displaytext.equals(""))
        {
            searchResults.setText("No exercise found, try again." + "\n" + "Make sure text is only in one search bar ");
        }
        else
        {
            displaytext = "Exercises for: " + resultslist.get(0).getType() + "\n" + displaytext;
            searchResults.setText(displaytext);
        }
    }

    public void setSearchByExercise(ArrayList<Exercise> list)
    {
        String resultName="";
        String resultType="";
        String resultDes="";
        for(int i = 0; i < list.size(); i++ )
        {
            System.out.println("loop");
            if(searchByExercise.getText().toUpperCase().equals(list.get(i).getName().toUpperCase()))
            {
                System.out.println("result");
                resultName = list.get(i).getName();
                resultType = list.get(i).getType();
                resultDes = list.get(i).getDescription();
                break;
            }

        }
        if(resultName.equals(""))
        {
            searchResults.setText("No exercise found, try again." + "\n" + "Make sure text is only in one search bar ");
        }
        else {
            searchResults.setText(resultName + "\n" + "Body Part: " + resultType + "\n \n" + "How to perform: " + "\n" + resultDes);
        }
    }

    public void setBackButton(ActionEvent event) throws IOException
    {
        System.out.println("From workouts");
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        // replace "null" with an .fxml to send user to that page when the login button pressed
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(root, 320, 550));
        stage.setResizable(false);
        stage.show();
    }
}
