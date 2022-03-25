package com.company;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Team
{
    ArrayList<Volunteer> Team ; // Stores volunteers in team.
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    public Team(int id, String name, int boxes) {
        this.Team = new ArrayList<Volunteer>();
    } // Team constructor.


    public ArrayList getTeam(){
        return Team;
    } // Returns the team arraylist.

    public void addVolunteers(Volunteer V){
        Team.add(V);
    } // Adds volunteer to team.

    public void teamToTable() {
        StringBuilder row = new StringBuilder();

        Team.sort((o1, o2) -> o2.getBoxes().compareTo(o1.getBoxes()));

        for (Volunteer volunteer : Team) {
            row.append( String.format("%-6d%-10s%-6d%-7s", volunteer.getID(), volunteer.getName(), volunteer.getBoxes(), currencyFormat.format(volunteer.getWage())));
        };
        System.out.println(row);


    }

}
