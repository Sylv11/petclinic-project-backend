package be.heh.petclinic.domain;


public class Vet {

    private String firstname;
    private String lastname;
    private String specialities;

    public Vet(String firstname, String lastname, String specialities) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialities = specialities;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getSpecialities() {
        return this.specialities;
    }

}