package chap01;

import java.util.Scanner;

//1,2,...,n의 합을 구합니다.
public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		//합을 구하기 위한 준비, 헙을 저장하는 변수 sum을 0, 반복을 제어하기 위한 변수 i를 1로 초기화
		int sum = 0; //합
		int i = 1;
		
		//변수 i의 값이 n이하인 동안 i의 값을 1씩 증가하면서 루프 본문을 n회 반복 실행
		//while(제어식) 명령문
		while (i <= n) {	//i가 n 이하면 반복합니다.
			sum += i;		//sum에 i를 더합니다
			i++;			//i 값을 1만큼 증가시킵니다.
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
