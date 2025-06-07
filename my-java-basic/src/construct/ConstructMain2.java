package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 14, 80);
        MemberConstruct member2 = new MemberConstruct("user1", 14);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println(member.grade);
        }
    }
}
