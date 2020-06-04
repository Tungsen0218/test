package RandomandArrayList;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public void show(){
        System.out.println("学生姓名为：" +name );
        System.out.println("年龄：" +age);
    }
}
