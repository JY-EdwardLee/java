package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade STARTER = new ClassGrade();
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private로 생성자 생성을 제한해버리기
    private ClassGrade() {}
}
