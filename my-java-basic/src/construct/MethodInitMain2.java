package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15,30);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 15,30);

        MemberInit[] members = {member1, member2};
        for (MemberInit member : members) {
            System.out.println(member.name);
        }
    }
    static     void initMember(MemberInit member, String name, Integer age, Integer grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
