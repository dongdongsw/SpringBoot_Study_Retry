package com.example.demo;

public class Spring_3 {

	/*
	 * 	Transaction이란 무엇인가? => 트랜잭션
	 * 			ㄴ 여러 데이터 작업을 하나의 작업 단위로 묶어서 전부 성공하거나 전부 실패하게 만드는 처리 단위 이다.
	 * 			ㄴ 보통 Service에서 사용한다.
	 * 					ㄴ 이유 => Service에서 비즈니스로직을 처리를 보통하는데 DB의 여러 작업이 함께 수행되기 때문이다.
	 * 			
	 * 	DTO와 Entity를 분리하는 이유는?
	 * 			ㄴ 보통 Entity는 저장과 관리하는 객체용도이다.
	 * 					ㄴ 그래서 외부에 노출되면 안되는 민감 정보이다.
	 * 					ㄴ 성능 문제도 포함된다.
	 * 			ㄴ DTO는 외부로 전달하기 위한 객체이다
	 * 			ㄴ 이러한 이유떄문에 분리한다.
	 * 
	 * 	Service와 ServiceImpl을 분리하는 이유는?
	 * 			ㄴ 느슨한 결합
	 * 					ㄴ Service는 인터페이스로 추상화이다
	 * 					ㄴ Service는 ServiceImpl이 바뀌어도 사용하는 코드쪽 코드가 영향 받지 않기 떄문이다.
	 * 		 	ㄴ 내가 하는 방식
	 * 					ㄴ Service 는 비즈니스 기능의 추상화를 담당했다.
	 * 					ㄴ ServiceImpl는 실제 비즈니스 로직을 구현했다.
	 * 					ㄴ Mapper는 데이터 접근만 담당할 수 있도록 구현했다.
	 * 
	 */
	
}
