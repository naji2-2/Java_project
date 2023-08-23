import java.util.Scanner;

public class Array_study_06 {

	public static void main(String[] args) {
		// String 배열에 자신이 좋아하는 연예인 5명의 이름을 저장한 후,
		// 짝수번쨰 연예인의 이름만 출력하시오.
		
		String name[] = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1) + "번째 연애인 이름 입력 : ");
			name[i] = sc.next();
		}
		
		for(int i=0; i<name.length; i++) {
			if((i+1)%2==0) {
				System.out.println(name[i]);
			}
		}
	}

}
