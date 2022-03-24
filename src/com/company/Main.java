package com.company;


public class Main extends table
{

    public Main(int id, String name, int boxes) {
        super(id, name, boxes);
    }

    public static void main(String[] args)
    {
        System.out.format("%-6s%-10s%-7s%-6s\n", "ID", "Name", "Boxes", "Wage");
        new Volunteer(1, "Sofya", 127,13).getTable();
        new Volunteer(2, "Steve", 46,9).getTable();
        new Volunteer(3, "Muhammed", 273,27).getTable();
        new Volunteer(4, "Amaara", 129,33).getTable();
        new Volunteer(5, "Ayub", 129,39).getTable();
        new Volunteer(6, "Tony", 17,106).getTable();
    }
}