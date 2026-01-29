
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class StudentList2 extends ArrayList<Student> {

    public void display() {
        for (Student st : this) {
            System.out.println(st);
        }
    }

    public boolean remove(String id) {
        Student student = null;
        for (Student st : this) {
            if (st.getId().equals(id)) {
                student = st;
            }
        }
        return this.remove(student);
    }

    public boolean update(String id) {
        for (Student st : this) {
            if (st.getId().equals(id)) {
                st.input(true);
                return true;
            }
        }
        return false;
    }
}
