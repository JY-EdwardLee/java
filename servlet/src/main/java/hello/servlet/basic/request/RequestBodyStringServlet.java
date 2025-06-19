package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
* 이건 문자로 주고 받는법, json은 따로 잇음
* */
@WebServlet(name="requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream(); //byte 코드로 받기
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8); // String으로 변환

        System.out.println("messageBody = " + messageBody); // http 메시지 바디에 넣은 값 그대로 출력

        response.getWriter().write("ok");
    }
}
