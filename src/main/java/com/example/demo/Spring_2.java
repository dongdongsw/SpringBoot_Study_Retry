package com.example.demo;

public class Spring_2 {

	/*
	 * MVC란 무엇인가?
	 * 		ㄴ 화면, 로직, 요청 처리를 역할별로 나눈 구조이다.
	 * 				ㄴ Model => 모형, 구조
	 * 						ㄴ 데이터, 비즈니스 로직 (Service, DTO, Entity, VO, DAO, Repository)
	 * 								ㄴ Service : 비즈니스 로직이 있는 곳
	 * 								ㄴ DTO(Data Transfer Object) : 데이터 전달용 객체
	 * 										ㄴ Entity -> DTO -> View(JSON/HTML) 이렇게 전달
	 * 								ㄴ Entity : DB테이블과 1:1로 매핑되는 객체
	 * 								ㄴ VO(Value Object) : 값 자체를 표현하는 객체
	 * 								ㄴ DAO(Data Access Object) : DB에 접근하는 객체
	 * 										ㄴ 거의 안씀
	 * 										ㄴ Repository : DAO의 현대적인 이름
	 * 												ㄴ Jpa에서 사용
	 * 						ㄴ 보통 JPA를 사용하면 Controller -> Service -> Repository -> Entity -> DTO -> View
	 * 						ㄴ Mybatis를 사용하면  Controller -> Service -> Mapper/Repository -> VO -> View
	 * 				ㄴ View => 보다, 전망, 견해
	 * 						ㄴ HTML, JSON 응답(프론트)
	 * 						ㄴ 사용자에게 보여지는 결과
	 * 				ㄴ Controller => 제어장치, 감사관
	 * 						ㄴ 요청을 받고 어디로 보낼지를 결정
	 * 
	 * CRUD란 무엇인가?
	 * 		ㄴ 데이터가 할 수 있는 기본 행동 4가지
	 * 				ㄴ Create => 생성
	 * 						ㄴ DB에 데이터를 저장한다.
	 * 						ㄴ @PostMapping
	 * 				ㄴ Read => 읽다
	 * 						ㄴ DB에 있는 데이터를 읽는다.
	 * 						ㄴ @GetMapping
	 * 				ㄴ Update => 수정
	 * 						ㄴ DB에 있는 데이터를 수정한다.
	 * 						ㄴ @PutMapping, @PatchMapping
	 * 				ㄴ Delete => 삭제
	 * 						ㄴ DB에 있는 데이터를 삭제한다.
	 * 						ㄴ @DeleteMappingg
	 * 		ㄴ 사실 이러한 매핑은 크게 의미가 없는 것 같다.
	 * 		ㄴ HTTP요청의 ㅡ이도를 표현하기 위해서 사용하는 것 같다.
	 * 		ㄴ 결국에는 서비스 비즈니스 로직에서 어떻게 처리하냐에 따라 달라지기 때문이다.
	 * 
	 */
	
}
