package hds.practice.day001;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("请输入你的半径：");
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        int r0 = sc.nextInt();
        circle.setR(r0);
        circle.showArea();
        circle.showPerimer();
    }
}
