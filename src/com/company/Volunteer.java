package com.company;

public class Volunteer // Class to represent the volunteers.
{
    private final int id;
    private final String name;
    private int boxes;

    public Volunteer(int id, String name, int boxes, int addBoxes) // Volunteer constructor.
    {
        checkNumeric(id);
        checkNumeric(boxes);
        this.id = id;
        this.name = name;
        this.boxes = boxes;
        updateBoxes(addBoxes);
    }
    public void checkNumeric(int value) // Checks of the value is less than or equal to 0.
    {
        if (value <= 0)
        {
            System.out.println("Error, you cannot enter a value less than or equal to 0");
            System.exit(1);
        }
    }
    public void updateBoxes(int newBoxes) // Calculates the new box total.
    {
        checkNumeric(newBoxes);
        this.boxes = newBoxes + boxes;
    }
    public Double getWage() // Calculates and then returns the wage of volunteer.
    {
        double wage;
        if (getBoxes() <= 50)
        {
            wage = 0.15 * getBoxes();
        }
        else
        {
            wage = ((getBoxes() - 50) * 0.20) + (0.15 * 50);
        }
        return wage;
    }

    public String getTL(){return "";} // Returns nothing to identify this is just a volunteer.

    public Integer getID()
    {
        return id;
    } // Returns the id of volunteer.

    public String getName(){
        return name;
    } // Returns the name of volunteer.

    public Integer getBoxes(){
        return boxes;
    } // Returns the boxes of volunteer.
}
