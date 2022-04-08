package com.company;

//subclase de la clase person
public class Students extends Person {
    private String subject;

    //las dos primeras las coges de la clase person
    public Students (String name, String surname, String subject){
        super(name, surname);
        this.setSubject(subject);
    }

    //llama
    @Override
    String fullName() {
        return getName()+" "+getSurname();
    }

    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
