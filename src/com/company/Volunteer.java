package com.company;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Volunteer // Class to represent the volunteers.
{
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // Formats currency to have a currency symbol.

    private int id;
    private final String name;
    private int boxes;

    public Integer getID() { return id; } // Returns the id of volunteer.

    public String getName() { return name; } // Returns the name of volunteer.

    public Integer getBoxes() { return boxes; } // Returns the boxes of volunteer.

    public void updateBoxes(int newBoxes) { this.boxes = newBoxes + boxes; } // Calculates the new box total.

    public Volunteer(int id, String name, int boxes, int addBoxes){ // Volunteer constructor.
        this.name = name;
        this.id = checkIntgerPositive(id);
        this.boxes = checkIntgerPositive(boxes);
        updateBoxes(checkIntgerPositive(addBoxes));
    }

    public String display() {
        return String.format("\nID: %-2d | Team leader: No | Name: %-15s | Boxes: %-12d | Wage: %-12s |",
                getID(), getName(),getBoxes(),currencyFormat.format(getWage()));
    }

    public Integer checkIntgerPositive(int integer) {
        Scanner in = new Scanner( System.in );
        while (true){
            try{
                if (integer <= 0) {
                    throw new ArithmeticException("ERROR (integerLessThanZero) : " + this.name + " cannot have a negative box value.");
                }
                else {
                    return integer;
                }
            }
            catch (ArithmeticException e){
                e.printStackTrace();
                System.out.print("\nTry again: ");
                integer = in.nextInt();
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