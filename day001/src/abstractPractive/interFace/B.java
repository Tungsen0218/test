package abstractPractive.interFace;

import java.sql.SQLOutput;

public class B implements A{

    @Override
    public void showA() {  //实现类要重写接口的抽象类型
        System.out.println("AAAA");
    }
    public static void showD(){
        System.out.println("DDDD");
    }

}
