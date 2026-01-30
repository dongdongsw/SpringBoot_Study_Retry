package com.example.demo;

public class Spring_1 {

	/*
	 * 비즈니스 로직이란 무엇인가
	 * 		ㄴ 사용자의 요구를 서비스 규칙에 맞게 처리하는 코드
	 * 
	 * Spring이란 무엇인가
	 * 		ㄴ 엔터프라이즈용 Java 애플리케이션 개발을 쉽고 편리하게 해주는 오픈소스 경량급 애플리케이션 프레임워크이다
	 * 			ㄴ 1. 앤터프라이즈 : Enterprise => 기업, 회사, 대규모 사업
	 * 					ㄴ 규모가 크고, 규칙이 복잡하고, 오래가야하는 시스템이라고 볼 수 있다.
	 * 			ㄴ 2. 애플리케이션 : 신청서, 지원서, 응용프로그램/앱, 적용/응용
	 * 					ㄴ 사용자가 어떠한 목적을 이루기 위해 쓰는 프로그램이다.
	 * 			ㄴ 3. 경량급 : 가벼운
	 * 					ㄴ 불가피하게 작성해야하는 복잡한 코드를 제거하여 코드의 복잡성을 낮췄다는 말이다.
	 * 			ㄴ 4. 프레임워크 : 애플리케이션의 기본 구조나 뼈대
	 * 
	 * Spring의 특징이란
	 * 			ㄴ 1. POJO 프로그래밍을 지향
	 * 					ㄴ POJO => Plain Old Java Object
	 * 							ㄴ 순수 Java만을 통해서 생성한 객체를 의미
	 * 					ㄴ PO : 순수
	 * 							ㄴ 특정 기술 / 프레임워크에 종속되지 않는다.
	 * 					ㄴ JO : 일반적인 자바 객체
	 * 							ㄴ 평범한 자바 객체이다.
	 * 					ㄴ POJO가 아닌건 다른 특정한 기술에 종속되는것
	 * 							ㄴ class MyClass extends HttpServlet{
	 * 
	 * 							  }
	 * 			ㄴ 2. IOC 
	 * 					ㄴ IOC : Inversion Of Control => 제어의 역전
	 * 							ㄴ 객체생성과 관리 권한을 개발자가 아닌 Spring이 가져간다.
	 * 					ㄴ 기존
	 * 							ㄴ 개발자가 객체를 만든다.
	 * 							ㄴ 개발자가 직접 연결한다.
	 * 							ㄴ 개발자가 직접 흐름을 제어한다.
	 * 					ㄴ 현재
	 * 							ㄴ Spring이 객체를 만든다.
	 * 							ㄴ Spring이 연결해준다.
	 * 							ㄴ 필요할 때만 내 코드를 호출한다.
	 * 					ㄴ 결론 : 제어권이 개발자 -> Spring 프레임워크로 이동
	 * 
	 * 			ㄴ 3. DI
	 * 					ㄴ DI : Dependency Injection => 의존성 주입
	 * 							ㄴ 필요한 객체를 직접 만들지 않고 받아서 쓴다.
	 * 					ㄴ 결합도가 낮아진다
	 * 							ㄴ 결합도 : 클래스간 의존 정도
	 * 					ㄴ 변경에 강하다
	 * 				
	 * 					ㄴ Spring이 객체를 주입해준다.
	 * 							ㄴ 주입해준다 : 보통은 BoardService bService = new BoardService(); 이렇게 객체를 생성한다.
	 * 										그런데 Spring이 private final BoardService bService;로 주입을 받을 공간을 만든다.
	 * 										이때 생성자인 
	 * 											public BoardController(BoardService bService){
	 * 												this.bService = bService;
	 * 											} bService를 같이 만들어야 한다. 이렇게 생성자를 만들면 실제로 bService에게 주입이된다.
	 * 										Spring 내부에서 BoardService bService = new BoardService(); 이거자체를 생성한다.
	 * 										그래서 생성자를 통해 bService에 주입이된다.
	 * 
	 * 			ㄴ 4. AOP
	 * 					ㄴ AOP : Aspect-Oriented Programming => 관점 지향 프로글래밍
	 * 							ㄴ 비즈니스 로직과 공통 기능을 분리하는 방법이다.
	 * 									ㄴ 공통 기능 : 여러곳에서 반복적으로 쓰이는 코드이다.
	 *                                              그러나 비즈니스 로직은 아니다.
	 * 					ㄴ AOP를 사용하는 이유
	 * 							ㄴ 중복 코드를 제거하고 유지보수를 쉽게하기 위해서
	 * 							ㄴ 비즈니스 로직의 순수성을 유지하기 위해서
	 * 									ㄴ 비즈니스 로직이 아닌 코드를 섞지마라는 것 
	 * 
	 * 			ㄴ 5. PSA
	 * 					ㄴ PSA : Portable Service Abstraction => 바꿀 수 있는 기술 추상화
	 * 							ㄴ 기술이 바뀌어도 코드를 거의 안고치게 해주는 구조
	 * 					ㄴ 어떻게 처리하는지는 Spring이 대신 관리
	 * 
	 * 					ㄴ 기술을 직접 사용하지 않게 해주는 구조
	 * 							ㄴ 보통 yml로 설정을 하는데 개발자는 이 기술을 사용하자, 이 환경이다 이런것들만 알려주는거고 
	 *                            실제로는 Spring 직접 연결, 제어, 사용과정을 처리한다.
	 * 
	 * 			ㄴ 6. Container
	 * 					ㄴ Container => 용기, 그릇, 대형상자
	 * 							ㄴ Spring이 객체들을 만들어서 보관하고 필요할 떄 꺼내서 연결해주는 공간
	 * 					ㄴ Container을 사용하는 이유
	 * 							ㄴ IOC, DI, AOP, PSA와 같은 Spring의 핵심 기능을 수행하기 위해 객체들을 중앙에서 관리할 필요가 있기 떄문이다.
	 * 					ㄴ Container가 관리하는 객체를 Bean이라고 부른다.
	 * 							
	 * 	
	 * 			ㄴ 7. Bean
	 * 					ㄴ Bean => 콩, 작은 알갱이, 열매
	 * 							ㄴ IOC, DI, AOP, PSA와 같은 Spring의 핵심 기능은 Bean을 대상으로 적용된다.
	 * 					ㄴ Spring Container가 생성하고 생명주기를 관리하는 객체이다.
	 * 							ㄴ 생명주기란 객체 Bean이 언제 만들어지고 언제 사용되고, 언제 사라지는지의 흐름이다.
	 * 					ㄴ Singleton
	 * 							ㄴ Bean은 기본적으로 하나만 만들어진다.
	 * 					ㄴ 하나의 Bean을 여러 곳에서 공유하여 사용하기 때문에 메모리 효율과 관리가 용이하다.
	 * 
	 * SpringBoot란 무엇인가
	 * 		ㄴ Spring을 설정없이 바로 쓰게 해주는 도구
	 * 
	 */
	
}
