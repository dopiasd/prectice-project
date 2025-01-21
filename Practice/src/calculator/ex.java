package calculator;



import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;

		System.out.print("숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		
		scanner.nextLine();

		System.out.print("수행할 연산자를 입력하세요 (+, -, *, /): ");
		String cal = scanner.nextLine();
		
		
		System.out.print("숫자를 입력하세요: ");
		int num2 = scanner.nextInt();
		

		if (cal.equals("+")) {
			total = num1 + num2;
			
		} else if (cal.equals("-")) {
			total = num1 - num2;
			
		} else if (cal.equals("*")) {
			total = num1 * num2;
			
		} else if (cal.equals("/")) {
			total = num1 / num2;
			
		}
		
		System.out.println("답: " + total);
	}
}
