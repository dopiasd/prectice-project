package oop.ex;

public class Account {
	int balance; //잔액
	

	public void plus(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount +"원이 입금되었습니다.");
		
		} else {
			System.out.println("입금 금액은 0보다 커야 합니다.");
			
		}
	}

	public void minus(int amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println(amount +"원이 출금되었습니다.");
		} else {
			System.out.println("출금 금액은 0보다 커야 합니다. / 잔액이 부족합니다.");

		}

	}
}