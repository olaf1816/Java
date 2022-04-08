package com.company;

public class Figures {
    private int side;

    //constructor
    public Figures(int side){
        this.setSide(side);
    }

    public int getSide(){
        return  this.side;
    }
    public void setSide(int side){
        this.side = side;
    }

    //calculo del area
    public float calcArea(){
        return this.getSide()*this.calcArea();
    }
}