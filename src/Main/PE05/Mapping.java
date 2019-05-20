package PE05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Mapping {
    public Map<String,String> valueChange(Map<String,String> Map1){
        Map<String,String> output=new HashMap<>();                         // declaration of map for output
        String[] key=new String[2];
        String[] value=new String[2];
        int i=0;
        Iterator<Map.Entry<String,String>> round=Map1.entrySet().iterator();
        while (round.hasNext()) {
            Map.Entry<String,String> mapEntry=round.next();
            key[i]=mapEntry.getKey();
            value[i]=mapEntry.getValue();
            i++;
        }

        //changing the values of keys

        String temp="";
        int flag=0;
        for(int j=0;j<key.length;j++) {
            if (key[j].equals("val1")) {
                temp = value[j];
                value[j] = " ";
                flag=1;
                break;
            }
        }
        if(flag==0) {
            return null;
        }
        for(int j=0;j<key.length;j++) {
            if(key[j].equals("val2")) {
                value[j]=temp;
                break;
            }
        }
        for(int k=0;k<key.length;k++) {
            output.put(key[k],value[k]);
        }
        return  output;
    }
}