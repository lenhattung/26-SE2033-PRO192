/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class ElectronicProduct extends Product{
    private String guaranty;
    private int voltage;
    private int power;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String code, String name, String make, double price, String guaranty, int voltage, int power) {
        super(code, name, make, price);
        this.guaranty = guaranty;
        this.voltage = voltage;
        this.power = power;
    }

    public String getGuaranty() {
        return guaranty;
    }

    public void setGuaranty(String guaranty) {
        this.guaranty = guaranty;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    
}
