package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.application.Platform;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.IOException;

public class MenuController //implements Initializable

{
    @FXML private Button workoutsButton;
    @FXML private Button plansButton;
    @FXML private Button recExeButton;
    @FXML private Button recipeButton;



    public void setWorkoutsButton(ActionEvent e) throws IOException
    {
        System.out.println("Workouts page");
        changeScene("workoutPage.fxml", workoutsButton);

    }

    public void setPlansButton(ActionEvent event) throws IOException
    {
        System.out.println("Plans page");
        changeScene("plansPage.fxml", plansButton);
    }

    public void setRecExeButton(ActionEvent event) throws IOException
    {
        System.out.println("Recomended exe");
        changeScene("recomendedPage.fxml", recExeButton);
    }

    public void setRecipeButton(ActionEvent event) throws IOException
    {
        System.out.println("Recipe page");
        /*Parent root = FXMLLoader.load(getClass().getResource("recipePage.fxml"));
        // replace "null" with an .fxml to send user to that page when the login button pressed
        Stage stage = (Stage) recipeButton.getScene().getWindow();
        stage.setScene(new Scene(root, 320, 550));
        stage.setResizable(false);
        stage.show();*/
        changeScene("recipePage.fxml", recipeButton);
    }

    public void changeScene(String fxmlFile, Button button) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        // replace "null" with an .fxml to send user to that page when the login button pressed
        Stage stage = (Stage) button.getScene().getWindow();
        stage.setScene(new Scene(root, 320, 550));
        stage.setResizable(false);
        stage.show();
    }
}

