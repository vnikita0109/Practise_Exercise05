package PE05;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayOccurance {
    public Map<String,Integer> countAndDisplay(String str)
    {
        Map<String,Integer> map=new HashMap<String, Integer>();
        int index1=0,index2=0,index3=0;

        String key1="one";                          //defining keys that need to be find in string
        String key2="two";
        String key3="three";
        Pattern p1 = Pattern.compile(key1);         //forming pattern
            Matcher m1 = p1.matcher(str);           //matching with string
            while (m1.find()) {
                index1++;
            }
            map.put(key1,index1);

        Pattern p2 = Pattern.compile(key2);         //forming pattern
            Matcher m2 = p2.matcher(str);           //matching with string
            while (m2.find()) {
                index2++;
            }
            map.put(key2,index2);

        Pattern p3 = Pattern.compile(key3);         //forming pattern
            Matcher m3 = p3.matcher(str);           //matching with string
            while (m3.find()) {
                index3++;
            }
            map.put(key3,index3);

        return map;
    }
}
