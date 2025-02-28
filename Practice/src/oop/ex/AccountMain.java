package oop.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account main = new Account();

		main.balance = 10000;

		while (true) {
			int a = 0;
			int input = 0;

			while (true) {
				System.out.print("1.입금 2.출금 3.종료 : ");

				try {

					a = sc.nextInt();
					if (a == 1 || a == 2 || a == 3) {
						break;

					} else {
						System.out.println("1,2,3 중 입력해주세요");

					}
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요");
					sc.nextLine();
				}
			}

			if (a == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			while (true) {
				System.out.print("금액을 입력하세요: ");
				try {
					input = sc.nextInt();
					break;
					
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요.");
					sc.nextLine();

				}
			}

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
