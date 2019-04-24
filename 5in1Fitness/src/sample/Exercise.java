package sample;

public class Exercise
{
    String type;
    String name;
    int id;
    String description;

    public Exercise(int i, String n, String t , String d)
    {
        id = i;
        name = n;
        type = t;
        description = d;
    }

    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }

    public String getDescription()
    {
        return description;
    }
}
