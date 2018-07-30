package models;

import java.util.Date;
import java.util.Objects;

public class Person {

    private String CNP; // sau int ??
    String firstName="",lastName="";
    String gender="alian";
    Date dateOfBirth;
    Date yearOfDrivingLicense;

    public Person()
    {

    }

    public Person(String CNP, String firstName, String lastName, String gender, Date dateOfBirth, Date yearOfDrivingLicense) {
        this.CNP = CNP;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.yearOfDrivingLicense = yearOfDrivingLicense;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getYearOfDrivingLicense() {
        return yearOfDrivingLicense;
    }

    public void setYearOfDrivingLicense(Date yearOfDrivingLicense) {
        this.yearOfDrivingLicense = yearOfDrivingLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(CNP, person.CNP) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(dateOfBirth, person.dateOfBirth) &&
                Objects.equals(yearOfDrivingLicense, person.yearOfDrivingLicense);
    }

    @Override
    public int hashCode() {

        return Objects.hash(CNP, firstName, lastName, gender, dateOfBirth, yearOfDrivingLicense);
    }

    @Override
    public String toString() {
        return "Person{" +
                "CNP='" + CNP + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", yearOfDrivingLicense=" + yearOfDrivingLicense +
                '}';
    }

    public Person(String CNP, String firstName, String lastName, String gender, Date yearOfDrivingLicense) {
        this.CNP = CNP;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.yearOfDrivingLicense = yearOfDrivingLicense;
    }
}
