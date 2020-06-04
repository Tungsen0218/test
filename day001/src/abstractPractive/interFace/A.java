package abstractPractive.interFace;

public interface A {
    public abstract void showA(); //定义抽象方法

    //public default void showB(){  //定义默认方法
    //  System.out.println("这是接口的默认方法");
    private static void show10(String str){   //定义私有方法
        for (int i = 0; i < 10; i++) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    static void showB10(){
        show10("BBBB");
    }
    static void showC10(){
        show10("CCCC");
    }





}
