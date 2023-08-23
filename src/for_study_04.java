//import java.util.Scanner;

public class for_study_04 {

	public static void main(String[] args) {
//		int arr[] = {10, 20, 30, 40, 50};
		
//		//일반적인 for문
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		// 향상된 for문(중요)  --> 배열과 함께사용
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
//		//문제 i번째 피보나치 수열 구하기
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("i번째 피보나치 수열 구하기(i값 입력) : ");
//		int num = sc.nextInt();
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1 + ", " + num2);
//		
//		for(int i=1; i<=(num-2); i++) {
//			num3 = num1 + num2;
//			System.out.print(", " + num);
//			num1 = num2;
//			num2 = num3;
//		}
		
		//문제 1~100 사이의 숫자중 3의 배수이면서 동시에 5의 배수인 수의 갯수를 출력하시오
		
//		int sum = 0, count = 0;
//		for(int i=1; i<=100; i++) {
//			if((i%3==0) && (i%5==0)) {
//				count++;		
//				sum += i;
//			}
//		}
//		System.out.println(count);
//		System.out.println(sum);
		
		int sum = 0, count = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				if(i%5==0) {
					count++;
					sum += i;
				}
			}	 
		}
		System.out.println("총갯수는 = " + count);
			System.out.println("총합은 = " + sum);

	}// main

}
