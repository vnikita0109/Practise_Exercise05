package TestPE05;

import PE05.Mapping;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMapping {
    private static Mapping pair;
    @Before
    public void setup()
    {
        pair=new Mapping();
    }


    @Test
    public void valueChangeTest() {

        //to check value of key1 to empty and key2 to value of key1

        Map<String,String> Map1=new HashMap<>();
        Map1.put("val1","java");
        Map1.put("val2","c++");
        Map<String,String> expectedOutput=new HashMap<>();
        expectedOutput.put("val1"," ");
        expectedOutput.put("val2","java");

        assertEquals(expectedOutput,pair.valueChange(Map1));
    }
    @Test
    public void valueChangeTestFailure() {

        //check if values does not match to expected ones

        Map<String,String> Map1=new HashMap<>();
        Map1.put("val1","java");
        Map1.put("val2","c++");
        Map<String,String> expectedOutput=new HashMap<>();
        expectedOutput.put("val1","java ");
        expectedOutput.put("val2","c++");

        assertNotEquals(expectedOutput,pair.valueChange(Map1));
    }
    @Test
    public void ifGivenKeyNotFound() {

        //crosschecking if values are not found

        Map<String,String> Map1=new HashMap<>();
        Map1.put("val3","java");
        Map1.put("val2","c++");
        assertEquals(null,pair.valueChange(Map1));
    }
    @After
    public static void  tearDown()
    {
        pair=null;
    }
}