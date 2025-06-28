package hello.spingmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 문자가 그대로 반환됨(body에 그대로 넣어버림)
// 원래 @Controller는 뷰를 찾고 뷰가 랜더링 됨
@Slf4j
@RestController
public class LogTestController {
    // SLf4j하면 롬복이 아래 코드 넣어줌
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "SPing";

        System.out.println("name = " + name);

        // {}안에 변수 들어감
        log.trace("trace log-{}", name);
        log.debug("debug log-{}", name); // 디버깅할 때
        log.info(" info log={}", name); // 비즈니스 정보
        log.warn(" warn log-{}", name); // 경고
        log.error("error log-{}", name); // 에러

        return "ok";
    }
}
