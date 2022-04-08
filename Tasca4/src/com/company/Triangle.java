package com.company;

public class Triangle extends Figures {
    private String background;

     public Triangle(int side, String background){
         super(side);
         this.setBackground(background);
     }

     public String getBackground(){
         return this.background;
     }
     public void setBackground(String background) {
        this.background = background;
    }
}
