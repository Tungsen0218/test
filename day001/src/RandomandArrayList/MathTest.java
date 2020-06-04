package RandomandArrayList;

public class MathTest {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);//取得绝对值
            if (abs > 6 || abs < 2.1) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有：" + count);
    }
}
