package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Team
{
    private ArrayList<Volunteer> Team;

    public Team(int id, String name, int boxes) {
        this.Team = new ArrayList<>();
    }

    public ArrayList getTeam(){
        return Team;
    }

    public void addVolunteers(Volunteer V){
        Team.add(V);
    }


}
