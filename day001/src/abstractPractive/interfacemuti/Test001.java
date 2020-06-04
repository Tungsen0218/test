package abstractPractive.interfacemuti;

public class Test001 {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("=====================");
        Universe universe = new Sun();  //多态好处：无论右边的子类对象怎么变,左边调用方法永远不变
        universe.doAnything();

        Sun sun =(Sun) universe;  //注意格式：子类名称 对象名 = (子类名称） 父类对象名
        sun.shine();
    }
}
