package com.company;
import java.util.ArrayList;

public class Team
{
    ArrayList<Volunteer> Team ; // Stores volunteers in team.

    public Team(int id, String name, int boxes) {
        this.Team = new ArrayList<Volunteer>();
    } // Team constructor.


    public ArrayList getTeam(){
        return Team;
    } // Returns the team arraylist.

    public void addVolunteers(Volunteer V){
        Team.add(V);
    } // Adds volunteer to team.

}
