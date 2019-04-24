package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PlansController implements Initializable
{
    @FXML
    private Button backButton;


    @FXML private TableView<Plans> tabelView;
    @FXML private TableColumn<Plans, String> nameColumn;
    @FXML private TableColumn<Plans, String> oneColumn;
    @FXML private TableColumn<Plans, String> twoColumn;
    @FXML private TableColumn<Plans, String> threeColumn;
    @FXML private TableColumn<Plans, String> fourColumn;
    @FXML private ChoiceBox choiceBoxOne;
    @FXML private ChoiceBox choiceBoxTwo;
    @FXML private ChoiceBox choiceBoxThree;
    @FXML private ChoiceBox choiceBoxFour;
    @FXML private Button addPlanButton;
    @FXML private TextField addPlanName;
    @FXML private Button deletePlanButton;
    @FXML private Label deleteResults;

    File fileName = new File("plansdata.txt");

    @Override
    public void initialize(URL location, ResourceBundle rb)
    {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Plans, String>("planName"));
        oneColumn.setCellValueFactory(new PropertyValueFactory<Plans, String>("dayOne"));
        twoColumn.setCellValueFactory(new PropertyValueFactory<Plans, String>("dayTwo"));
        threeColumn.setCellValueFactory(new PropertyValueFactory<Plans, String>("dayThree"));
        fourColumn.setCellValueFactory(new PropertyValueFactory<Plans, String>("dayFour"));

        choiceBoxOne.getItems().addAll("Chest", "Back", "Shoulders","Legs", "Biceps", "Triceps", "ABS", "None", "Upper Body", "Lower Body", "FBW");
        choiceBoxTwo.getItems().addAll("Chest", "Back", "Shoulders","Legs", "Biceps", "Triceps", "ABS","None", "Upper Body", "Lower Body", "FBW");
        choiceBoxThree.getItems().addAll("Chest", "Back", "Shoulders","Legs", "Biceps", "Triceps", "ABS","None", "Upper Body", "Lower Body", "FBW");
        choiceBoxFour.getItems().addAll("Chest", "Back", "Shoulders","Legs", "Biceps", "Triceps", "ABS","None", "Upper Body", "Lower Body", "FBW");

        tabelView.setItems(getPlans());
    }

    public ObservableList<Plans> getPlans()
    {
        ObservableList<Plans> plans = FXCollections.observableArrayList();
        /*plans.add(new Plans(1, "4 day split", "Chest", "Back", "Legs", "Shoulders"));
        plans.add(new Plans(1,"3 day FBW", "Chest + Shoulders", "Legs + Back", "Arms", "" ));

        return plans;*/
        ArrayList<String> inputlist = new ArrayList<>();
        String line;
        try
        {
            BufferedReader input = new BufferedReader(new FileReader("plansdata.txt"));
            if(!input.ready())
            {
                throw new IOException();
            }
            while((line=input.readLine()) != null)
            {
                inputlist.add(line);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        int k = 0;
        for(int i = 0; i<inputlist.size(); i +=6)
        {
            try
            {
                k = Integer.parseInt(inputlist.get(i));
            }
            catch(NumberFormatException nfe)
            {
                nfe.getMessage();
            }
            plans.add(new Plans(k,inputlist.get(i+1),inputlist.get(i+2),inputlist.get(i+3),inputlist.get(i+4),inputlist.get(i+5)));
        }

        return plans;
    }

    public void setAddPlanButton(ActionEvent event) throws IOException
    {
        String choiceOne = choiceBoxOne.getValue().toString();
        String choiceTwo = choiceBoxTwo.getValue().toString();
        String choiceThree = choiceBoxThree.getValue().toString();
        String choiceFour = choiceBoxFour.getValue().toString();
        Plans plan = new Plans(2, addPlanName.getText(), choiceOne, choiceTwo, choiceThree, choiceFour);
        tabelView.getItems().add(plan);
        savePlans();
        //savePlan(plan.getId(), plan.getPlanName(), plan.getDayOne(),plan.getDayTwo(),plan.getDayThree(),plan.getDayFour());

    }



    public void setDeletePlanButton(ActionEvent event) throws IOException
    {
        //tabelView.getItems().removeAll(tabelView.getSelectionModel().getSelectedItem());

        if(tabelView.getSelectionModel().getSelectedItem().getId() == 1)
        {
            deleteResults.setText("Try again, \n A sample plan \n cannot be deleted.");
        }
        else
        {
            tabelView.getItems().removeAll(tabelView.getSelectionModel().getSelectedItem());
            savePlans();
            deleteResults.setText("Workout Plan deleted");
        }
    }

    public void setBackButton(ActionEvent event) throws IOException
    {
        System.out.println("from plans");
        //savePlans();
        //System.out.println(tabelView.getItems().get(1).getPlanName());
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        // replace "null" with an .fxml to send user to that page when the login button pressed
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.setScene(new Scene(root, 320, 550));
        stage.setResizable(false);
        stage.show();
    }

    public void savePlans()
    {
        try {
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw);
            for(int i =0; i<tabelView.getItems().size(); i++)
            {
                output.write(tabelView.getItems().get(i).getId() /*+ " " + tabelView.getItems().get(i).getPlanName() + " " + tabelView.getItems().get(i).getDayOne() + " " + tabelView.getItems().get(i).getDayTwo() + " " + tabelView.getItems().get(i).getDayThree() + " " + tabelView.getItems().get(i).getDayFour() + " "*/ + "\n");
                output.write(tabelView.getItems().get(i).getPlanName() + "\n");
                output.write(tabelView.getItems().get(i).getDayOne() + "\n");
                output.write(tabelView.getItems().get(i).getDayTwo() + "\n");
                output.write(tabelView.getItems().get(i).getDayThree() + "\n");
                output.write(tabelView.getItems().get(i).getDayFour() + "\n");
            }
            output.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
