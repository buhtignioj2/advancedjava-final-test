package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		switch ( operation ) {
		case "+":
			System.out.println(new Add().calculate(a, b));
			break;

		case "-":
			System.out.println(new Sub().calculate(a, b));
			break;

		case "*":
			System.out.println(new Mul().calculate(a, b));
			break;

		case "/":
			System.out.println(new Div().calculate(a, b));
			break;

		// 사칙연산 외에 연산일 경우 예외처리
		default: 
			System.out.println("알수없는 연산입니다. ");
			break;
		}
	}
}
