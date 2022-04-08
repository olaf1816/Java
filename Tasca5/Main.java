package com.company;
import java.util.Scanner;

public class Main {
    //Declaramos constantes
    private static final String MSG_TABLE = "\nMESA:\n";
    private static final String MSG_STOOL = "\nTABURETE:\n";
    private static final String MSG_CLOSET = "\nARMARIO:\n";
    private static final String MSG_CHAIR = "\nSILLA:\n";

    private static final String MSG_MATERIAL = "Introduce el material:";
    private static final String MSG_COLOR = "Introduce el color:";
    private static final String MSG_LEG = "Introduce el numero de patas:";
    private static final String MSG_WIDTH  = "Introduce peso del objeto:";
    private static final String MSG1 = "-------------------------------------";


    public static void main(String[] args) {
        //Declaras variables
        String material, color;
        int leg;
        float width;

        //instància de l'objecte 'Scanner'
        Scanner sc = new Scanner(System.in);

        //Recoges en variables los datos
        System.out.println(MSG_TABLE);
        System.out.println(MSG_MATERIAL);
        material  = sc.next();
        System.out.println(MSG_COLOR);
        color = sc.next();
        System.out.println(MSG_LEG);
        leg = sc.nextInt();
        System.out.println(MSG_WIDTH);
        width = sc.nextFloat();
        System.out.println(MSG1);
        //new_table: instáncia de la classe Table
        //llamas al constructor
        Table new_table = new Table(material,color, leg, width);

        //Recoges en variables los datos
        System.out.println(MSG_STOOL);
        System.out.println(MSG_MATERIAL);
        material  = sc.next();
        System.out.println(MSG_COLOR);
        color = sc.next();
        System.out.println(MSG_LEG);
        leg = sc.nextInt();
        System.out.println(MSG_WIDTH);
        width = sc.nextFloat();
        System.out.println(MSG1);
        //creas instáncia y llamas al constructor
        Stool new_stool = new Stool(material,color, leg, width);

        //Recoges en variables los datos
        System.out.println(MSG_CLOSET);
        System.out.println(MSG_MATERIAL);
        material  = sc.next();
        System.out.println(MSG_COLOR);
        color = sc.next();
        System.out.println(MSG_WIDTH);
        width = sc.nextFloat();
        System.out.println(MSG1);
        //creas instáncia y llamas al constructor
        Closet new_closet = new Closet(material,color, width);

        //Recoges en variables los datos
        System.out.println(MSG_CHAIR);
        System.out.println(MSG_MATERIAL);
        material  = sc.next();
        System.out.println(MSG_COLOR);
        color = sc.next();
        System.out.println(MSG_LEG);
        leg = sc.nextInt();
        System.out.println(MSG_WIDTH);
        width = sc.nextFloat();
        System.out.println(MSG1);
        //creas instáncia y llamas al constructor
        Chair new_chair = new Chair(material,color, leg, width);

        System.out.println(MSG_TABLE + MSG1 );
        System.out.println("Material: " + new_table.getMaterial());
        System.out.println("Color: " + new_table.getColor());
        System.out.println("Nº de patas: " + new_table.getLeg());
        System.out.println("Peso: " + new_table.getWidth());
        System.out.println(MSG1);

        System.out.println(MSG_STOOL + MSG1 );
        System.out.println("Material: " + new_stool.getMaterial());
        System.out.println("Color: " + new_stool.getColor());
        System.out.println("Nº de patas: " + new_stool.getLeg());
        System.out.println("Peso: " + new_stool.getWidth());
        System.out.println(MSG1);

        System.out.println(MSG_CLOSET + MSG1 );
        System.out.println("Material: " + new_closet.getMaterial());
        System.out.println("Color: " + new_closet.getColor());
        System.out.println("Peso: " + new_closet.getWidth());
        System.out.println(MSG1);

        System.out.println(MSG_CHAIR + MSG1 );
        System.out.println("Material: " + new_chair.getMaterial());
        System.out.println("Color: " + new_chair.getColor());
        System.out.println("Nº de patas: " + new_chair.getLeg());
        System.out.println("Peso: " + new_chair.getWidth());
        System.out.println(MSG1);


    }
}