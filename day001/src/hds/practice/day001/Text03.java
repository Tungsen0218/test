package hds.practice.day001;

import java.util.Scanner;

public class Text03 {
    public static void main(String[] args) {
        //获得所有扑克牌
        String[] puke = getPuke();
        System.out.println("请选择您抽取的牌号");
        System.out.println("请输入抽取的第一张扑克牌的牌号是:");
        Scanner scone = new Scanner(System.in);
        int num1 = scone.nextInt();
        System.out.println("=================");
        System.out.println("请输入抽取的第二张扑克牌的牌号是:");
        Scanner sctwo = new Scanner(System.in);
        int num2 = sctwo.nextInt();
        System.out.println("请输入抽取的第三张扑克牌的牌号是:");
        Scanner scthree = new Scanner(System.in);
        int num3 = scthree.nextInt();
        System.out.println("你抽取的三张扑克牌分别为" +puke[num1 - 1] +"," +puke[num2 - 1] +","+puke[num3 - 1]);


    }
    private static String[] getPuke(){
        String[] colors = {"黑桃","红桃","梅花","方块"};
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] puke = new String[54];
        int index = 0;
        for (int i = 0; i <colors.length ; i++) {
            for (int j = 0; j < nums.length; j++) {
                puke[index] = colors[i]+nums[j];
                index++;
            }
        }
            puke[52] = "小王";
            puke[53] = "大王";
            return puke;
        }


}
