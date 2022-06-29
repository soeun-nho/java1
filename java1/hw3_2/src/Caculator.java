import java.util.*;
public class Caculator {

	public static void main(String[] args) {
		String operator;
		double operand1, operand2, res =0;
		
		System.out.print("문자를 입력하세오: ");
		
		Scanner sc = new Scanner(System.in);
		operator = sc.next();
		
		System.out.print("숫자 2개를 입력하세요(ex. 3 23) : ");
		operand1 =sc.nextDouble();
		operand2 =sc.nextDouble();
		
		if(operator.equals("+"))
			res = operand1 + operand2;
		else if(operator.equals("-"))
			res = operand1 - operand2;
		else if(operator.equals("*"))
			res = operand1 * operand2;
		else if(operator.equals("/")) {
			if(operand2 == 0)
				System.out.println("연산을 수행할 수 없다.");
			else
			res = operand1 / operand2;	
		}
		System.out.println(operand1 + operator + operand2 + "=" +  res);
	}

}
