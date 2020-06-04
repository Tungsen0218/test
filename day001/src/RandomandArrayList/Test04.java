package RandomandArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {

        ArrayList<Integer> numlist = getNumList();
        printCount(numlist);
    }
    public static void printCount(ArrayList<Integer> list){
        int[] count = new int[10];
        //对应保存数字出现的次数
        for (int i = 0; i < list.size() ; i++) {
           int c = list.get(i);
           count[c-1]++;
        }
        for (int i = 0; i < count.length ; i++) {
            System.out.println("数字：" +(i+1) + "--" + count[i] + "次");
        }
    }

    public  static ArrayList<Integer> getNumList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i <10 ; i++) {
          int x = r.nextInt(10) + 1; //随机生成100个数字，数字范围从1到10
          list.add(x);
        }
            return list;
        }

}
