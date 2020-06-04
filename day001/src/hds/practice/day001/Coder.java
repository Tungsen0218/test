package hds.practice.day001;

public class Coder {
    private String name;
    private int id;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Coder(String name, int id, int salary) {

        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Coder() {

    }
    public void intro(){
        System.out.println("员工的姓名：" + name);
        System.out.println("员工的工号：" +id);
    }
    public void showSalary(){
        System.out.println("员工的工资："+salary +"奖金： 无");
    }
    public void work(){
        System.out.println("工号为" +id +"的员工正在拼命敲代码");
    }
}
