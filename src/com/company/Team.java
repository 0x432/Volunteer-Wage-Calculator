package com.company;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Team
{
    ArrayList<Volunteer> Team;
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    public Team()
    {
        this.Team = new ArrayList<>();
    } // Team constructor.

    public void addVolunteers(Volunteer V) // Adds volunteer to team.
    {
        Team.add(V);
    }

    public StringBuilder getTable() // Returns a table of volunteers in the team.
    {
        StringBuilder Table = new StringBuilder();
        Table.append(String.format("%-6s%-10s%-6s%-7s\n", "ID", "Name", "Boxes", "Wage"));
        for (Volunteer volunteer : Team)
        {
            Table.append(String.format("%-6d%-10s%-6d%-7s\n", volunteer.getID(), volunteer.getName(), volunteer.getBoxes(), currencyFormat.format(volunteer.getWage())));
        }
        return Table;
    }

    public StringBuilder getStats() // Gets the statistics of the team.
    {
        int totalBoxes = 0; // Stores the total amount of volunteers in the team.
        double totalWage = 0; // Stores the total wage of the hole team.
        StringBuilder Stats = new StringBuilder(); // Stores stats of the team.
        for (Volunteer volunteer : Team)
        {
            totalBoxes = totalBoxes + volunteer.getBoxes(); // Adds previous stored boxes to the current volunteers boxes to get the total amount of boxes.
            totalWage = totalWage + volunteer.getWage(); // Adds previous stored wages to the current volunteers wage to get the total wage for the team.
        }
        Stats.append(String.format("\nTotal Volunteers = %d\nTotal Boxes = %d\nTotal Wage = %s", Team.size(), totalBoxes, currencyFormat.format(totalWage))); // Creates String to show statistics of team and adds it to the rows.
        return Stats;

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
