package org.cdlib.quickcheckdemo.model;

public class Patron {

    private Campus campus;
    private PatronType type;

    public Patron() {
    }

    public Patron(Campus campus, PatronType type) {
        this.campus = campus;
        this.type = type;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public PatronType getType() {
        return type;
    }

    public void setType(PatronType type) {
        this.type = type;
    }

}
