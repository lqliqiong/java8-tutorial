package winterbe.arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author: lq
 * @CreateTime:2018-10-23 19:08
 * @Description:todo
 */
public class Tree {
   private int size;
   private  int[] l;

    public Tree(int size,int pRoot) {
        l=new int[size];
        this.size = size;
        for(int i : l){
          l[i]=0;
        }
        l[0]=pRoot;
    }

    Tree destoryTree(){
        return null;
    }


    /**
     * 根据索引寻找节点
     * @param nodeIndex
     * @return
     */
    int  SearchNode(int nodeIndex){

        if(nodeIndex<=0||nodeIndex>=size){
            return  -1;
        }
        if(l[nodeIndex]==0){
            return -1;
        }

      return l[nodeIndex];
    }

    /**
     * 添加节点
     * @param nodeIndex
     * @param directuon
     * @param pNode
     * @return
     */
    boolean  AddNode(int  nodeIndex ,int directuon,int pNode){
//        if(l.length<=0||l.length>=size){
//            return  false;
//        }
//        if(l[nodeIndex]==0){
//            return false;
//        }

        if(directuon==0){
            if(nodeIndex*2+1>=size){
                return  false;
            }
            if(l[nodeIndex*2+1]!=0){
                return false;
            }
            l[nodeIndex*2+1]=pNode;
            return true;
        }

        if(directuon==1){
            if(nodeIndex*2+2>=size){
                return  false;
            }
            if(l[nodeIndex*2+2]!=0){
                return false;
            }
            l[nodeIndex*2+2]=pNode;
            return true;
        }
    return false;
    }


    /**
     * 删除节点
     * @param nodeIndex
     * @param pNode
     * @return
     */
    boolean  DeleteNode(int  nodeIndex ,int pNode){
        if(nodeIndex<=0||nodeIndex>=size){
            return  false;
        }
        if(l[nodeIndex]==0){
            return false;
        }
        pNode=l[nodeIndex];
        l[nodeIndex]=0;
        return true;
    }

    /**
     * 遍历节点
     */
    void TreeTraverse(){
          for(int a : l){
              System.out.println(a);
          }
    };


    int  getSize(){
        return  size;
    }

}


