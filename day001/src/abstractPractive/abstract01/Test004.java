package abstractPractive.abstract01;

public class Test004 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("文立斌",51,"C语言");
        teacher.teach();
        Student student = new Student("黄东升",18,100);
        student.exam();
    }
}
