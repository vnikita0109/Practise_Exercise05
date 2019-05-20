package TestPE05;

import PE05.ReplaceAndEmpty;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestReplaceAndEmpty {
    ReplaceAndEmpty re;

    @Before
    public void setUp()
    {
        //arange
        re=new ReplaceAndEmpty();
    }
    @Test
    public void replaceElementAndEmptyAll()
    {
        //if test for sorting and replacing pass

        List<String> oldList= new ArrayList<String>();
        List<String> expected=new ArrayList<String>();
        List<String> result=re.replaceElementAndEmptyAll(oldList);
        assertEquals(expected,result);
    }
    @Test
    public void replaceElementAndEmptyAllFailure()
    {
        //if test for sorting and replacing fails

        List<String> oldList= new ArrayList<String>();
        List<String> expected=null;
        List<String> result=re.replaceElementAndEmptyAll(oldList);
        assertNotEquals(expected,result);
    }
    @After
    public void tearDown()
    {
        //arange
        re=null;
    }
}
