package winterbe.arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lq
 * @CreateTime:2018-10-23 19:11
 * @Description:todo
 */
public class TreeTest {
    public static void main(String[] args) {
        mainTest();

    }

    public static void mainTest() {
//        List l= new ArrayList();
//        l.size()
        /**
         * 3(0)
         * 5(1) 8(2)
         * 2(3)6(4)9(5)7(6)
         */
        int root=3;
        Tree t = new Tree(10,root);
        System.out.println(t.getSize());
        int  node1=5;
        int node2=8;
        t.AddNode(0,0,node1);
        t.AddNode(0,1,node2);
        int  node3=2;
        int node4=6;
        t.AddNode(1,0,node3);
        t.AddNode(1,1,node4);
        int  node5=9;
        int node6=7;
        t.AddNode(2,0,node5);
        t.AddNode(2,1,node6);
        t.TreeTraverse();


    }
}
