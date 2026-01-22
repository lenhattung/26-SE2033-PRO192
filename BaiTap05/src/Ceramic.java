
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Ceramic extends Product{
    private String type;

    public Ceramic() {
    }

    
    public Ceramic(String code, String name, String make, double price, String type) {
        super(code, name, make, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s", getCode(), getName(), getMake(), getPrice(), getType());
    }
    
}
