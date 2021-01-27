package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency {
    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    //  ONLY a getter for the 'id' field.
    public int getId() {
        return id;
    }
}
