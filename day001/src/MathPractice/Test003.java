package MathPractice;

import java.util.Scanner;

public class Test003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.键盘录入一个大字符串，再录入一个小字符串
        System.out.println("请输入大字符串：");
        String big = sc.nextLine();
        System.out.println("请输入小字符串：");
        String small = sc.nextLine();
        // 2.统计小字符串在大字符串中出现的次数
        int count = getCount(big,small);
        System.out.println("小字符串："+small +",在大字符串中共出现了"+count+"次");


    }

    /*
     * 方法功能：统计小字符串在大字符串中出现的次数
     * 参数：big 代表大字符串
     * 参数：small 代表小字符串
     * 返回值：小字符串在大字符串中出现的次数
     */
    public static int getCount(String big, String small) {
        int index = 0;
        int count = 0;
        /*
         * indexOf(String str, int fromIndex)
         * 该方法作用：从fromIndex位置开始查找，字符串str第一次出现的位置；若没找到，放回-1
         */
        while ((index = big.indexOf(small, index)) != -1) {
            index++;
            count++;
        }
        return count;
    }
}
