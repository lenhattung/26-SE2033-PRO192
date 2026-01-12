/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Student {
    public String id;
    public String fullName;
    public int yearOfBrith;
    public double gpa;

    // default constructor 
    public Student() {
    }

    // constructor with parameters
    public Student(String id, String fullName, int yearOfBrith, double gpa) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfBrith = yearOfBrith;
        this.gpa = gpa;
    }

    
    public boolean checkPass(){
        return gpa>=5.0;
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", yearOfBrith=" + yearOfBrith + ", gpa=" + gpa + ", Passed: "+ checkPass() + "}";
    }
    
    
}
