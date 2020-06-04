package hds.practice.day001;

public class Manager {
    private String name;
    private int id;
    private int[] salary;

    public Manager() {
    }

    public Manager(String name, int id, int[] salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

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

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }
    public void intro(){
        System.out.println("经理的姓名：" +name );
        System.out.println("经理的工号" +id);

    }
    public void showSalary(){
        System.out.println("基本工资为：" + salary[0] + "奖金："+ salary[1]);
    }
    public void work() {
        System.out.println("经理正在喝茶tan空调");
    }
}
