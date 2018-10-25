package be.heh.petclinic.domain;


public class Owner {

    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String telephone;

    public Owner(int id, String firstname, String lastname, String address, String city, String telehone ) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.telephone = telehone;
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

    public String getAddress() {
        return this.address;
    }

    public String getTelehone(){
        return this.telephone;
    }

    public String getCity(){
        return this.city;
    }

}