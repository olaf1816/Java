package com.company;

abstract class Person {
    //Atributs de la classe, se declaran como privados para que solo se puedan utilizar con los metodos declarados.
    private String name, surname, dni;

    //CONSTRUCTORES
    //Constructor principal
    public Person(String name, String surname, String dni){
        this.setName(name);
        this.setSurname(surname);
        this.setDni(dni);
    }
    //Constuctor secundario
    public Person(String name, String surname){
        this(name, surname, null);
    }

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

    //creas el metodo abstracto
    abstract String fullName();

}