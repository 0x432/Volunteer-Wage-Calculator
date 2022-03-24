package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        System.out.format("%-6s%-10s%-6s%-7s\n", "ID", "Name", "Boxes", "Wage");
        new Volunteer(1, "Sofya", 127,13);
        new Volunteer(2, "Steve", 46,9);
        new Volunteer(3, "Muhammed", 273,27);
        new Volunteer(4, "Amaara", 129,33);
        new Volunteer(5, "Ayub", 129,39);
        new Volunteer(6, "Tony", 17,106);
    }
}