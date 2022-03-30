package com.company;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Team // Class to represent the team.
{
    ArrayList<Volunteer> Team; // Creates an arraylist of volunteers and calling it team.
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // Formats currency to have a currency symbol.

    public Team()
        {
            this.Team = new ArrayList<>();
        } // Team constructor.

    public void addVolunteers(Volunteer V) // Adds volunteer to team.
    {
        Team.add(V);
    }

    public String getAllVolunteers(){
        StringBuilder sb = new StringBuilder();
        for(Volunteer v : Team)
        {
            sb.append(v.display());
        }
        return sb.toString();
    }

    public int getTotalTeamLeaders(){
        int cnt = 0;
        for (Volunteer V : Team)
        {
            if (V instanceof TeamLeader)
            {
                cnt += 1;
            }
        }
        return cnt;
    }

    public int getTotalVolunteers(){
        return getTotalTeamMembers() - getTotalTeamLeaders();
    }

    public int getTotalTeamMembers(){
        return Team.size();
    }

    public int getTotalBoxes(){
        int cnt = 0;
        for(Volunteer V : Team)
        {
            cnt += V.getBoxes();
        }
        return cnt;
    }

    public double getTotalWage(){
        int cnt = 0;
        for (Volunteer V : Team)
        {
            cnt += V.getWage();
        }
        return cnt;
    }

    public String getTeamLeadersNames(){
        StringBuilder sb = new StringBuilder();
        for(Volunteer V : Team)
        {
            if (V instanceof TeamLeader)
            {
                sb.append(V.getName());
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String getTeamStats(){
        String r = String.format("Total Team Members: %d\nTotal Volunteers: %d\nTotal Team leaders: %d\nTeam leaders names: %s\nTotal Boxes Delivered: %d\nTotal wage: %s",
                getTotalTeamMembers() ,getTotalVolunteers() , getTotalTeamLeaders() ,getTeamLeadersNames() ,getTotalBoxes(), currencyFormat.format(getTotalWage()));
        return r;
    }

    public void sortByBoxes() // Sorts boxes in descending order.
    {
        Team.sort((o1, o2) -> o2.getBoxes().compareTo(o1.getBoxes()));
    }

    public void sortByWage() // Sorts wage in descending order.
    {
        Team.sort((o1, o2) -> o2.getWage().compareTo(o1.getWage()));
    }

    public void sortAlphabetically() // Sort name in alphabetical order.
    {
        Team.sort(Comparator.comparing(Volunteer::getName));
    }
}