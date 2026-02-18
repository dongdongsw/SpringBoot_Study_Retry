package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Spring_7 {

//	public static void main(String[] args) {
//		// 1 부터 100까지에서 짝수 일때만 더하기
//		int sum = 0;
//		
//		for(int i = 1; i <= 10; i ++) {
//			if(i % 2 == 0) {
//				sum += i;
//				
//			}
//		}
//		
//		System.out.println(sum);
//	}
	
//	public static void main(String[] args) {
//		// 배열 중에 최대값 찾기
//		int[] arr = {3,7,2,9,4};
//		int res = 0;
//		
//		for(int i = 0; i < 5; i++) {
//			if(res < arr[i]) {
//				res = arr[i];
//				
//			}
//			
//		}
//		System.out.println(res);
//	}
	
//	public static void main(String[] args) {
//		// 문자열 뒤집기
//		String msg = "hello";
//		
//		StringBuilder sb = new StringBuilder(msg);
//		
//		sb.reverse();
//		System.out.println(sb);
//	}
	
//	public static void main(String[] args) {
//		// 입력 받은 값 몇개인지 찾기
//		int arr[] = {1, 2, 3, 2, 2, 4};
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		int input = sc.nextInt();
//		
//		for(int i = 0; i < 6; i++) {
//			if(arr[i] == input) {
//				count++;
//				// 궁금한점은 arr[i].equals(input) 은 왜 안되는지
//			}
//		}
//		System.out.println(count);
//		
//	}
	
//	public static void main(String[] args) {
//		// 중복 제거
//		int[] arr = {1,2,2,3,3,4};
//		
//		ArrayList<Integer> list = new ArrayList<>();
//			
//		for(int i = 0; i < arr.length; i++) {
//			
//			if(!list.contains(arr[i])) {
//				list.add(arr[i]);
//			}
//		}
//		System.out.println(list);
//	}
	
//	public static void main(String[] args) {
//		// 제일 긴 문자열 찾기
//		String[] arr = {"hi","hello","bye"};
//		String res = "";
//		for(int i = 0; i < arr.length; i ++) {
//			if(arr[i].length() > res.length()) {
//				res = arr[i];
//			}
//		}
//		System.out.println(res);
//	}
	
//	public static void main(String[] args) {
//		// 두번쨰로 큰 수 찾기
//		int[] arr = {10,5,8,20};
//		int first = 0;
//		int second = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > first) {
//				second = first;
//				first = arr[i];
//			}
//			else if(arr[i] > second) {
//				second = arr[i];
//
//			}
//		}
//		System.out.println("결과" + second);
//	}
	
//	public static void main(String[] args) {
//		// 자릿수 합 구하기
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		int res = 0;
//		for(int i = 0; i < a.length(); i ++) {
//			res += (Integer)(a.charAt(i) - '0');
//		}
//		System.out.println(res);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}
