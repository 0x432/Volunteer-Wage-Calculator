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
        System.out.println(getTable());
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

    public int updateBoxes(int newBoxes){
        return this.boxes = newBoxes + boxes;
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
