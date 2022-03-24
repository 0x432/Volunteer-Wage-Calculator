package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;

public class table extends Team{

    private ArrayList<Volunteer> Team = getTeam();
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    public table(int id, String name, int boxes) {
        super(id, name, boxes);
    }

    public void getTable() {
        String row = null;
        for (int cnt = 0; cnt < Team.size(); cnt++) {
            row = String.format("%-6d%-10s%-6d%-7s",
                    Team.get(cnt).getID(),
                    Team.get(cnt).getName(),
                    Team.get(cnt).getBoxes(),
                    currencyFormat.format(Team.get(cnt).getWage())
            );
        }
        System.out.println(row);
    }
}
