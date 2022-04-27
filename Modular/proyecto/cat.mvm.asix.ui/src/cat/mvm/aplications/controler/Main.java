package cat.mvm.aplications.controler;
import cat.mvm.aplications.entities.Teacher;

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



        //creas instáncia y llamas al constructor
        Teacher new_teacher = new Teacher(name, surname, 87666);

        System.out.println(MSG1);
    }
}