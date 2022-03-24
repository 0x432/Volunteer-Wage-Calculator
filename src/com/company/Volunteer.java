package com.company;

public class Volunteer // Class to represent the volunteers.
{
    private final int id; // Stores the volunteer's id.
    private final String name; // Stores the volunteer's name.
    private int boxes; // Stores the volunteer's boxes.

    public Volunteer(int id, String name, int boxes, int addBoxes) // Volunteer constructor.
    {
        this.id = id; // gets the volunteers stored id and makes in the id that has been passed to this constructor.
        this.name = name;
        this.boxes = boxes;
        checkNumeric(id); // Passes value to check the numerical value.
        checkNumeric(boxes);
        updateBoxes(addBoxes);
    }

    public void checkNumeric(int value) // Checks of the value is less than or equal to 0.
    {
        if (value <= 0)
        {
            System.out.println("Error, you cannot enter a value less than or equal to 0"); // Through error message.
            System.exit(1); // Ends the program.
        }
    }

    public Integer getID(){
        return id;
    } // Returns the id of volunteer.

    public String getName(){
        return name;
    } // Returns the name of volunteer.

    public Integer getBoxes(){
        return boxes;
    } // Returns the boxes of volunteer.

    public Double getWage() // Calculates and then returns the wage of volunteer.
    {
        double wage; // Stores wage.
        if (getBoxes() <= 50) // If volunteer has less or equal to 50 boxes.
        {
            wage = 0.15 * getBoxes(); // Do this calculation.
        }
        else // Else if the volunteer has more than 50 boxes.
        {
            wage = ((getBoxes() - 50) * 0.20) + (0.15 * 50); // Do this calculation.
        }
        return wage; // Returns the calculated wage
    }

    public void updateBoxes(int newBoxes){
        checkNumeric(newBoxes);
        this.boxes = newBoxes + boxes;
    } // Calculates the new box total.
}