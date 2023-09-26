package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 롬복덕분에 Logger log 선언 안해도됨
@RestController //Controller 애노테이션은 return값이 뷰로 반환이 되어버리는데, 이건 문자열이 그대로 반환된다.
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace(" trace log={}", name);
        log.debug(" debug log={}", name);
        log.info(" info log ={}", name);
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);
        return "ok";
    }
}
