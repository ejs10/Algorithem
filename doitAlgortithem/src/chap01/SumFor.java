package chap01;

import java.util.Scanner;

public class SumFor {

	//1,2,..,n�� ���� ���մϴ�.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;	//��
		
		//for ���� ����
		//for(�ʱ�ȭ �κ�;�����;������Ʈ �κ�) ��ɹ�
		
		for(int i = 1; i <= n; i++)
			sum += i; //sum�� i�� ���մϴ� 
		
		/*�������*/
		//for���� �ʱ�ȭ �κ�, �����, ������Ʈ �κ��� ���� ����
		/*int i;
		for(i = 1; i <= n; i++)
			sum += i;*/
		//for ���� ����Ǿ ���� i�� ����� �� �ֽ��ϴ�.
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");

	}

}
