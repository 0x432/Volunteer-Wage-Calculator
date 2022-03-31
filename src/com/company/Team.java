package com.company;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class Team // Class to represent the team.
{
    ArrayList<Volunteer> Team; // Creates an arraylist of volunteers and calling it team.
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // Formats currency to have a currency symbol.

    public Team() { this.Team = new ArrayList<>(); } // Team constructor.

    public void addVolunteers(Volunteer V) { Team.add(V); }// Adds volunteer to team.

    public int getTotalVolunteers() { return getTotalTeamMembers() - getTotalTeamLeaders(); }

    public int getTotalTeamMembers() { return Team.size(); }

    public void sortByBoxes() { Team.sort((o1, o2) -> o2.getBoxes().compareTo(o1.getBoxes())); } // Sorts boxes in descending order.

    public void sortByWage() { Team.sort((o1, o2) -> o2.getWage().compareTo(o1.getWage())); } // Sorts wage in descending order.

    public void sortAlphabetically() { Team.sort(Comparator.comparing(Volunteer::getName)); } // Sort name in alphabetical order.

    public String getAllVolunteers(){
        StringBuilder sb = new StringBuilder();
        for(Volunteer v : Team) {
            sb.append(v.display());
        }
        return sb.toString();
    }

    public int getTotalTeamLeaders(){
        AtomicInteger cnt = new AtomicInteger();
        for (Volunteer V : Team) {
            if (V instanceof TeamLeader) {
                cnt.addAndGet(1);
            }
        }
        return cnt.get();
    }

    public int getTotalBoxes(){
        AtomicInteger cnt = new AtomicInteger();
        for(Volunteer V : Team) {
            cnt.addAndGet(V.getBoxes());
        }
        return cnt.get();
    }

    public double getTotalWage(){
        int cnt = 0;
        for (Volunteer V : Team) {
            cnt += V.getWage();
        }
        return cnt;
    }

    public String getTeamLeadersNames(){
        StringBuilder sb = new StringBuilder();
        for(Volunteer V : Team) {
            if (V instanceof TeamLeader) {
                sb.append(V.getName());
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public String getTeamStats(){
        return String.format("\nTotal Team Members: %d\nTotal Volunteers: %d\nTotal Team leaders: %d\nTeam leaders names: %s\nTotal Boxes Delivered: %d\nTotal wage: %s\n_____________________________________________________________________________________________",
                getTotalTeamMembers() ,getTotalVolunteers() , getTotalTeamLeaders() ,getTeamLeadersNames() ,getTotalBoxes(), currencyFormat.format(getTotalWage()));
    }
}