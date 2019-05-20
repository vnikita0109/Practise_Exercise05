package TestPE05;

import PE05.Maintest;
import PE05.Student;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class TestStudent {
        private static Maintest std;
        @Before
        public void setUp() {
            std=new Maintest();
        }

        @Test
        public void sortListTest() {            //to check sorted and expected output is compared with desired output
            Student s1=new Student();
            s1.setId(1);
            s1.setName("mina");
            s1.setAge(20);

            Student s2=new Student();
            s2.setId(6);
            s2.setName("tina");
            s2.setAge(20);

            Student s3=new Student();
            s3.setId(8);
            s3.setName("rina");
            s3.setAge(22);

            Student s4=new Student();
            s4.setId(4);
            s4.setName("sina");
            s4.setAge(22);

            Student s5=new Student();
            s5.setId(5);
            s5.setName("lina");
            s5.setAge(24);

            List<Student> studentList1=new ArrayList<Student>();
            studentList1.add(s1);
            studentList1.add(s2);
            studentList1.add(s3);
            studentList1.add(s4);
            studentList1.add(s5);

            List<Student> expectedOutput=new ArrayList<>();
            expectedOutput.add(s5);
            expectedOutput.add(s3);
            expectedOutput.add(s4);
            expectedOutput.add(s1);
            expectedOutput.add(s2);

            assertEquals(expectedOutput,std.sortinglist(studentList1));
        }


    @Test
        public void sortListFailureTest() {            //to check sorted and expected output is not equivalent with desired output
        Student s1=new Student();
        s1.setId(1);
        s1.setName("mina");
        s1.setAge(20);

        Student s2=new Student();
        s2.setId(6);
        s2.setName("tina");
        s2.setAge(20);

        Student s3=new Student();
        s3.setId(8);
        s3.setName("rina");
        s3.setAge(22);

        Student s4=new Student();
        s4.setId(4);
        s4.setName("sina");
        s4.setAge(22);

        Student s5=new Student();
        s5.setId(5);
        s5.setName("lina");
        s5.setAge(24);


        List<Student> studentList1=new ArrayList<Student>();
            studentList1.add(s1);
            studentList1.add(s2);
            studentList1.add(s3);
            studentList1.add(s4);
            studentList1.add(s5);

            List<Student> expectedOutput=new ArrayList<>();
            expectedOutput.add(s1);
            expectedOutput.add(s4);
            expectedOutput.add(s5);
            expectedOutput.add(s2);
            expectedOutput.add(s3);

            assertNotEquals(expectedOutput,std.sortinglist(studentList1));
        }
    @After
    public void tearDown() {
        std=null;
    }
    }

