package be.heh.petclinic.domain;


public class Vet {

    private int id;
    private String firstname;
    private String lastname;
    private String speciality;

    public Vet(String firstname, String lastname, String speciality) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
    }

    public int getId(){
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getSpeciality() {
        return this.speciality;
    }

}