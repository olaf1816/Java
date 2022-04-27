package cat.mvm.aplications.entities;

//subclase de Person, lo vinculas con extends
public class Teacher {
    private int ID_Teacher;

    //las dos primeras las pillas de la clase person con el super
    public Teacher(String name, String surname, int ID_Teacher){
        this.setID_Teacher(ID_Teacher);
    }

    public int getID_Teacher() {
        return this.ID_Teacher;
    }
    public void setID_Teacher(int ID_Teacher) {
        this.ID_Teacher = ID_Teacher;
    }

}