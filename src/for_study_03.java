import java.util.Scanner;

public class for_study_03 {

	public static void main(String[] args) {
		
//		// (문제) 두개의 주사위를 던졌을때, 합이 6이 되는 모든 경우의 수와 횟수를 출력하시오
//		
//		
//		int i=1, j=1, count=0;
//		for(i=1; i<=6; i++) {
//			for(j=1; j<=6; j++) {	
//				if(i+j==6)
//					count++;	
//				
//			}// for j		
//		}//for i
//		System.out.println(sum);
		

		
		
		
//		//문자형 숫자를 입력받아 각자릿수의 합을 구하시오
		
//		Scanner sc = new Scanner(System.in);
//		String num = sc.next();
//		int sum = 0;
//		for(int i=0; i<num.length(); i++) {
//			//System.out.println(num.CharAt(i));
//			sum += num.charAt(i);
//		}
//		System.out.println("각 자릿수의 합은 = " + sum);
		

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //12345
		int sum = 0;
		while(num>0) {
			sum += num%10; //sum = 5
			num /= 10;
		}
		System.out.println("각 자릿수의 합 = " + sum);
		
		
	}

}
