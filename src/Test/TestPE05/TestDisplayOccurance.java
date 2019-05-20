package TestPE05;

import PE05.DisplayOccurance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestDisplayOccurance {
    DisplayOccurance d;

    @Before
    public void setUp(){
        //arrange
        d=new DisplayOccurance();
    }
    @Test
    public void countAndDisplayTest()
    {
        //test if given string contains values more than one time

        String input="one one -one___two,,three,one @three*one?two";
        Map<String,Integer> expected= new HashMap<String, Integer>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        Map<String,Integer> result=d.countAndDisplay(input);
        assertEquals(expected,result);
    }
    @Test
    public void countAndDisplayFailureTest()
    {
        //test if given string contains values more than one time is failed

        String input="one one -one___two,,three,one @three*one?two";
        Map<String,Integer> expected= new HashMap<String, Integer>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",3);
        Map<String,Integer> result=d.countAndDisplay(input);
        assertNotEquals(expected,result);
    }
    @After
    public void tearDown(){
        d=null;
    }
}
