package com.company;

public class TeamLeader extends Volunteer // Class to represent the team leaders and inherits volunteer class.
{
    public TeamLeader(int id, String name, int boxes, int addBoxes){
        super(id,name,boxes,addBoxes);
        checkNumeric(id);
        checkNumeric(boxes);
        updateBoxes(addBoxes);
    }

    public String getTL(){return "*";}

    public Double getWage() // Calculates and then returns the wage of volunteer.
    {
        double wage;
        if (getBoxes() <= 50)
        {
            wage = 0.15 * getBoxes() * 1.2;
        }
        else
        {
            wage = (((getBoxes() - 50) * 0.20) + (0.15 * 50)) * 1.2;
        }
        return wage;
    }
}
