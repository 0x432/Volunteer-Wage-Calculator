package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Volunteer // Class to represent the volunteers.
{
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // Formats currency to have a currency symbol.

    private final int id;
    private final String name;
    private int boxes;

    public Integer getID() { return id; } // Returns the id of volunteer.

    public String getName() { return name; } // Returns the name of volunteer.

    public Integer getBoxes() { return boxes; } // Returns the boxes of volunteer.

    public void updateBoxes(int newBoxes) { this.boxes = newBoxes + boxes; } // Calculates the new box total.

    public Volunteer(int id, String name, int boxes, int addBoxes){ // Volunteer constructor.
        this.name = name;
        this.id = checkInteger(String.valueOf(id));
        this.boxes = checkInteger(String.valueOf(boxes));
        updateBoxes(checkInteger(String.valueOf(addBoxes)));
    }

    public String display() {
        return String.format("\nID: %-2d | Team leader: No | Name: %-15s | Boxes: %-12d | Wage: %-12s |",
                getID(), getName(),getBoxes(),currencyFormat.format(getWage()));
    }

    public int checkInteger(String input) {
        Scanner s1 = new Scanner(System.in);
        while (true) {
            try {
                if (Integer.parseInt(input) >= 0) {
                    return Integer.parseInt(input);
                }
                else {
                    System.out.format("Error, volunteer %s cannot have negative Boxes\nTry again: ",this.name);
                    input = s1.nextLine();
                }
            }
            catch (NumberFormatException e) {
                System.out.format("Error, volunteer %s Boxes must be integer values\nTry again: ",this.name);
                input = s1.nextLine();
            }
        }
    }

    public Double getWage(){ // Calculates and then returns the wage of volunteer.
        double wage;
        if (getBoxes() <= 50)
        {
            wage = 0.15 * getBoxes();
        }
        else
        {
            wage = ((getBoxes() - 50) * 0.20) + (0.15 * 50);
        }
        return wage;
    }
}