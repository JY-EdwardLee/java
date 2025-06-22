package hello.servlet.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 실무에서는 concurrentHashMap, AtomicLong 사용 고려
* */
public class MemberRepository {

    private Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

//    싱글톤으로 만들 때는 아무나 사용 못하도록 private로 만들어야 함
    private MemberRepository() {
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        // store에 있는 모든 값 새로운 ArrayList에 담아서 넘겨줌
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
