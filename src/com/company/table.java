package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class table extends Team {

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    public table(int id, String name, int boxes) {
        super(id, name, boxes);
    } // Table constructor

    public void getTable() {
        String row = null;
        for (Volunteer volunteer : Team) {
            row = String.format("%-6d%-10s%-6d%-7s",
                    volunteer.getID(),
                    volunteer.getName(),
                    volunteer.getBoxes(),
                    currencyFormat.format(volunteer.getWage())
            );
        }
       System.out.println(row);


    } // Generates table rows.




}
