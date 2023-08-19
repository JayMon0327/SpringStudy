package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);

    }

    static class TestBean{

        @Autowired(required = false)
        public void setNoBean1(Member noBean1) { // 의존관계 없으면 호출 X
            System.out.println("noBean1 = " + noBean1);
        }
        @Autowired
        public void setNoBean2(@Nullable Member noBean2) { // 의존관계 없으면 호출은 되는데 null 이 됨.
            System.out.println("noBean1 = " + noBean2);
        }
        @Autowired
        public void setNoBean3(Optional<Member> noBean3) { // 의존관계 없으면 Optional.empty
            System.out.println("noBean1 = " + noBean3);
        }
    }


}
