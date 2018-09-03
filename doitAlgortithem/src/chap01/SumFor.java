package chap01;

import java.util.Scanner;

public class SumFor {

	//1,2,..,n의 합을 구합니다.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;	//합
		
		//for 문의 형식
		//for(초기화 부분;제어식;업데이트 부분) 명령문
		
		for(int i = 1; i <= n; i++)
			sum += i; //sum에 i를 더합니다 
		
		/*보충수업*/
		//for문의 초기화 부분, 제어식, 업데이트 부분은 생략 가능
		/*int i;
		for(i = 1; i <= n; i++)
			sum += i;*/
		//for 문이 종료되어도 변수 i를 사용할 수 있습니다.
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}
