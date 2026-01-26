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
    
    public void add(Student student){
        if(count<list.length){
            list[count] = student;
            count++;
        }
    }
    public void display(){
        for(int i=0; i<count;i++){
            System.out.println(list[i]);
        }
    }
}
