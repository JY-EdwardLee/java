package class1;

public class ClassStart5 {
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

        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].grade);
        }

        for (int i = 0; i < students.length; i++) {
            Student s = students[i]; // Student 클래스에서 만든 클랙스
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }
        for (Student s : students) {
            System.out.println(s.name + " " + s.age + " " + s.grade);
        } // iter

        // System.out.println(student1.name + " " + student1.age + " " + student1.grade);
        // System.out.println(student2.name + " " + student2.age + " " + student2.grade);
    }
}
