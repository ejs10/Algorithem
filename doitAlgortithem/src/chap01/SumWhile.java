package chap01;

import java.util.Scanner;

//1,2,...,n�� ���� ���մϴ�.
public class SumWhile {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		//���� ���ϱ� ���� �غ�, ���� �����ϴ� ���� sum�� 0, �ݺ��� �����ϱ� ���� ���� i�� 1�� �ʱ�ȭ
		int sum = 0; //��
		int i = 1;
		
		//���� i�� ���� n������ ���� i�� ���� 1�� �����ϸ鼭 ���� ������ nȸ �ݺ� ����
		//while(�����) ��ɹ�
		while (i <= n) {	//i�� n ���ϸ� �ݺ��մϴ�.
			sum += i;		//sum�� i�� ���մϴ�
			i++;			//i ���� 1��ŭ ������ŵ�ϴ�.
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}

}
