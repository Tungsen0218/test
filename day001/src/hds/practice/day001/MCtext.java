package hds.practice.day001;

import java.util.Scanner;

public class MCtext {
    public static void main(String[] args) {

        int[] salary = {15000,3000};

        Manager m =  new Manager();
        System.out.println("请输入您的姓名：");
        Scanner sc = new Scanner(System.in);
        String mname = sc.next();
        m.setName(mname);

        System.out.println("请输入您的工号：");
        Scanner sc1 = new Scanner(System.in);
        int  mid = sc.nextInt();
        m.setId(mid);

        m.setSalary(salary);
        m.setId(mid);
        m.intro();
        m.showSalary();
        m.work();

        Coder  c = new Coder("kobe",0025,10000);
        c.intro();
        c.showSalary();
        c.work();

    }
}
