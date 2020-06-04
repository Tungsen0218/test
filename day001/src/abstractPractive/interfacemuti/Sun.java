package abstractPractive.interfacemuti;

public class Sun extends Star implements Universe {

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着九大行星");
    }
    @Override
    public void shine(){
        System.out.println("sun:光照八分钟,到达地球");  //继承进行腹写
    }
}
