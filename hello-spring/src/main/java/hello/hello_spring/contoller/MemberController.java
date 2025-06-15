package hello.hello_spring.contoller;

import hello.hello_spring.domain.Member;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

// 이걸 만들기만 해도 스프링을 킬 때 객체를 생성해서 스프링 컨테이너에 넣어두고 관리를 함
// 이걸 스프링 빈이라고 함
@Controller
public class MemberController {

    // new로 받으면 가져다 쓸 떄 문제가 생김
    private final MemberService memberService;

    @Autowired // 생성을 할 때, 생성자가 호출이 되는데 => 스프링 컨테이너의 멤버 서비스를 딱 연결해줌
    // 연결을 시켜줄라고 하는데 순수한 자바 클래스 MemberService를 컨트롤러가 알 수가 없다.
    // 이게 의존성 주입이다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        System.out.println(member.getName());
        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
