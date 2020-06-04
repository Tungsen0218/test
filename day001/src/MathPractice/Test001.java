package MathPractice;

import java.util.Scanner;

public class Test001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("录入的字符串：" +next);
        String s = reverseStr(next);
        System.out.println("翻转的字符串："+s);


    }
    public static String reverseStr(String str) {
        String s = "";
        char[] chars = str.toCharArray();
        for (int i = chars.length -1; i >= 0 ; i--) {
            s+=chars[i];
        }
        return s;
    }
}
