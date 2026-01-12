
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
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student("01", "Le Nhat Tung", 2006, 9.5);

        System.out.print("Input n: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] sts = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input student " + i + ": ");
            System.out.print("Id: ");
            String id = sc.nextLine();
            System.out.print("Fullname: ");
            String fullName = sc.nextLine();
            System.out.print("Year of birth: ");
            int yearOfBirth = Integer.parseInt(sc.nextLine());
            System.out.print("Gpa: ");
            double gpa = Double.parseDouble(sc.nextLine());
            sts[i] = new Student(id, fullName, yearOfBirth, gpa);
        }

//        for (int i = 0; i < n; i++) {
//            sts[i] = new Student();
//            System.out.println("Input student " + i + ": ");
//            System.out.print("Id: ");
//            sts[i].setId(sc.nextLine());
//            System.out.print("Fullname: ");
//            sts[i].setFullName(sc.nextLine());
//            System.out.print("Year of birth: ");
//            sts[i].setYearOfBirth(Integer.parseInt(sc.nextLine()));
//            System.out.print("Gpa: ");
//            sts[i].setGpa(Double.parseDouble(sc.nextLine()));
//        }
//        
//        for (Student st : sts) {
//            System.out.println(st);
//        }
        // In header
        System.out.printf("%-10s %-25s %-15s %-10s %-10s%n", "ID", "Full Name", "Year of Birth", "GPA", "Passed");

        // In data
        for (Student st : sts) {
            System.out.printf("%-10s %-25s %-15d %-10.2f %-10s%n",
                    st.getId(),
                    st.getFullName(),
                    st.getYearOfBirth(),
                    st.getGpa(),
                    st.checkPass() ? "Yes" : "No");
        }
    }

}
