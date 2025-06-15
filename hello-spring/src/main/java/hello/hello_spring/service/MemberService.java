package hello.hello_spring.service;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

//@Service // 이걸 써줘야 스프링에서 서비스인지 안다
public class MemberService {

    private final MemberRepository memberRepository;

    // DI(Dependency Injection) 의존성 주입
//    @Autowired // 이 녀석이 생성될 때 리포지토리랑 연결해줌
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long join(Member member) {
        // optional로 감싸서 ifPresent 가능
        // 물론 .orElseGet() 같은 걸 쓰는 수도 있음
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();

    }

    //option command m 으로 메서드로 검증과정 만들기
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 멤버입니다.");
                });
    }
    /*
    * 전체 회원 조회
    * */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
