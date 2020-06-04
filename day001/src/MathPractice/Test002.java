package MathPractice;
import jdk.nashorn.api.tree.WhileLoopTree;

import java.util.Scanner;

//键盘录入QQ号码，验证格式的正确性。
//  * 必须是5—12位数字。
//  * 0不能开头。
public class Test002 {
    public static void main(String[] args) {
        //1.键盘输入一个QQ号码字符串
       while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的QQ号码：");
            String qq = sc.next();
            boolean isOk = checkQQ(qq);
            System.out.println("这个QQ号是否正确：" + isOk);
        }
    }
    /*
     * 定义方法：checkQQ (String qq)方法内实现验证
     * 指定方法的名称：checkQQ
     * 指定方法的参数：String qq
     * 指定方法的返回值：boolean
     */
    public  static boolean checkQQ(String qq){
        //1.验证字符串的长度5—12位之间；
        if (qq.length() < 5 || qq.length() > 12) {
            System.out.println("QQ号码长度有误");
            return false; //长度不正确
        }
        //2.验证首位字符不能是字符0；只能是字符'1'--'9'
        if (qq.charAt(0) == '0') {
            System.out.println("qq号码的第一位字符不得为0");
            return false;
        }
        //3.验证字符串中的每个字符都必须是数字字符‘0’-‘9’之间的字符
        for (int i = 0; i < qq.length() ; i++) {
            char ch = qq.charAt(i);
            //判断字符是否在 数字字符‘0’-‘9’之间的字符
            if (ch < '0'|| ch > '9') {
                System.out.println("QQ号码中含有非数字字符");
                return false;

            }
        }
        return true;
    }

}
