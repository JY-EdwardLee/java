package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // GET이는 POST든 쿼리파라미터 방식을 받는 건 똑같음
        // POST HTML Form 방식으로 보낼 때는, 바디에 담아서 보내는 차이 (application/x-www-form-urlenceded)
        System.out.println("전파 조회 -start");
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println("paramName: " + paramName + "=" + request.getParameter(paramName)));
        System.out.println("전파 조회 -end");
        System.out.println();

        System.out.println("단파 조회-start");
        String username = request.getParameter("username");
        System.out.println("username = " + username); // 만일 동일한 키값이면 먼저 나온 녀셕
        System.out.println("단파 조회-end");

        // 여러가지 이름이 있으면 -> getParameterValues
        String[] usernames = request.getParameterValues("username");
        for (String name : usernames) {
            System.out.println("name = " + name);
        }


        response.getWriter().write("ok");

        /*
        * 사실 지금처럼 중복인 상황은 많이 없다.
        * 키값은 다르게 하는 게 정상임
        * 물론, 있긴함 그럴 땐 Values 붙이길
        */


    }
}
