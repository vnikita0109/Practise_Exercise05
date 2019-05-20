package PE05;

import java.util.Comparator;

public class SortStudents implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student std1 = (Student) o1;
        Student std2 = (Student) o2;

        if (std1.getAge() > std2.getAge()) {                        //comparison based on age difference
            return -1;
        }
        else if (std1.getAge() == std2.getAge()) {                  //if ages are same
            if (std1.getName().compareTo(std2.getName()) == -1) {   //compare based on name
                return 1;
            }
            else if (std1.getName().compareTo(std2.getName()) == 0) {     //if names are same
            if (std1.getId() > std2.getId()) {                             //compare based on id
                return -1;
            } else {
                return 1;
            }
        }
        return 1;
    }
    else{
        return 1;
        }
    }

}
