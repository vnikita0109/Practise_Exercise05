package PE05;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortElements {
    public Set<String> sortElements(String[] old) {         //to sort the elements
        Set<String> t=new TreeSet<>();
        for (int x=0;x<old.length;x++){
            t.add(old[x]);
        }
        return t;
    }

    public List<String> displayArrayList(Set<String> old){      //to display arraylist
        List<String> x=new ArrayList<>();
        x.addAll(old);
        return x;
    }
}