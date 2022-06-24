// 정수 입력 -> 조건문
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		int number;
		
		Scanner sc= new Scanner(System.in);
		number = sc.nextInt();
		
		if(number>0)
			System.out.println("양수입니다. ");
		else System.out.println("음수입니다. ");
	}

}
