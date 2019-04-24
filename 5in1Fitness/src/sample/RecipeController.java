package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class RecipeController
{


    @FXML private Button backButton;



    public void setBackButton(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        // replace "null" with an .fxml to send user to that page when the login button pressed
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(root, 320, 550));
        stage.setResizable(false);
        stage.show();
    }
}
