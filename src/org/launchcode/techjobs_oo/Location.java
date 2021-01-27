package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location {
    private int id;
    private static int nextId = 1;
    private String value;

    public Location() {
        id = nextId;
        nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    public void Location() {
        // It should call the first constructor to initialize the id field.
        this.id;
    }

    // It must also initialize the value field for a new Location object.
    public void Location(String val) {
        this.value = val;
    }



    // Custom toString, equals, and hashCode methods:

    // Customize toString method
    @Override
    public String toString() {
        return value;
    }

    // Customize equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }
    // Customize hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
