package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v2.ControllerV2;
import hello.servlet.web.frontcontroller.v2.controller.MemberFormControllerV2;
import hello.servlet.web.frontcontroller.v2.controller.MemberListControllerV2;
import hello.servlet.web.frontcontroller.v2.controller.MemberSaveControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="FrontControllerServletV2", urlPatterns = "/front-ControllerV4/v2/*")
public class FrontControllerServletV2 extends HttpServlet {

    // Map<키, 호출>
    private Map<String, ControllerV2> controllerMap = new HashMap<>();

    // contruct -> select None
    public FrontControllerServletV2() {
        // put(url, 요청컨트롤러)
        controllerMap.put("/front-controller/v2/members/new-form", new MemberFormControllerV2());
        controllerMap.put("/front-controller/v2/members/save", new MemberSaveControllerV2());
        controllerMap.put("/front-controller/v2/members", new MemberListControllerV2());

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServletV2.service");

        // request로 들어온 URI (front-ControllerV4/v2/{*})
        String requestURI = request.getRequestURI();

        // ControllerV4 hashmap으로 ControllerV4 객체 사용
        ControllerV2 controller = controllerMap.get(requestURI);
        if (controller==null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        MyView view = controller.process(request, response);
        view.render(request, response);
    }
}
