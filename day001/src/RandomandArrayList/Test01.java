package RandomandArrayList;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String s = verifyCode();
            System.out.println("随机验证码：" +s);
        }
    }
        public static String verifyCode() {
            char[] arr = {'0', '1', '2', '3', '4', '5', '6',
                    '7', '8', '9', 'A', 'B', 'C', 'D', 'E',
                    'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                    'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
                    'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                    't', 'u', 'v', 'w', 'x', 'y', 'z'};
            Random random = new Random();
            String code = "";                             //成员变量要初始化,字符串则为：""
            for (int i = 0; i < 6; i++) {
                int index = random.nextInt(arr.length);  //从0到 arr.length的范围中选择赋值
                code += arr[index];
            }
            return code;
        }


    }

