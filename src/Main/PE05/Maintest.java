package PE05;

import java.util.Collections;
import java.util.List;

public class Maintest {
    //sorting list of students
    public List<Student> sortinglist(List<Student> studentList1) {


        SortStudents ss=new SortStudents();

        Collections.sort(studentList1,ss);                      //sorting list of students in decreasing order
        return studentList1;
    }
}
