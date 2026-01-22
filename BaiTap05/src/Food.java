
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Food extends Product{
    private Date date;
    private Date expiredDate;

    public Food() {
    }

    

    public Food(String code, String name, String make, double price, Date date, Date expiredDate) {
        super(code, name, make, price);
        this.date = date;
        this.expiredDate = expiredDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
    
    
}
