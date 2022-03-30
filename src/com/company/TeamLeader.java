package com.company;

public class TeamLeader extends Volunteer // Class to represent the team leaders and inherits volunteer class.
{
    public TeamLeader(int id, String name, int boxes, int addBoxes) // Team leader constructor.
    {
        super(id, name, boxes, addBoxes);
    }

    @Override
    public String display(){
        String r = String.format("\nID: %-2d | Team leader: Yes| Name: %-15s | Boxes: %-12d | Wage: %-12s |",
                this.getID(), this.getName(),this.getBoxes(),currencyFormat.format(this.getWage()));
        return r;
    }
}
