
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class Tester {

    public static void main(String[] args) {
        StudentList myList = new StudentList();
        Scanner sc = new Scanner(System.in);
        int c = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Add new student");
            System.out.println("2. Display student list");
            System.out.println("3. Delete student");
            System.out.println("4. Update student");
            System.out.println("0. Exit");
            c = Integer.parseInt(sc.nextLine());
            switch (c) {
                case 1:
                    Student newStudent = new Student();
                    newStudent.input(false);
                    myList.add(newStudent);
                    break;
                case 2:
                    myList.display();
                    break;
                case 3:
                    System.out.println("Input student Id: ");
                    String id = sc.nextLine();
                    System.out.println(myList.remove(id) ? "Deleted!" : "Student not found!");
                    break;
                case 4:
                    System.out.println("Input student Id: ");
                    String stId = sc.nextLine();
                    System.out.println(myList.update(stId) ? "Updated!" : "Student not found!");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (c != 0);
    }
}
