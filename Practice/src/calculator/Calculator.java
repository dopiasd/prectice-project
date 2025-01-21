package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorData data = new CalculatorData();
		double total = 0;
		

		System.out.print("숫자를 입력하세요: ");
		double input1 = scanner.nextDouble();
		
		scanner.nextLine();

		System.out.print("수행할 연산자를 입력하세요 (+, -, *, /): ");
		String cal = scanner.nextLine();
		
		
		System.out.print("숫자를 입력하세요: ");
		double input2 = scanner.nextDouble();
		
		data.num1 = input1;
		data.num2 = input2;
		

		if (cal.equals("+")) {
			total = data.plus();
			
		} else if (cal.equals("-")) {
			total = data.minus();
			
		} else if (cal.equals("*")) {
			total =data.multipulication();
			
		} else if (cal.equals("/")) {
			total = data.division();
			
		}
		
		System.out.println("답:"+ total);
		
	}
}
