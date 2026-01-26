
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class Student {

    private String id, name;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gpa=" + gpa + '}';
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Id: ");
        this.id = sc.nextLine();
        System.out.print("Input Name: ");
        this.name = sc.nextLine();
        System.out.print("Input GPA: ");
        try {
            this.gpa = Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
