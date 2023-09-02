package hello.servlet.web.frontcontroller.v5.adapter;

import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;
import hello.servlet.web.frontcontroller.v5.MyHandlerAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ControllerV3HandlerAdapter implements MyHandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof ControllerV3); //v3에 해당하는 값이 들어오게 되면 true, 아니면 false
    }

    @Override
    public ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        ControllerV3 controller = (ControllerV3) handler; //핸들러를 컨트롤러 V3로 변환한 다음에 V3 형식에 맞도록 호출

        Map<String, String> paramMap = createParamMap(request);

        ModelView mv = controller.process(paramMap);

        return mv;
    }
    private Map<String, String> createParamMap(HttpServletRequest request) {
        Map<String, String> paramMap = new HashMap<>();
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));
        return paramMap;
    }

}
