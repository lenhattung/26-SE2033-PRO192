/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Test {
    public static void main(String[] args) {
        Product p = new Product("001", "Tivi 32inches", "Snoy", 1000000);
        Ceramic c = new Ceramic("02", "Bat su", "Minh Long", 20000, "dia");
        Product p1 = new ElectronicProduct("03", "O cam dien", "Dien quang", 20000, "12 thang", 220, 50);
        System.out.println(p);
        System.out.println(c);
    }
}
