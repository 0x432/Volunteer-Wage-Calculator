package com.company;

// Importing java utilities.
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;

public class Team // Class to represent the team.
{
    public static void main(String[] args) // Start of the program.
    {
        ArrayList<Volunteer> Team = new ArrayList<>(); // Creating an array list of volunteers.
        Team.add(new Volunteer(1, "Sofya", 127, 13)); // Creating new volunteer and adding it to the arraylist.
        Team.add(new Volunteer(2, "Steve", 46, 9));
        Team.add(new Volunteer(3, "Muhammed", 273, 27));
        Team.add(new Volunteer(4, "Amaara", 129, 33));
        Team.add(new Volunteer(5, "Ayub", 129, 39));
        Team.add(new Volunteer(6, "Tony", 17, 106));

        System.out.println("-----------------------------\nNot sorted");
        System.out.print(table(Team));

        System.out.println("\n-----------------------------\nSorted by amount of boxes");
        Team.sort((o1, o2) -> o2.getBoxes().compareTo(o1.getBoxes())); // Sorts boxes in descending order.
        System.out.print(table(Team));

        System.out.println("\n-----------------------------\nSorted by highest wage");
        Team.sort((o1, o2) -> o2.getWage().compareTo(o1.getWage())); // Sorts wage in descending order.
        System.out.print(table(Team));

        System.out.println("\n-----------------------------\nSorted alphabetically"); // Sort name in alphabetical order.
        Team.sort(new Comparator<Volunteer>()
        {
            @Override
            public int compare(Volunteer o1, Volunteer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.print(table(Team));
    }

    public static String table(ArrayList<Volunteer> Team) // Returns a table.
    {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // Format values in a currency format with local symbol.

        int totalBoxes = 0; // Stores the total amount of volunteers in the team.
        double totalWage = 0; // Stores the total wage of the hole team.
        StringBuilder row = new StringBuilder(); // Store rows from the arraylist.

        String tableHeader = String.format("%-6s%-10s%-6s%-7s\n", "ID", "Name", "Boxes", "Wage"); // Creates a table header witch is neatly aligned.
        for (Volunteer volunteer : Team) // Loops through volunteers in the team.
        {
            totalBoxes = totalBoxes + volunteer.getBoxes(); // Adds previous stored boxes to the current volunteers boxes to get the total amount of boxes.
            totalWage = totalWage + volunteer.getWage(); // Adds previous stored wages to the current volunteers wage to get the total wage for the team.
            row.append(String.format("%-6d%-10s%-6d%-7s\n", volunteer.getID(), volunteer.getName(), volunteer.getBoxes(), currencyFormat.format(volunteer.getWage()))); // Formats volunteer in the list to make a neat row then adds the string with the previous string.
        }
        row.append(String.format("\nTotal Volunteers = %d\nTotal Boxes = %d\nTotal Wage = %s", Team.size(), totalBoxes, currencyFormat.format(totalWage))); // Creates String to show statistics of team and adds it to the rows.
        return tableHeader + row; // returns the table header and all the rows to make a table.
    }
}