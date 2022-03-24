package com.company;

import java.util.Collections;

public class Volunteer extends table
{
    private int id;
    private String name;
    private int boxes;

    public Volunteer(int id, String name, int boxes, int addBoxes) {
        super(id,name,boxes);
        this.id = id;
        this.name = name;
        this.boxes = boxes;
        checkNumeric(id);
        checkNumeric(boxes);
        updateBoxes(addBoxes);
        super.addVolunteers(this);
        getTable();
    } // Volunteer constructor.

    public void checkNumeric(int value){
        if (value <= 0)
        {
            System.out.println("Error, you cannot enter a value less than or equal to 0");
            System.exit(1);
        }
    } // Checks of the value is less than or equal to 0.

    public int getID(){
        return id;
    } // Returns the id of volunteer.

    public String getName(){
        return name;
    } // Returns the name of volunteer.

    public Integer getBoxes(){
        return boxes;
    } // Returns the boxes of volunteer.

    public double getWage(){
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
    } // Calculates and then returns the wage of volunteer.

    public Integer  updateBoxes(int newBoxes) {
        checkNumeric(newBoxes);
        return this.boxes = newBoxes + boxes;
    } // Calculates the new box total.


}
