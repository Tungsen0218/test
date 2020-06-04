package hds.practice.day001;

public class Circle {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Circle() {

    }
    public void showArea(){
        System.out.println("圆的面积是：" + 3.14*r*r);
    }
    public void showPerimer(){
        System.out.println("圆的周长是："+2*3.14*r );
    }
}
