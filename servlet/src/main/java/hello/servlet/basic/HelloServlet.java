package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello") // 중복 금지
public class HelloServlet extends HttpServlet {

    @Override // ^+o => service 열쇠 선택
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 웹브라우저가 http 요청 메시지를 만들어서 서버에 던져봄
        System.out.println("HelloServlet.service");
        // 구현채들
        System.out.println("request = " + request); //request = org.apache.catalina.connector.RequestFacade@1d0db367
        System.out.println("response = " + response); //response = org.apache.catalina.connector.ResponseFacade@

        String username = request.getParameter("username");
        System.out.println("username = " + username); // 쿼리파라미터에 넣은값

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);
    }
}
