package RandomandArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while(true) {
            System.out.println("请选择你要进行的操作：");
            System.out.println("1.录入信息");
            System.out.println("0.退出程序");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    inputStu(list, scanner);
                    break;
                case 0:
                    System.out.println("录入完毕");
            }
            if (i == 0) {
                break;
            }
        }

            for (int i = 0; i <list.size() ; i++) {
                Student student = list.get(i);
                student.show();
            }
    }
    private static void inputStu(ArrayList<Student> list,Scanner scanner){

        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();

        Student student = new Student(name,age); //将输入的姓名和年龄的地址给student
        list.add(student);                       //再把student 放到List中

    }
}
