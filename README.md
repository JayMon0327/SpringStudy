# 🌱 김영한의 스프링 완전 정복 시리즈.
  ## [📚 Study Note - 스프링](https://jaymon.notion.site/96d0b84674ce4bed8244263be3d947f6?pvs=4)
     
- ### 🌱 Spring Introduction - 코드로 배우는 스프링부트, 웹 MVC, DB 접근기술 
  <details> 
   <summary> 📑 정리 </summary>
  
   1. `프로젝트 환경 설정과 라이브러리 살펴보기` 
   - 스프링 부트를 활용하여 프로젝트를 설정하고 필요한 라이브러리를 살펴봤다. 이 과정을 통해 view 템플릿 세팅과 Jar와 Gradle로 실행하는법을 학습했다.
   2. `MVC 패턴과 템플릿 엔진 활용: 정적 컨텐츠` 
   - 템플릿 엔진, API 등 다양한 방식으로 웹 페이지와 데이터를 처리하는 방법을 학습했다. MVC 패턴을 통해 웹 개발의 구조를 이해하고, 템플릿 엔진을 활용하여 동적인 웹 페이지를 생성하는 방법을 숙지했다.
   3. `회원 관리 예제 구현` 
   - 실제 비즈니스 요구사항을 기반으로 회원 도메인과 메모리 레포지토리를 개발하고, JUnit 등을 활용하여 테스트 케이스를 작성했다. 이를 통해 코드의 신뢰성과 안정성을 보장하는 방법을 학습했다.
   4. `스프링 빈과 의존관계 관리` 
   - 스프링의 핵심 개념인 빈과 의존관계를 이해하고, 컴포넌트 스캔과 수동 등록 방식을 사용하여 스프링 컨테이너에 빈을 등록하는 방법을 학습했다.
   5. `웹 MVC 개발` 
   - 홈 화면 및 회원 등록, 조회 기능을 가진 웹 애플리케이션을 개발하면서, 웹 요청을 컨트롤러가 처리하고 서비스에서 비즈니스 로직을 처리하는 과정을 학습했다.
   6. `스프링 DB 접근 기술` 
   - 가벼운 H2 데이터베이스를 사용하여 스프링의 DB 접근 기술을 학습했다. 
   - JDBC와 JdbcTemplate을 사용하여 데이터베이스와 상호작용하는 방법을 학습했다.
   7. `AOP 적용` 
   - AOP를 사용하여 관심사를 분리하고 공통 로직을 모듈화하는 방법을 학습했다. 이를 통해 코드의 중복을 줄이고 유지보수성을 높일 수 있었다.
      
  * #### 🙋‍♂️ 간단한 웹 애플리케이션을 개발하면서 스프링은 어떤 기능들이 있는지 얇고 넓게 알아봤다. 스프링부트는 처음 사용해보는 입장에서 실제 실무에서 사용되는 기술들은 어떤게 있는지 학습할 수 있었고, 앞으로 어떤 부분을 중점적으로 해야하는지 방향이 잡히는 것 같다.
  </details>
  
- ### 🌱 Spring Core - 스프링 핵심원리 기본편
  <details> 
   <summary> 📑 정리 </summary>
  
   1. `객체지향 설계와 스프링`
   - 스프링은 객체지향적인 설계 원칙과 개념에 기반하여 개발해야 한다.
   - 다형성과 같은 객체지향의 원리를 통해 유연하고 확장 가능한 코드를 작성할 수 있다.
   2. `스프링 핵심 원리 이해, 예제 만들고 객체지향 원리 적용`
   - 예제를 통해 스프링의 핵심 개념을 이해하고, 객체지향 원리를 어떻게 적용하는지 경험했다.
   3. `스프링 컨테이너와 스프링 빈`
   - 스프링 컨테이너가 어떻게 동작하는지 이해하고, 스프링 빈을 어떻게 등록하는지 학습했다.
   - 객체의 라이프사이클을 스프링 컨테이너가 어떻게 관리하는지 알고, 이를 통해 빈의 생성과 소멸을 관리하는 방법을 학습했다.
   4. `싱글톤 컨테이너`
   - 스프링은 대부분의 빈을 싱글톤으로 관리한다. 이를 통해 메모리를 효율적으로 사용할 수 있다.
   - @Configuration 어노테이션과 같은 기능을 활용하여 스프링 컨테이너가 빈을 생성하고 관리하는 방식을 이해했다.
   5. `컴포넌트 스캔`
   - 컴포넌트 스캔은 어노테이션을 활용하여 자동으로 빈을 등록하는 방법이다.
   - @ComponentScan을 이용하여 특정 패키지 내의 컴포넌트들을 스캔하고 빈으로 등록하는 방법을 학습했다.
   6. `의존관계 자동 주입`
   - 의존관계 주입(DI)의 개념과 필요성을 이해했다.
   - 스프링은 의존관계 주입(DI)을 통해 객체 간의 의존성을 자동으로 해결해준다.
   - @Autowired 어노테이션을 사용하여 스프링 컨테이너가 의존성을 주입하는 방법을 학습했다.
   7. `빈 생명주기 콜백`
   - 스프링 빈의 생성부터 소멸까지의 라이프사이클을 이해하고 제어하는 방법을 학습했다.
   - 초기화와 소멸 단계에서 콜백 메서드를 활용하는 방법을 학습했다.
   8. `빈 스코프`
   - 스프링 빈의 스코프에는 싱글톤 외에도 프로토타입, 웹 관련 스코프 등이 있다.
   - 각 스코프의 특징과 활용 방법을 학습했다.
      
  * #### 🙋‍♂️ 스프링이 단순히 기능만 가지고 배워야 되는게 아니라 진짜 중요한건 객체지향 원리를 가지고 해야한다. 예제를 만들어보고 비즈니스 요구사항을 바꿔보니까 문제가 생겼다. 이럴때 객체지향이 가진 다형성 만을 가지고 해결 되는게 아니라 DI 컨테이너나 의존관계 주입이 적용이 되야 객체지향을 정말 제대로 사용할 수 있었다. 스프링이 왜 만들어졌고, 왜 필요한지, 그리고 객체 지향 설계와 스프링이 왜 뗄 수 없는 관계인지 이해했다. 핵심원리에 대해서 학습을 했기 때문에 앞으로 스프링 웹 MVC, 스프링 데이터 접근 기술, 스프링 부트를 포함해서 스프링의 핵심기술을 활용하는 수 많은 스프링 기술들을 배우고 사용할 때도, 단순한 기능 사용을 넘어서 깊이있는 이해가 가능할 것 같다.
  </details>

 - ### 🌱 모든 개발자를 위한 HTTP 웹 기본 지식
   <details> 
    <summary> 📑 정리 </summary>
  
   1. `인터넷 네트워크` 
   - 강의에서는 HTTP를 이해하기 위해 기본적인 네트워크 지식이 필요하다는 점을 강조했다. IP, TCP, UDP, 포트, DNS와 같은 기본 개념에 대해 학습했다. URI와 웹 브라우저 요청 흐름에 대해서 학습했고, URI, URL, URN의 정의에 대해서 학습했다.
   2. `URI와 웹 브라우저 요청 흐름` 
   - URI의 종류와 웹 브라우저가 HTTP 메시지를 어떻게 생성하고 서버에 전달하며 응답을 받는지에 대해 네트워크 계층과 흐름을 위주로 학습했다.
   3. `HTTP 기본` 
   - HTTP의 클라이언트-서버 구조와 Stateful과 Stateless에 대한 무상태성 개념을 이해했다. 비연결성과 HTTP 메시지 구조에 대한 기본 개념을 습득했다.
   4. `스프링 빈과 의존관계 관리` 
   - HTTP 메서드의 필요성과 종류(GET, POST, PUT, PATCH, DELETE)를 학습하면서 메서드 없이 HTTP API URI를 만들어보면서 이해했다. 또한 안전성, 멱등성, 캐시 가능성과 같은 속성에 대해서도 학습했다.
   5. `HTTP 메서드 활용` 
   - HTTP 메서드를 활용하는 방법에 대해 학습했다. 클라이언트에서 메시지를 쿼리스트링, 폼 데이터, HTTP 본문을 통해 데이터를 전송하는 방법과 API 설계 예시를 살펴보았다.
   6. `HTTP 상태코드` 
   - 다양한 HTTP 상태코드(2xx, 3xx, 4xx, 5xx)를 학습하며 클라이언트와 서버 간 통신에서 발생할 수 있는 상황을 학습하고, 특히 클라이언트 오류는 빨리 알아차려야 코드의 오류를 파악할 수 있다는 것을 이해했다.
   7. `HTTP 헤더1 - 일반헤더` 
   - HTTP 헤더의 종류와 역할을 이해했다. 일반 헤더, 표현 헤더, 협상 헤더, 전송 방식과 관련된 헤더, 일반 정보, 특별한 정보, 인증, 쿠키에 대해 학습했다.
   8. `HTTP 헤더 2 - 캐시와 조건부 요청` 
   - 캐시의 기본 동작, 검증 헤더, 조건부 요청에 대한 내용을 이해했다. 또한 프록시 캐시와 캐시 무효화에 대해서도 학습했다.
      
    * #### 🙋‍♂️ 이번 강의를 통해 HTTP와 웹 기본지식에 대한 이해를 높였으며, 네트워크부터 HTTP 메서드 활용, 헤더, 상태코드, 캐시까지 다양한 주제를 다루었다. 특히, API를 클라이언트 측에 넘길 때나, HTTP 상태코드에 대한 정보를 정확히 정리할 수 있게 되서 한 단계 성장한 것 같다.
  </details>

- ### 🌱 스프링 MVC
   <details> 
    <summary> 📑 정리 </summary>
  
   1. `웹 애플리케이션` 
   - 웹서버와 웹 애플리케이션 서버 , 서블릿, 동시요청 멀티쓰레드를 배우면서 기존에 있던 HTTP 웹지식을 활용하여 전체적인 흐름을 이해할 수 있었다.
   2. `서블릿` 
   - httpServletRequest, httpServletResponse에 대해 배우고 HTTP 요청 데이터( GET 방식의 쿼리스트링 POST방식의 form, HTTP API방식의 메세지 바디에 직접 데이터가 넘어오는방식 )를 자세하게 학습했다.
   3. `서블릿, jsp, mvc 패턴` 
   - 서블릿으로만 하니까 jsp의 뷰 템플릿 기능이 약해서 힘듬, jsp 기능을 다 담자니 모든 코드들이 jsp하나에 들어가니 jsp의 부담이 커졌다. 그래서 분리를 해서 로직은 서블릿으로 해결하고 뷰 템플릿은 jsp로 해결하봤다. MVC 패턴은 문지기 역할을 할 수 있는 컨트롤러가 없어서 공통처리를 하기가 어려운 한계가 있었다.
   4. `MVC 프레임워크 만들기` 
   - 프론트 컨트롤러 역할을 도입하면서 점진적으로 v1, v2 ,v3 ,v4, v5 까지 구조를 추가하면서 애플리케이션을 발전시켰다. 마지막 v5는 어댑터 패턴을 도입하면서 v1이나 v2 도 v5에서 원할때 사용할 수 있었다. v5 버전까지 개발하고 나니 스프링 mvc 구조가 만들었던 mvc 프레임워크와 동일한 구조였다. 덕분에 구조를 파악하는데 있어서 프레임워크를 직접 만들어보는게 도움이 됐다.
   5. `스프링 MVC 구조 이해` 
   - 앞서 프레임워크를 만들때 프론트 컨트롤러가 스프링 MVC 의 DispatcherSelvet라고 생각하니 구조를 이해하기 굉장히 쉬웠다. 핸들러매핑과 핸들러 어댑터, 뷰 리졸버의 관계에 대해서 더 깊게 이해할 수 있었다.
   6. `스프링 MVC 기본기능`
   - <img width="681" alt="iShot_2023-09-09_06 53 56" src="https://github.com/JayMon0327/SpringStudy/assets/124110982/9d96043e-f292-46d4-b3b8-68374f9b537c">   
   - 로깅에 대한 기능을 알아보고, 기본적으로 요청을 매핑하는 방법, HTTP 요청의 헤더조회, 방법과 HTTP 요청파라미터(@RequestParam, @ModelAttribute), HTTP 응답(정적리소스, 동적 웹(뷰 템플릿), HTTP API)에 대한 자세한 기능들을 학습했다. 메세지 컨버터는 뷰로 전달되는것이 아니고, 직접 HTTP 메세지 바디에 담겨서 전달이 된다는 점이 특징이다. 메시지 컨버터가 어떤 위치에서 호출이 되는것인지 Argument Resolver(@RequestBody,HttpEntity)와 어떤 관계인지 알아보았다.
   7. `스프링 MVC - 웹 페이지 만들기`
   - <img width="683" alt="iShot_2023-09-09_06 54 04" src="https://github.com/JayMon0327/SpringStudy/assets/124110982/85ec7a30-1676-441c-9676-512983f298de"> 
   - 상품목록을 생성 조회 수정하는 간단한 웹 애플리케이션을 만들어보면서, 정적 HTML과 타임리프에 대해서 기본적인 문법을 학습했고, 등록을 처리할땐 @ModelAttribute의 사용법에 대해서 자세히 배웠는데 첫번째로, 요청 파라미터를 처리하면서 객체를 만들고 setter를 통해 값을 주입하고 보내준다. 두번째로, 모델에 자동으로 modelAttribute 값이 담긴다. 
PRG (post/redirect/get) 을 사용하는 이유와 PRG를 위해 @RedirectAttributes로 리다이렉트를 더 쉽게 사용할 수 있는 방법을 학습했다.
   - <img width="687" alt="iShot_2023-09-09_06 54 16" src="https://github.com/JayMon0327/SpringStudy/assets/124110982/90e53ed0-4124-413e-b07f-8c48bd940cfe">
      
    * #### 🙋‍♂️ 이번 강의를 통해서 기존 국비지원 교육에서 배웠던 MVC 패턴에 대해서 복습할 수 있는 기회가 되었고, 바로 직전에 학습했던 '모든 개발자를 위한 웹 HTTP 기본지식'에서 배웠던 부분들이 파라미터를 처리하거나, HTTP요청과 응답 데이터를 이해하는데 있어서 큰 도움이 되었다. 이전에는 MVC 패턴을 그저 도메인과 뷰를 분리한다거나 비즈니스로직과 뷰를 컨트롤러를 통해서 구현한다는 느낌이었는데 서블릿패턴부터 jsp,mvc 패턴을 점진적으로 발전시켜나가며 왜 뷰 리졸버가 필요하고, 핸들러 매핑과 핸들러 어댑터가 필요한지, 어떤 이유로 생겨나게 됐는지를 알게되었다. 전체적인 흐름만을 생각하고 웹 개발을 해오고 있었는데 HTTP 요청을 할때는 검증을 하지만, 응답을 보낼때는 왜? 검증을 하지 않는가 같은 기본적이면서도 디테일한 부분들을 놓치고 있었다는걸 알게 되었다.   
  </details>
