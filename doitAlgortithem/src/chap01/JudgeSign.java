package chap01;

import java.util.Scanner;

//입력한 정슛겂아 영슈안자 움슈안자 0인지 판단합니다
public class JudgeSign {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n==1)
			System.out.println("이 수는 1 입니다.");
		else if(n==2)
			System.out.println("이 수는 2 입니다.");
		else if(n==3)
			System.out.println("이 수는 3 입니다.");
		else;
		
	/*	
		if(n > 0)
			System.out.println("이 수 는 양수입니다");
		else if(n > 0)
			System.out.println("이 수는 음수입니다.");
		else
			System.out.println("이 수는 0입니다.");
	*/
	}

}
