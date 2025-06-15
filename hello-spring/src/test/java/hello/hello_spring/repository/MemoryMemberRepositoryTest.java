package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

// 굳이 public 안해도 됨
// 클래스 레벨에서 동시에 비교 가능
class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 테스트 시 의존성 문제를 해결하기 위해 메모리 클린 해줘야 함
    @AfterEach // 끝나고 매번 실행
    public void afterEach() {
        // MemoryMem~ 에서 만들어놓은 청소하는 메소드
        repository.clearStore();
    }


    @Test
    public void save() {
        Member member = new Member();
        member.setName("Spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        //Assertions.assertEquals(member, result);
        //member가 저장한 result와 같냐?
        assertThat(member).isEqualTo(result); // option enter로 스태틱 임포트해라
    }
    // 이름으로 찾기 테스트
    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring2").get();
        // member1에 저장된 이름과 이름 검색으로 얻은 result를 비교
        assertThat(result).isEqualTo(member2);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
        // 테스트 시 의존성 문제가 생김
    }
}
