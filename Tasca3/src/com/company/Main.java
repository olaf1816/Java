package com.company;
import java.util.Scanner;

public class Main {
    //Declaramos constantes
    private static final String MSG_COLOR = "Introduce el color del cuadrado:";
    private static final String MSG_SIDE = "Introduce el tamaño del lado:";


    public static void main(String[] args) {
        //Declaras variables
        String color;
        float side;

        //instància de l'objecte 'Scanner'
        Scanner sc = new Scanner(System.in);

        //Recoges en variables los datos
        System.out.println(MSG_COLOR);
        color  = sc.next();
        System.out.println(MSG_SIDE);
        side = sc.nextFloat();


        //new_square: instància de la classe Square
        //llamas al constructor
        Square new_square = new Square(side);

        System.out.println("Lado del cuadrado: " + new_square.getSide());
        System.out.println("Area del cuadrado: " + new_square.getArea());
        System.out.println("Volumen del cuadrado: " + new_square.getVolum());
    }
}