package oop.ex;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account main = new Account();

		main.balance = 10000;

		while (true) {
			System.out.print("1.입금 2.출금 3.종료 : ");
			int a = sc.nextInt();

			if (a == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("금액을 입력하세요: ");
			int input = sc.nextInt();
	

			if (a == 1) {
				main.plus(input);
				

			} else if (a == 2) {
				main.minus(input);
			

			} else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println("현재 금액은 " + main.balance + "원 입니다.");
		}

	}

}

