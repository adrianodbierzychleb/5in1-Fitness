package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class RecomendedController implements Initializable
{
    @FXML private Button backButton;
    @FXML private Button selectButton;
    @FXML private ChoiceBox choiceBox;
    @FXML private Label selectResults;
    @FXML private ImageView image;


    @Override
    public void initialize(URL location, ResourceBundle rb)
    {

        selectResults.setText("Choose a sport to view" + "\n" + "recommended exercises");
        choiceBox.getItems().addAll("Football", "Cycling", "Rowing", "Boxing","Running");
        //image = new ImageView();
       // choiceBox.getItems().add("Cycling");
       // choiceBox.getItems().add("Rowing");
       // choiceBox.getItems().add("Boxing");
       // choiceBox.getItems().add("Running");

    }

    public void setSelectButton()
    {
        String choice = choiceBox.getValue().toString();
        if(choice.equals("Football"))
        {
            //loadImage("cycling.jpeg");
            selectResults.setText("Recommended exercises \nfor Football: \n\nSquats \nCalf Raises \nDeadlift \nBench Press \nCrunches");
        }
        else if (choice.equals("Cycling"))
        {
            selectResults.setText("Recommended exercises \nfor Cycling: \n\nSquats \nLeg Extensions \nLeg Press \nFrench Press \nBarbell Curl");
        }
        else if (choice.equals("Rowing"))
        {
            selectResults.setText("Recommended exercises \nfor Rowing: \n\nBarbell Row \nMachine Row \nShrugs \nPreacher Curls \nTriceps Push");
        }
        else if (choice.equals("Boxing"))
        {
            selectResults.setText("Recommended exercises \nfor Boxing: \n\nBench Press \nBarbell Row \nOverhead Press \nDips \nDumbbell Curls");
        }
        else if (choice.equals("Running"))
        {
            selectResults.setText("Recommended exercises \nfor Running: \n\nSquats \nCalf Raises \nPush ups \nPull ups \nCrunches");
        }
        else
        {
            selectResults.setText(choiceBox.getValue().toString());
        }
    }

   /* public void loadImage(String url)
    {
        InputStream inStream = getClass().getResourceAsStream(url);
        Image imgObject = new Image(inStream);
        image = new ImageView(imgObject);
        //image.setImage(imgObject);

    }*/

    public void setBackButton(ActionEvent event) throws IOException
    {
        System.out.println("From Rec");
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        // replace "null" with an .fxml to send user to that page when the login button pressed
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(root, 320, 550));
        stage.setResizable(false);
        stage.show();
    }
}
