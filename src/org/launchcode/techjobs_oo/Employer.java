package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField { // extends to parent class
//    private int id;
//    private static int nextId = 1;  // static -- changing value is not stored within any Employer object
//    private String value;

//    public Employer() {  // first constructor accepts no arguments
////        id = nextId;  // assigns value of nextId num
////        nextId++;  // increments Id num
//    }
//
//    public Employer(String value) {  // second constructor
////        this();  // initializes id for the obj by calling the first constructor
////        this.value = value;
//    }

    public Employer(String value) {
        super(value);  // super class is JobField
    }


    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o; // casting to class Employer
//        return getId() == employer.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}
