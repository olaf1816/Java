package com.company;
import java.util.Scanner;

public class Main {
    //Declaramos constantes
    private static final String MSG_ALUMNO = "\nALUMNO:\n";
    private static final String MSG_PROFESSOR = "\nPROFESOR:\n";
    private static final String MSG_NAME = "Introduce el nombre:";
    private static final String MSG_SURNAME = "Introduce el apellido:";
    private static final String MSG_SUBJECT = "Introduce la asignatura:";
    private static final String MSG_ID_TEACHER = "Introduce el identificador de profesor:";
    private static final String MSG1 = "-------------------------------------";


    public static void main(String[] args) {
        //Declaras variables
        String name, surname, subject;
        int ID_Teacher;

        //instància de l'objecte 'Scanner'
        Scanner sc = new Scanner(System.in);

        //Recoges en variables los datos
        System.out.println(MSG_NAME);
        name  = sc.next();
        System.out.println(MSG_SURNAME);
        surname = sc.next();
        System.out.println(MSG_SUBJECT);
        subject = sc.next();
        System.out.println(MSG1);

        //new_student: instáncia de la classe Students
        //llamas al constructor
        Students new_student = new Students(name, surname, subject);

        //Recoges en variables los datos
        System.out.println(MSG_NAME);
        name  = sc.next();
        System.out.println(MSG_SURNAME);
        surname = sc.next();
        System.out.println(MSG_ID_TEACHER);
        ID_Teacher = sc.nextInt();


        //creas instáncia y llamas al constructor
        Teacher new_teacher = new Teacher(name, surname, ID_Teacher);

        System.out.println(MSG_ALUMNO + MSG1 );
        System.out.println("Nombre: " + new_student.getName());
        System.out.println("Apellido: " + new_student.getSurname());
        System.out.println("Asignatura: " + new_student.getSubject());
        System.out.println("Nombre completo: " + new_student.fullName());
        System.out.println(MSG1);

        System.out.println(MSG_PROFESSOR + MSG1 );
        System.out.println("Nombre: " + new_teacher.getName());
        System.out.println("Apellido: " + new_teacher.getSurname());
        System.out.println("ID: " + new_teacher.getID_Teacher());
        System.out.println("Nombre completo: " + new_teacher.fullName());
        System.out.println(MSG1);
    }
}