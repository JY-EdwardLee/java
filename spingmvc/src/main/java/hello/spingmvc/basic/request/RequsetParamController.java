package hello.spingmvc.basic.request;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@Slf4j
@Controller
public class RequsetParamController {

    @RequestMapping("/request-param-v1")
    public void requestParamV1(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String username = request.getParameter("username");
        String a = request.getParameter("age");
        int age = Integer.parseInt(a);
        log.info("username={}, age={}", username, age);

        response.getWriter().write("ok");

    }

    // RestController와 같은 역할
    @ResponseBody
    @RequestMapping("/request-param-v2")
    public String requestParamV2(
            @RequestParam("username") String memberName,
            @RequestParam("age") int memberAge) {

        log.info("username={}, age={}", memberName, memberAge);
        return "ok";
    }

    // 생략하면 변수명이 같아야함
    @ResponseBody
    @RequestMapping("/request-param-v3")
    public String requestParamV3(
            @RequestParam String username,
            @RequestParam int age) {

        log.info("username={}, age={}", username, age);
        return "ok";
    }

    // 얘도 변수명 같아야 함
    @ResponseBody
    @RequestMapping("/request-param-v4")
    public String requestParamV4(String username, int age) {

        log.info("username={}, age={}", username, age);
        return "ok";
    }

    // 파라미터값 필수로 들어와야 할 때(required = true)
    @ResponseBody
    @RequestMapping("/request-param-required")
    public String requestParamRequired(
            @RequestParam String username,
            @RequestParam(required = false) Integer age) {

        // 자바에서 기본형은 null을 넣을 수 없음
        // 객체형인 Integer를 넣어야 함
        // null vs "";
        // 파라미터로 빈 문자를 넣어도 빈 문자가 들어왔다는 것 때문에 통과가 됨
        log.info("username={}, age={}", username, age);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/request-param-default")
    public String requestParamDefault(
            @RequestParam(defaultValue = "guest") String username,
            @RequestParam(required = false, defaultValue = "-1") int age) {

        // 빈 문자일 때도, 빈 값아닌 defautValue가 들어감
        log.info("username={}, age={}", username, age);
        return "ok";
    }

    // Map, MultiValueMap으로 조회 가능
    @ResponseBody
    @RequestMapping("/request-param-map")
    public String requestParamMap(@RequestParam Map<String, Object> paramMap) {

        // 만일 key값이 중복되는 게 잇다면 MultiValue로 받으면 된다.
        // List<>로 반환한다.
        log.info("username={}, age={}", paramMap.get("username"), paramMap.get("age"));
        return "ok";
    }
}
