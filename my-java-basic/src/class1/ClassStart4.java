package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 60;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 60;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }
}
