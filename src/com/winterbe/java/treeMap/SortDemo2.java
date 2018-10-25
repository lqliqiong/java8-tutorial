package winterbe.java.treeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author: lq
 * @CreateTime:2018-10-23 14:27
 * @Description:todo
 */
//  compareTo 实现机制：对于字符串来说，字典排序规则；对于数字来说，直接按照大小排序
public class SortDemo2 {

    private final static int SIZE = 30;

    public static void main(String[] args) {
        System.out.println("---------------- key 为 Sting 排序结果-----------------");
        String s = new String();
        createTreeMap(s);
        System.out.println("---------------- key 为 Long 排序结果-----------------");
        Long l = new Long(0);
        createTreeMap(l);
    }

    public static void createTreeMap(Object obj) {

        TreeMap<Object, Object> map = new TreeMap<>(new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String) {
                    return ((String) o1).compareTo((String) o2);
                } else if(o1 instanceof Long && o2 instanceof Long) {
                    return ((Long) o1).compareTo((Long) o2);
                }
                return 0;
            }

        });

        for(int i = 1; i<SIZE; i++) {
            if(obj instanceof String) {
                map.put(String.valueOf(i), String.valueOf(i));
            }
            if(obj instanceof Long) {
                map.put(Long.valueOf(i), Long.valueOf(i));
            }
        }

        print(map);
    }

    public static void print(Map<Object, Object> map) {
        Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

