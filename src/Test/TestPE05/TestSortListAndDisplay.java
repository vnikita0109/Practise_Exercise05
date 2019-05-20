package TestPE05;

import PE05.SortElements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class TestSortListAndDisplay {
    SortElements s;
    @Before
    public void setUp()
    {
        //arrange
        s=new SortElements();
    }
    @Test
    public void sortElementsTest()
    {
        //test if actual output is equal to expected output

        String[] input={"Karan","Shiv","Madhu","Abhi"};
        Set<String> expected=new TreeSet<String>();
        expected.add("Abhi");
        expected.add("Karan");
        expected.add("Madhu");
        expected.add("Shiv");
        assertEquals(expected,s.sortElements(input));
        List<String> desiredOutput=new ArrayList<>();
        desiredOutput.addAll(expected);
        assertEquals(desiredOutput,s.displayArrayList(expected));
    }
    @Test
    public void sortElementsTestFailure()
    {
        //test if actual output is equal to expected output fails

        String[] input={"Karan","Shiv","Madhu","Abhi"};
        Set<String> expected=new TreeSet<String>();
        expected.add("Abhi");
        expected.add("Karan");
        expected.add("Madhuri");
        expected.add("Shiv");
        assertNotEquals(expected,s.sortElements(input));
        List<String> desiredOutput=new ArrayList<>();
        desiredOutput.addAll(expected);
        assertEquals(desiredOutput,s.displayArrayList(expected));
    }
    @After
    public void tearDown()
    {
        s=null;
    }
}
