package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// 이 인터페이스로 별에별 컨트롤러를 구현할 것
public interface ControllerV1 {

    // servlet과 똑같은 모양의 프로세스
    void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
