package com.company;
public class Square {
    private float  side;
    private String color;

    //constuctor principal
    public Square(float side, String color){
        this.setSide(side);
        this.setColor(color);
    }
    //constructor secundario
    public Square(float side){
        //los campos que no vayamos a utilizar los ponemos como null
        this (side,null);
    }

    public float getSide() {
        return this.side;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    public void setSide(float side) {
        if(side>0){
            this.side = side;
        }
        else{
            System.out.println("error");
        }
    }

    //calculas el area
    public float getArea(){
        return (side*side);
    }

    //calculas el volumen
    public float getVolum(){
        return (side*side*side);
    }
}
