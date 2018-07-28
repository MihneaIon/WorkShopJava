package models;

import java.util.Objects;

public class Vehicle {

    private int registrationNumber=0,manufacturingYear=0;
    private String brand="",color="";
    private Type type;

    public Vehicle()
    {

    }

    public Vehicle(int registrationNumber, int manufacturingYear, String brand, String color, Type type) {
        this.registrationNumber = registrationNumber;
        this.manufacturingYear = manufacturingYear;
        this.brand = brand;
        this.color = color;
        this.type=type;

    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return registrationNumber == vehicle.registrationNumber &&
                manufacturingYear == vehicle.manufacturingYear &&
                Objects.equals(brand, vehicle.brand) &&
                Objects.equals(color, vehicle.color) &&
                type == vehicle.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(registrationNumber, manufacturingYear, brand, color, type);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber=" + registrationNumber +
                ", manufacturingYear=" + manufacturingYear +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", type=" + type +
                '}'+"\n";
    }
}
