package hds.practice.day001;

import java.sql.SQLOutput;

public class Text04 {
    public static void main(String[] args) {
     char[] charArray = {'a','l','f','m','f','o','b','b','s','n'};

    }
    public static void printCount(char[] charArry){
        int[] count = new int[26];
        for (int i = 0; i < charArry.length ; i++) {
            int c = charArry[i];
            count[c - 97]++;
        }
        for (int i = 0,ch = 97; i < count.length ; i++,ch++) {
            if (count[i] != 0){
                System.out.println((char) ch + "--" + count[i]);
            }
        }
    }

}
