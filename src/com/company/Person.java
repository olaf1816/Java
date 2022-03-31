package com.company;

public class Person {
    //Atributs de la classe
    String name, surname, dni;
    float height, width;

    //getName:retorna el valor que conté l'atribut 'name' a quien lo invoca.
    public String getName(){
        return this.name;
    }
    //setName:assigna el valor de l'argument a l'atribut 'name'.
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getDni(){
        return this.dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public Float getHeight(){
        return this.height;
    }
    public void setHeight(Float height){
        this.height = height;
    }

    public Float getWidth(){
        return this.width;
    }
    public void setWidth(Float width){
        this.width = width;
    }
}
