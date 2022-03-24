package com.company;

public class Volunteer extends table {

    private int id;
    private String name;
    private int boxes;

    public Volunteer(int id, String name, int boxes, int addBoxes) {
        super(id,name,boxes);
        this.id = id;
        this.name = name;
        this.boxes = boxes;
        updateBoxes(addBoxes);
        super.addVolunteers(this);
    }

    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBoxes(){
        return boxes;
    }

    public int updateBoxes(int newBoxes) {
        int BoxesUpdated = 0;
        if (newBoxes <= 0)
        {
            System.out.println("Error, you cannot enter new boxes below or equal to 0");
            System.exit(1);
        }
        else
        {
            BoxesUpdated = this.boxes = newBoxes + boxes;
        }
        return this.boxes = BoxesUpdated;
    }

    public double getWage(){
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
