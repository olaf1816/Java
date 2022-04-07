package com.company;
import java.util.Scanner;

public class Main {
    //Declaramos constantes
    private static final String MSG_NAME = "Introdueix el nom de la persona:";
    private static final String MSG_SURNAME = "Introdueix el cognom de la persona";
    private static final String MSG_DNI = "Introdueix el DNI de la persona:";
    private static final String MSG_HEIGHT = "Introdueix la altura de la persona:";
    private static final String MSG_WIDTH = "Introdueix el nom de la persona:";


    public static void main(String[] args) {
        //instància de l'objecte 'Scanner'
        Scanner sc = new Scanner(System.in);

        //Recoges en variables los datos
        System.out.println(MSG_NAME);
        String name  = sc.next();
        System.out.println(MSG_SURNAME);
        String surname = sc.next();
        System.out.println(MSG_DNI);
        String dni = sc.next();
        System.out.println(MSG_HEIGHT);
        float height = sc.nextFloat();
        System.out.println(MSG_WIDTH);
        float width = sc.nextFloat();

        //alumne_asix: instància de la classe Person
        //llamas al constructor principal pasandole todas las variables
        Person alumne_asix = new Person(name, surname, dni, height, width);

        System.out.println(alumne_asix.getName());
        System.out.println(alumne_asix.getSurname());
        System.out.println(alumne_asix.getDni());
        System.out.println(alumne_asix.getHeight());
        System.out.println(alumne_asix.getWidth());
    }
}