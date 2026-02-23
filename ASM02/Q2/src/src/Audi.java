/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Audi extends Vehicle {

    private int releasedYear;
    private String color;

    public Audi() {
        setId("");
        setName("");
        setPrice(0);
        setQuantity(0);
        setReleasedYear(0);
        setColor("");
    }

    public Audi(String id, String name, double price, int quantity, String color, int releasedYear) {
        super(id, name, price, quantity);
        setReleasedYear(releasedYear);
        setColor(color);
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        if (releasedYear >= 2022 && releasedYear <= 2025) {
            this.releasedYear = releasedYear;
        } else {
            this.releasedYear = 2022;
        }
    }

    public String getColor() {
        return toTitleCase(color);
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("Black")
                || color.equalsIgnoreCase("White")
                || color.equalsIgnoreCase("Red")
                || color.equalsIgnoreCase("Gray")) {
            this.color = color;
        } else {
            this.color = "Black";
        }
    }

    @Override
    public double getSubTotal() {
        int x = 100;
        if (this.color.equalsIgnoreCase("Red") || this.getReleasedYear() == 2025) {
            x = 120;
        }
        return getPrice() * getQuantity() * x / 100;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.2f,%d,%.2f", getId(), getName(),getColor(),getReleasedYear(), getPrice(), getQuantity(), getSubTotal());
    }

}
