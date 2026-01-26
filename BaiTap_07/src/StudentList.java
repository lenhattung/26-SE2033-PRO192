/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tungi
 */
public class StudentList {

    private Student[] list;
    private int count;

    public StudentList() {
        count = 0;
        this.list = new Student[100];
    }

    public StudentList(int capacity) {
        count = 0;
        this.list = new Student[capacity];
    }

    public void add(Student student) {
        if (count < list.length) {
            list[count] = student;
            count++;
        } else {
            System.out.println("Error! Can not add new student.");
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }

   

    public boolean remove(String id) {
        boolean deleted = false;
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equals(id)) {
                for (int j = i; j < count; j++) {
                    list[j] = list[j + 1];
                }
                count--;
                deleted = true;
                break;
            }
        }
        return deleted;
    }
    
    public Student search(String id) {
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equals(id)) {
                return list[i];
            }
        }
        return null;
    }
    
    public boolean update(String id){
        boolean check = false;
        for (int i = 0; i < count; i++) {
            if (list[i].getId().equals(id)) {
                Student newStudent = new Student();
                newStudent.setId(id); // copy lai ID
                newStudent.input(true); // Nhap moi name va gpa
                list[i]=newStudent;
                check = true;
                break;
            }
        }
        return check;
    }
     
     

}
