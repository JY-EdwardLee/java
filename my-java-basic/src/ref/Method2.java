package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 60);
        Student student2 = createStudent("학생2", 18, 00);

        Student[] students;
        students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            printStudent(student);
        }
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

//    static void initStudent(Student student, String name, int age, int grade){
//        student.name = name;
//        student.age = age;
//        student.grade = grade;
//    }

    static void printStudent(Student student1){
        System.out.println(student1.name + " " + student1.age + " " + student1.grade);
    }
}
