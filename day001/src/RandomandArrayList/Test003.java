package RandomandArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test003 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(8);   //如何大量快速添加Arraylist集合的元素？
        list.add(9);
        System.out.println(list);
        replace(list,8,99);
        System.out.println(list);
        findIndex(list,9);

        }
    //在某集合中,查找某元素,返回第一次出现的索引
    public static int findIndex(List<Integer> list,int i) {
        int index= -1 ;
        for (int j = 0; j < list.size() ; j++) {
            if (list.get(j) == i){
                index = j;
                System.out.println(i+"号元素的索引是" +index);
                break;
            }
        }

        return index;

    }
    //将某集合中的元素,全部替换为新元素
    public  static void replace(List<Integer> list,Integer oldValue,Integer newValue){
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) == oldValue){
                list.set(i,newValue);
            }
        }
    }
}
