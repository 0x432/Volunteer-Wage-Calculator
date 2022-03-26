package com.company;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

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

    public StringBuilder getTable() // Returns a table of volunteers in the team.
    {
        StringBuilder Table = new StringBuilder(); // Creates a new string builder object called table.
        Table.append(String.format("%-4s%-4s%-10s%-6s%-8s\n", "ID","TL", "Name", "Boxes", "Wage")); // Creating the table header.
        for (Volunteer volunteer : Team) // Loops through the volunteers in the team.
        {
            Table.append(String.format("%-4d%-4s%-10s%-6d%-8s\n", volunteer.getID(), volunteer.getTL(), volunteer.getName(), volunteer.getBoxes(), currencyFormat.format(volunteer.getWage()))); // Creates String to show volunteers of team and adds it to the rows.
        }
        return Table; // Returns a clean table of all the volunteers to be printed out.
    }

    public StringBuilder getStats() // Gets the statistics of the team.
    {
        int totalBoxes = 0; // Stores the total amount of volunteers in the team.
        int totalTeamLeaders = 0; // Stores the total amount of team leaders in the team.
        double totalWage = 0; // Stores the total wage of the hole team.
        StringBuilder Stats = new StringBuilder(); // Stores stats of the team.
        StringBuilder namesTL = new StringBuilder(); // Stores name of team leaders in the team.
        for (Volunteer volunteer : Team) // Loops through the volunteers in the team.
        {
            if (Objects.equals(volunteer.getTL(), "*")) // If volunteer is a team leader.
            {
                totalTeamLeaders += 1; // Adds team leaders by 1 and the total.
                namesTL.append(volunteer.getName()).append(","); // Saves the team leaders name in the string builder.
            }
            totalBoxes += volunteer.getBoxes(); // Adds previous stored boxes to the current volunteers boxes to get the total amount of boxes.
            totalWage += volunteer.getWage(); // Adds previous stored wages to the current volunteers wage to get the total wage for the team.
        }
        Stats.append(String.format("\nTotal Volunteers = %d\nTotal Team leaders = %d\nTeam leaders names = %s\nTotal Boxes Delivered = %d\nTotal Wage = %s", Team.size(), totalTeamLeaders, namesTL, totalBoxes, currencyFormat.format(totalWage))); // Creates String to show statistics of team and adds it to the rows.
        return Stats; // Returns the stats of the team to be printed out.
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
