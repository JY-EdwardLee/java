package hello.servlet.web.frontcontroller.v4;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v4.controller.MemberFormControllerV4;
import hello.servlet.web.frontcontroller.v4.controller.MemberListControllerV4;
import hello.servlet.web.frontcontroller.v4.controller.MemberSaveControllerV4;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@WebServlet(name="FrontControllerServletV4", urlPatterns = "/front-controller/v4/*")
public class FrontControllerServletV4 extends HttpServlet {

    // Map<키, 호출>
    private Map<String, ControllerV4> controllerMap = new HashMap<>();

    // contruct -> select None
    public FrontControllerServletV4() {
        // put(url, 요청컨트롤러)
        controllerMap.put("/front-controller/v4/members/new-form", new MemberFormControllerV4());
        controllerMap.put("/front-controller/v4/members/save", new MemberSaveControllerV4());
        controllerMap.put("/front-controller/v4/members", new MemberListControllerV4());

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServletV4.service");

        // request로 들어온 URI (front-ControllerV4/v2/{*})
        String requestURI = request.getRequestURI();

        // ControllerV4 hashmap으로 ControllerV4 객체 사용
        ControllerV4 controller = controllerMap.get(requestURI);
        if (controller==null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        // 이제는 paramMap을 넘겨줘야 한다.
        Map<String, String> paramMap = createParamMap(request);
        Map<String, Object> model = new HashMap<>(); // 추가
        String viewName = controller.process(paramMap, model);

        MyView view = viewResolver(viewName);

        // 모델을 렌더와 함께 넘겨줘야 함
        view.render(model, request, response);
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
