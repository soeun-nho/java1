//숫자 입력, 곱셈 반복문
import java.util.Scanner;
public class GuGu {

	public static void main(String[] args) {
		int num;
		int i=1;
		
		System.out.print("구구단 중에서 출려하고 싶은 단을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(i<10) {
			System.out.println(num + "*" + i + " = "+ num*i);
			i++;
		}
	}
}
