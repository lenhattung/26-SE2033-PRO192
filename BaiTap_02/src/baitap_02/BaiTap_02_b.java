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
public class BaiTap_02_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;
        do {
            System.out.print("Nhap vao so luong phan tu: ");
            n = sc.nextInt();
        } while (n <= 0);

        int a[] = new int[n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mang gia tri:");
        for (int value : a) { // read only
            System.out.print(value + " ");
        }
    }
}
