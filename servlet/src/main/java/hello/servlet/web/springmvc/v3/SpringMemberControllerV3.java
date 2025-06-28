package hello.servlet.web.springmvc.v3;

import hello.servlet.domain.Member;
import hello.servlet.domain.MemberRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    // ModelAndView로 반환하지 않고, 문자로 반환해도 알아서 스프링에서 해석
//    @RequestMapping(value="new-form", method= RequestMethod.GET)
    @GetMapping("/new-form")
    public String newForm() {

        return "new-form";
    }

//    @RequestMapping(method=RequestMethod.GET)
    @GetMapping
    public String members(Model model) {

        List<Member> members = memberRepository.findAll();

        model.addAttribute("members", members);
        return "members";
    }

//    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @PostMapping("/save")
    public String save(@RequestParam("username") String username,
                             @RequestParam("age") int age,
                             Model model) {
        Member member = new Member(age, username);
        memberRepository.save(member);

        model.addAttribute("member", member);
        return "save-result";
    }

}
