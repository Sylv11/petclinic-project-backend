package be.heh.petclinic.domain;


public class Pet {

    private int id;
    private int ownerId;
    private String name;
    private String dateBirth;
    private String type;

    public Pet() {};

    public Pet(int id, int ownerId, String name, String dateBirth, String type) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.dateBirth = dateBirth;
        this.type = type;
    }

    public int getId(){
        return this.id;
    }

    public int getOwnerId(){
        return this.ownerId;
    }

    public String getName() {
        return this.name;
    }

    public String getDateBirth() {
        return this.dateBirth;
    }

    public String getType() {
        return this.type;
    }

}