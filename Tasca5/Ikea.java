package com.company;

public class Ikea {
    //Atributos de la clase padre
    private String material, color;
    private int leg;
    private float width;

    //Consstructor principal
    public Ikea(String material, String color, int leg, float width){
        this.setMaterial(material);
        this.setColor(color);
        this.setLeg(leg);
        this.setWidth(width);
    }
    //Constructor secundario
    public Ikea(String material, String color, float width){
        this(material, color, 0, width);
    }

    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return this.leg;
    }
    public void setLeg(int leg) {
        this.leg = leg;
    }

    public float getWidth() {
        return this.width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
}
