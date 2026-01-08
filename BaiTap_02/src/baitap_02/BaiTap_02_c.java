/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_02;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class BaiTap_02_c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;
        do {
            System.out.print("Nhap vao so luong phan tu: ");
            String line = sc.nextLine();
            
            try {
                n = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println("Co loi trong qua trinh nhap du lieu! Vui long nhap lai: ");
                n = 0;
            }
        } while (n <= 0);

        int a[] = new int[n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            String line = sc.nextLine();
            try {
                 a[i] = Integer.parseInt(line);
            } catch (Exception e) {
                 a[i] = 0;
            }
        }
        System.out.println("Mang gia tri:");
        for (int value : a) { // read only
            System.out.print(value + " ");
        }
    }
}
