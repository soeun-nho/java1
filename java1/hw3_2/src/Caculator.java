import java.util.*;
public class Caculator {

	public static void main(String[] args) {
		String operator;
		double operand1, operand2, res =0;
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		
		Scanner sc = new Scanner(System.in);
		operator = sc.next();
		
		System.out.print("���� 2���� �Է��ϼ���(ex. 3 23) : ");
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
				System.out.println("������ ������ �� ����.");
			else
			res = operand1 / operand2;	
		}
		System.out.println(operand1 + operator + operand2 + "=" +  res);
	}

}
