package com.example.demo;

public class Spring_4 {
/*
 * OOP 구성 요소
 * 	instance => 인스턴스
 * 			ㄴ 객체랑 같다
 * 			ㄴ 단지 관점차이만 있을 뿐
 * 					ㄴ User user1 = new User();
 * 					ㄴ User user2 = new User();
 * 							ㄴ user1, user2는 객체
 * 							ㄴ user1, user2 => User클래스의 인스턴스
 * 
 * 	Object => 객체 
 * 			ㄴ 클래스의 인스턴스, 배열
 * 
 * 	Class => 클래스, 수업, 등급, 급 ...
 * 			ㄴ 객체를 만들기 위한 틀
 * 
 * 	Method => 메서드
 * 			ㄴ 클래스 안에 있는 행동
 * 			ㄴ public void sayHello(){
 * 				System.out.print("Hello");
 * 			  }
 * 
 *  Parameter => 매개변수
 *  		ㄴ 메서드에 전달하는 값
 *  		ㄴ public void printName(String name){
 *  			System.out.print(name);
 *  		  }
 *  
 *  Constructor => 생성자
 *  		ㄴ 초기값을 넣어주는 것이다.
 *  		ㄴ public class User{
 *  			String name;
 *  			
 *  			public User(){ <=== 생성자
 *  				name = "홍길동"; <== 초기값 넣기
 *  			}
 *  		  }
 *  		ㄴ 특징
 *  			ㄴ 클래스 이름과 같다.
 *  			ㄴ 반환 타입이 없다.
 * 	 			ㄴ 객체 생성시 딱 한번만 실행됨
 *  
 *  new를 쓴다면 무슨일이 일어나는가?
 *  		ㄴ 1. 메모리 공간 확보
 *  		ㄴ 2. 필드 기본값 세팅
 *  				ㄴ int = 0
 *  				ㄴ String = null
 *  				ㄴ boolean = false
 *  		ㄴ 3. 생성자 실행
 *  				ㄴ public User(){
 *  					name = "홍길동";
 *  				  }
 *  		ㄴ 4. 객체 참조
 *  				ㄴ User user = new User("철수");
 *  				ㄴ public User(String name) {
					    this.name = name; <= 철수가 들어감
					  }
					  
			ㄴ 개발을 하다보면 
					ㄴ @Autowired, @RequiredArgsConstructor 이걸 쓰면 굳이 new를 사용하지 않는다.
							ㄴ 이유? 
								ㄴ Spring Container가 객체 생성과 관리를 대신해준다.
								ㄴ 관리가가 복잡해서 개발자가 직접 생성하지 않고 주입 받아서 사용한다. 
								ㄴ 이렇게 하면 결합도가 낮아지고 테스트와 유지보수가 쉬워진다.
								
	 this 키워드의 정확한 의미
	 		ㄴ this는 현재 객체 자신을 가리키는 참조변수이다.
	 		ㄴ public User(){
 *  			name = "홍길동"; <== 이게 this.name 이다
 *  		  }
	 		ㄴ public User(String name) {
			    this.name = name; <= 매개변수랑 구분할려고
			  }
 */
}
