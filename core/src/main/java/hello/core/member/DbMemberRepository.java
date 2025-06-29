package hello.core.member;

public class DbMemberRepository implements MemberRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/hello";


    @Override
    public void save(Member member) {

    }

    @Override
    public Member findById(Long memberId) {
        return null;
    }
}
