package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Team T = new Team(); // Creating a new Team object.

        T.addVolunteers(new TeamLeader(1,"Sofya",4,1)); // Creating new team leader and adding it to the arraylist.
        T.addVolunteers(new Volunteer(2, "Steve", 2,4)); // Creating new volunteer and adding it to the arraylist.
        T.addVolunteers(new Volunteer(3, "Muhammed", 273,27));
        T.addVolunteers(new Volunteer(4, "Amaara", 129,33));
        T.addVolunteers(new Volunteer(5, "Ayub", 129,39));
        T.addVolunteers(new Volunteer(6, "Tony", 17,106));

        System.out.format("_____________________________________________________________________________________________\n%50s %42s","NOT SORTED","|");
        System.out.println(T.getAllVolunteers()); // Printing out the table.
        System.out.format("_____________________________________________________________________________________________\n%60s %32s","SORTED BY WAGE DESCENDING ORDER","|");
        T.sortByWage(); // Sorts arraylist by wages descending.
        System.out.println(T.getAllVolunteers());
        System.out.format("_____________________________________________________________________________________________\n%59s %33s","SORTED BY BOXES DESCENDING ORDER","|");
        T.sortByBoxes(); // Sorts arraylist by boxes descending.
        System.out.println(T.getAllVolunteers());
        System.out.format("_____________________________________________________________________________________________\n%55s %37s","SORTED ALPHABETICALLY","|");
        T.sortAlphabetically();// Sorts arraylist alphabetically.
        System.out.println(T.getAllVolunteers());
        System.out.format("_____________________________________________________________________________________________\n%52s %40s","TEAM STATISTICS","|");
        System.out.println(T.getTeamStats()); // Prints the statistics of the team.
    }
}