package com.example.demo;

public class Spring_5 {
/*
  접근 제어자
	  	public => 어디서든 사용 가능하다.
	  
	  	protected => 같은 패키지 + 상속 관계
	  
	 	default => 같은 패키지 안에서만 접근 가능
	  			ㄴ 	--User.java--
					class User {
					    int age;   // default 접근제어자
					}
					
					--UserService.java (같은 패키지)--
					public class UserService {
					    public void test() {
					        User user = new User();
					        user.age = 20;   // 가능
					    }
					}
					
					--OrderService.java (다른 패키지)--
					public class OrderService {
					    public void test() {
					        User user = new User();
					        user.age = 20;   // 불가능
					    }
					}
	  	private => 클래스 내부에서만 접근 가능
	 			ㄴ User.java
	 			  public class User {
				   private int age;
				
				  public void setAge(int age) {
				     this.age = age;   // 가능 (같은 클래스)
				  }
				 }
				
				ㄴ UserService.java
				  public class UserService {
				    public void test() {
				        User user = new User();
				        user.age = 20;   //  불가능 (private)
				    }
				  }
 */
}
