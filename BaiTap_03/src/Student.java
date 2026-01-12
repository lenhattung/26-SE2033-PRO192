/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class Student {
    private String id;
    private String fullName;
    private int yearOfBirth;
    private double gpa;

    // default constructor 
    public Student() {
    }

    // constructor with parameters
    public Student(String id, String fullName, int yearOfBrith, double gpa) {
//        this.id = id;
//        this.fullName = fullName;
//        this.yearOfBirth = yearOfBrith;
//        this.gpa = gpa;
          setId(id);
          setFullName(fullName);
          setYearOfBirth(yearOfBirth);
          setGpa(gpa);
    }

    
    public boolean checkPass(){
        return gpa>=5.0;
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", yearOfBrith=" + yearOfBirth + ", gpa=" + gpa + ", Passed: "+ checkPass() + "}";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth<1)
            this.yearOfBirth = 1;
        else
            this.yearOfBirth = yearOfBirth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa>=0 && gpa<=10)
            this.gpa = gpa;
        else
            this.gpa =0;
    }
    
    
}
