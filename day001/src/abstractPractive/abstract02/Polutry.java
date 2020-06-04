package abstractPractive.abstract02;

public abstract class Polutry {
   private String name;
   private String symptom;
   private int age;
   private String illness;

    public Polutry(String name, String symptom, int age,String illness) {

        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public Polutry() {

    }
    public abstract void showSymptom(); //抽象方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void showMsg(){
        System.out.print("动物的种类："+name);
        System.out.println(",年龄："+age+"岁");
        System.out.println("入院原因："+illness);

    }
}
