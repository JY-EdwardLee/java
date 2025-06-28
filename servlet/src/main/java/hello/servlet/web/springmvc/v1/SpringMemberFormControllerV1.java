package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Component아님
// 스프링이 자동으로 스프링 빈으로 등록 (controller안에 Component가 있어서 스캔됨)
// 스프링 MVC에서 어노테이션 기반 컨트롤러로 인식함
@Controller
public class SpringMemberFormControllerV1 {

    //URL이 요청하면 메서드가 호출 (메서드 이른 자율적으로)
    //RequestMappingHandlerMapping은 스프링 빈 중에서 @RequestMapping똔느 @Controller가 **클래스 레벨**에 있어야 함
    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
