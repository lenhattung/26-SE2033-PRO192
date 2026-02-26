/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Coffee extends Beverage {

    private int exprie;
    private String type;

    public Coffee() {
        super("", "", 0, 0);
        setExprie(0);
        setType("");
    }

    public Coffee(String id, String name, double price, int quantity, String type, int exprie) {
        super(id, name, price, quantity);
        setExprie(exprie);
        setType(type);
    }

    public int getExprie() {
        return exprie;
    }

    public void setExprie(int exprie) {
        if (exprie >= 1 && exprie <= 180) {
            this.exprie = exprie;
        } else {
            this.exprie = 180;
        }
    }

    public String getType() {
        return toTitleCase(type);
    }

    public void setType(String type) {
        if (type.equalsIgnoreCase("special")
                || type.equalsIgnoreCase("high")
                || type.equalsIgnoreCase("medium")
                || type.equalsIgnoreCase("low")) {
            this.type = type;
        } else {
            this.type = "medium";
        }
    }

    @Override
    public double subTotal() {
        double rate = 1.0;
        if(type.equalsIgnoreCase("special")||getId().startsWith("DB")){
            rate = 1.2;
        }else  if(type.equalsIgnoreCase("high")||getId().startsWith("HC")){
            rate = 1.1;
        }else  if(type.equalsIgnoreCase("medium") && getExprie()<=30){
            rate = 0.5;
        }
        return getPrice()*getQuantity()*rate;
    }
    
    

    
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d,%.2f,%d,%.2f", getId(), getName(), getType(),getExprie(), getPrice(), getQuantity(), subTotal());
    }

}
