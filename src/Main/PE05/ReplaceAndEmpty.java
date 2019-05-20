package PE05;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAndEmpty {

    public List<String> replaceElementAndEmptyAll(List<String> oldList)
    {
        oldList=new ArrayList<String>();
        oldList.add("apple");                   //adding elements to list
        oldList.add("grape");
        oldList.add("melon");
        oldList.add("berry");
        System.out.println(oldList);            //changing first element of array
        oldList.set(1,"kiwi");
        System.out.println(oldList);
        oldList.clear();                        //making list empty
        return oldList;
    }
}
