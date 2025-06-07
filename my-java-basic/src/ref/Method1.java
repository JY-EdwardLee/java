package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        initStudent(student1, "학생1", 14, 60);

//        student1.name = "학생1";
//        student1.age = 15;
//        student1.grade = 60;

        Student student2 = new Student();
        initStudent(student2, "학생2", 18, 670);
//        student2.name = "학생2";
//        student2.age = 18;
//        student2.grade = 60;

        Student[] students;
        students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            printStudent(student);
        }

//        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
//        System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }
    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student1){
        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
    }
}
