package com.company;

public class TeamLeader extends Volunteer // Class to represent the team leaders and inherits volunteer class.
{
    public TeamLeader(int id, String name, int boxes, int addBoxes) { super(id, name, boxes, addBoxes); } // Team leader constructor.

    @Override
    public Double getWage(){ return super.getWage() * 1.2; } // Calculates and then returns the wage of the team leader.

    @Override
    public String display(){
        return String.format("\nID: %-2d | Team leader: Yes| Name: %-15s | Boxes: %-12d | Wage: %-12s |",
                this.getID(), this.getName(), this.getBoxes(),currencyFormat.format(this.getWage()));
    }
}