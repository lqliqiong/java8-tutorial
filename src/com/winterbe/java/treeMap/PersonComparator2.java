package winterbe.java.treeMap;

import java.util.Comparator;

/**
 * @author: lq
 * @CreateTime:2018-10-23 14:41
 * @Description:todo
 */
public class PersonComparator2 implements Comparator<Person> {
    @Override
    public int compare(Person p, Person p2) {
        return p.getMind().compareTo(p2.getMind());
    }
}

