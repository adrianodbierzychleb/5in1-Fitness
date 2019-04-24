package sample;

import javafx.beans.property.SimpleStringProperty;

public class Plans {

    private int id;
    private SimpleStringProperty planName;
    private SimpleStringProperty dayOne;
    private SimpleStringProperty dayTwo;
    private SimpleStringProperty dayThree;
    private SimpleStringProperty dayFour;


    public Plans(int i, String name, String one, String two, String three, String four)
    {
        id = i;
        planName = new SimpleStringProperty(name);
        dayOne = new SimpleStringProperty(one);
        dayTwo = new SimpleStringProperty(two);
        dayThree = new SimpleStringProperty(three);
        dayFour = new SimpleStringProperty(four);
    }

    public int getId() {
        return id;
    }


    public String getPlanName() {
        return planName.get();
    }


    public String getDayOne() {
        return dayOne.get();
    }


    public String getDayTwo() {
        return dayTwo.get();
    }



    public String getDayThree() {
        return dayThree.get();
    }

    public String getDayFour() {
        return dayFour.get();
    }
}
