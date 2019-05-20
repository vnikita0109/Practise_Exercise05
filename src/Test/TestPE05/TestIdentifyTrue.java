package TestPE05;

import PE05.IdentifyTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestIdentifyTrue {
    IdentifyTrue i;

    @Before
    public void setUp()
    {
        //arrange
        i=new IdentifyTrue();
    }
    @Test
    public void identifyCountTest()
    {
        //if test for identifying more than once is pass

        String[] input={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expected= new HashMap<String, Boolean>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        Map<String,Boolean> result=i.identifyCount(input);
        assertEquals(expected,result);
    }
    @Test
    public void identifyCountFailureTest()
    {
        //if test for identifying more than once failed

        String[] input={"a","b","c","d","a","c","c"};
        Map<String,Boolean> expected= new HashMap<String, Boolean>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",true);
        Map<String,Boolean> result=i.identifyCount(input);
        assertNotEquals(expected,result);
    }
    @After
    public void tearDown()
    {
        i=null;
    }
}
