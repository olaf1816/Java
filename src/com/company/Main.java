package com.company;

public class Main {

    public static void main(String[] args) {
        //alumne_asix: instància de la classe Person
        Person alumne_asix = new Person();

        alumne_asix.setName("Oriol");
        alumne_asix.setSurname("Alegre");
        alumne_asix.setDni("24414132T");
        alumne_asix.setHeight(1.72f);
        alumne_asix.setWidth(80f);

        System.out.println(alumne_asix.getName());
        System.out.println(alumne_asix.getSurname());
        System.out.println(alumne_asix.getDni());
        System.out.println(alumne_asix.getHeight());
        System.out.println(alumne_asix.getWidth());
    }
}
