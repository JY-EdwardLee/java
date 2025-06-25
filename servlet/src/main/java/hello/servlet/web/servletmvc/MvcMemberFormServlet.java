package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="MvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 그냥 jsp로 가주면 됨, service 호출하면, view path를 다시 호출 함
        // redirect 아님, forward 방식임 클라이언트 입장에선 호출 1번으로 침
        // WEB-INF는 반드시 컨트롤러를 통해서만 jsp가 불러지길 바랄 때, 이럻게 하는 규칙임 (외부에서 호출 불가)
        String viewPath = "/WEB-INF/views/new-form.jsp";
        // 컨트롤러 -> 뷰
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        // 서블릿에서 호출
        dispatcher.forward(request, response);
    }
}
