package winterbe.java.treeMap;

import java.util.Comparator;

/**
 * @author: lq
 * @CreateTime:2018-10-23 14:41
 * @Description:todo
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p, Person p2) {

        int ret = p.getName().compareTo(p2.getName());
        if(ret == 0){
            return p.getAge().compareTo(p2.getAge());
        }
        return ret;
    }
}

