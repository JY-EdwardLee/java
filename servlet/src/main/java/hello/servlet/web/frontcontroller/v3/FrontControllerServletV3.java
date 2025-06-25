package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import hello.servlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="FrontControllerServletV3", urlPatterns = "/front-controller/v3/*")
public class FrontControllerServletV3 extends HttpServlet {

    // Map<키, 호출>
    private Map<String, ControllerV3> controllerMap = new HashMap<>();

    // contruct -> select None
    public FrontControllerServletV3() {
        // put(url, 요청컨트롤러)
        controllerMap.put("/front-controller/v3/members/new-form", new MemberFormControllerV3());
        controllerMap.put("/front-controller/v3/members/save", new MemberSaveControllerV3());
        controllerMap.put("/front-controller/v3/members", new MemberListControllerV3());

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServletV3.service");

        // request로 들어온 URI (front-controller/v2/{*})
        String requestURI = request.getRequestURI();

        // controller hashmap으로 controller 객체 사용
        ControllerV3 controller = controllerMap.get(requestURI);
        if (controller==null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // 이제는 paramMap을 넘겨줘야 한다.
        Map<String, String> paramMap = createParamMap(request);
        ModelView mv = controller.process(paramMap);

        String viewName = mv.getViewName();// 논리이름
        MyView view = viewResolver(viewName);

        System.out.println("mv = " + mv.getModel());
        // 모델을 렌더와 함께 넘겨줘야 함
        view.render(mv.getModel(), request, response);
    }

    private static MyView viewResolver(String viewName) {
        MyView view = new MyView("/WEB-INF/views/" + viewName + ".jsp");
        System.out.println("view = " + view.getClass());
        return view;
    }

    private static Map<String, String> createParamMap(HttpServletRequest request) {
        Map<String, String> paramMap = new HashMap<>();
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));
        System.out.println("paramMap = " + paramMap);
        return paramMap;
    }
}
