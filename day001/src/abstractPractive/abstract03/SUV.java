package abstractPractive.abstract03;

public class SUV extends Auto {
    private int miniLength = 4295;
    private int midLength = 5070;

    public SUV(double length, double price) {
        super("SUV",length, price);
    }
    //判断小型车
    public boolean miniSUV(){
      return getLength() <= miniLength;
    }
    //判断大型车
    public boolean largeSUV(){
        return getLength() > midLength;
    }
    //中型车
    public boolean midSUV(){
        return getLength() > miniLength && getLength()<= midLength;
    }
}
