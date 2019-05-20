package PE05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyTrue {

    public Map<String,Boolean> identifyCount(String[] str)
    {
        Map<String, Boolean> map=new HashMap<String, Boolean>();

        int index1=0,index2=0,index3=0,index4=0;
        boolean status=false;
        String a= Arrays.toString(str);                     //converting array into string
        String key1="a";
        String key2="b";
        String key3="c";
        String key4="d";
        Pattern p1 = Pattern.compile(key1);                 //finding  given key1
        Matcher m1 = p1.matcher(a);                         //matching with string input
        while (m1.find()) {
            index1++;
            if(index1>1) {
                status = true;
            }else
            {
                status=false;
            }
        }
        map.put(key1,status);

        Pattern p2 = Pattern.compile(key2);                 //finding  given key2
        Matcher m2 = p2.matcher(a);                         //matching with string input
        while (m2.find()) {
            index2++;
            if(index2>1) {
                status = true;
            }else
            {
                status=false;
            }
        }
        map.put(key2,status);

        Pattern p3 = Pattern.compile(key3);                 //finding  given key3
        Matcher m3 = p3.matcher(a);                         //matching with string input
        while (m3.find()) {
            index3++;
            if(index3>1) {
                status = true;
            }else
            {
                status=false;
            }
        }
        map.put(key3,status);

        Pattern p4 = Pattern.compile(key4);                 //finding  given key4
        Matcher m4 = p4.matcher(a);                         //matching with string input
        while (m4.find()) {
            index4++;
            if(index4>1) {
                status = true;
            }else
            {
                status=false;
            }
        }
        map.put(key4,status);
        return map;
    }


    }


