package abstractPractive.interFace;

public class Test001 {
    public static void main(String[] args) {
        A.showB10(); //接口的静态方法：类名称.方法名
        A.showC10();
        B b = new B();
        b.showA();
        B.showD();  //类的静态方法：类名称.方法名


    }
}
