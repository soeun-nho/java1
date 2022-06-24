//다중 if-else문
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		int num;
		
		System.out.println("정수를 입력하시오: ");
		
		Scanner sc= new Scanner(System.in);
		num = sc. nextInt();
		
		if(num==0)
			System.out.println("0입니다. ");
		else if (num>0)
			System.out.println("양수입니다. ");
		else System.out.println("음수입니다. ");
		
	}

}
