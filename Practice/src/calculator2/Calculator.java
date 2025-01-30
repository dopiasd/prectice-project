package calculator2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Plus plus = new Plus();
		Minus minus = new Minus();
		Multipulication mul = new Multipulication();
		Division div = new Division();
	
		
		double total = 0;
		

		System.out.print("숫자를 입력하세요: ");
		double input1 = scanner.nextDouble();
		
		scanner.nextLine();

		System.out.print("수행할 연산자를 입력하세요 (+, -, *, /): ");
		String cal = scanner.nextLine();
		
		
		System.out.print("숫자를 입력하세요: ");
		double input2 = scanner.nextDouble();
		
		CalculatorData data = new CalculatorData(input1, input2);
		

		if (cal.equals("+")) {
			total = plus.calculator(data);
			
		} else if (cal.equals("-")) {
			total = minus.calculator(data);
			
		} else if (cal.equals("*")) {
			total = mul.calculator(data);
			
		} else if (cal.equals("/")) {
			total = div.calculator(data);
			
		}
		
		System.out.println("답:"+ total);
		
	}
}
