package be.heh.petclinic.domain;


public class Visit {

    private int id;
    private int petId;
    private String date;
    private String description;

    public Visit() {}

    public Visit(int id, int petId, String date, String description) {
        this.id = id;
        this.petId = petId;
        this.date = date;
        this.description = description;
    }

    public int getId(){
        return this.id;
    }

    public int getPetId(){
        return this.petId;
    }

    public String getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }
}