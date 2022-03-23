package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;

public abstract class table extends Team{

    private ArrayList<Volunteer> Team = getTeam();
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    public table(int id, String name, int boxes) {
        super(id, name, boxes);
    }

    public String getTable() {
        String row = null;
        //String col = String.format("%6s%6s%6s%6s\n", "ID", "Name", "Boxes", "Wage");
        for (int cnt = 0; cnt < Team.size(); cnt++) {
            String.format(".2f",Team.get(cnt).getWage());
            row = String.format("%-6d%6s%6d%6s",
                    Team.get(cnt).getID(),
                    Team.get(cnt).getName(),
                    Team.get(cnt).getBoxes(),
                    currencyFormat.format(Team.get(cnt).getWage())
            );
        }
        return row;
    }


    public abstract int compreTo(Volunteer V);
}
