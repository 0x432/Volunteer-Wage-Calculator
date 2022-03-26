package com.company;

public class TeamLeader extends Volunteer // Class to represent the team leaders and inherits volunteer class.
{
    public TeamLeader(int id, String name, int boxes, int addBoxes) // Team leader constructor.
    {
        super(id,name,boxes,addBoxes);
        checkNumeric(id);
        checkNumeric(boxes);
        updateBoxes(addBoxes);
    }

    public String getTL() // Returns the String * to identify that that volunteer is a team leader.
    {
        return "*";
    }

    public Double getWage() // Calculates and then returns the wage of the team leader.
    {
        double wage; // Stores the wage as a double
        if (getBoxes() <= 50) // If boxes is less than or equal to 50.
        {
            wage = 0.15 * getBoxes() * 1.2; // Times the amount of boxes by 0.15 and then * it by 1.2 for the 20% extra.
        }
        else // Else boxes is greater than 50.
        {
            wage = (((getBoxes() - 50) * 0.20) + (0.15 * 50)) * 1.2; // Takeaway the volunteers boxes by 50 then * it by 0.20 then * 0.15 by 50 then add them both together and * by 1.2 for the 20% extra.
        }
        return wage; // Returns the wage of the volunteer.
    }
}