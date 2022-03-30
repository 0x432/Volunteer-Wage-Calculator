package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Team T = new Team(); // Creating a new Team object.

        T.addVolunteers(new TeamLeader(1,"Sofya",127,-1)); // Creating new team leader and adding it to the arraylist.
        T.addVolunteers(new Volunteer(2, "Steve", 46,0)); // Creating new volunteer and adding it to the arraylist.
        T.addVolunteers(new Volunteer(3, "Muhammed", 273,27));
        T.addVolunteers(new Volunteer(4, "Amaara", 129,33));
        T.addVolunteers(new Volunteer(5, "Ayub", 129,39));
        T.addVolunteers(new Volunteer(6, "Tony", 17,106));

        System.out.println("-----------------------------\nNot sorted");
        System.out.println(T.getTable()); // Printing out the table.
        System.out.println("-----------------------------\nSorted by highest wage");
        T.sortByWage(); // Sorts arraylist by wages descending.
        System.out.println(T.getTable());
        System.out.println("-----------------------------\nSorted by amount of boxes");
        T.sortByBoxes(); // Sorts arraylist by boxes descending.
        System.out.println(T.getTable());
        System.out.println("-----------------------------\nSorted alphabetically");
        T.sortAlphabetically();// Sorts arraylist alphabetically.
        System.out.println(T.getTable());
        System.out.println("-----------------------------\nTeam statistics");
        System.out.println(T.getStats()); // Prints the statistics of the team.
    }
}