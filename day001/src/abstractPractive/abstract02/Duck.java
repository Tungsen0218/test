package abstractPractive.abstract02;

public class Duck extends Polutry {
    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    public Duck() {
        //子类默认赠送一个super
    }
    @Override
    public void showSymptom(){
        System.out.println("症状为："+getSymptom());
    }

}
