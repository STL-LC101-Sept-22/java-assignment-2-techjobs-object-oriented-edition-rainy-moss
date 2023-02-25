package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() { id = nextId; nextId++;}
    public JobField (String value){ this(); this.value = value; this.id = getId();}

    @Override
    public final String toString() {
        return value;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return getId() == that.getId();
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    public int getId() { return id;}
    public String getValue() { return value;}
    public void setValue(String value) { this.value = value;}


}
