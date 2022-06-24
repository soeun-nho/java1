import java.util.Scanner;
//수 입력받음 -> 짝홀 구분
public class OddEven {

	public static void main(String[] args) {
		int num;
		
		System.out.println("정수를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("입력된 정수는 짝수입니다. ");
		else System.out.println("입력된 정수는 홀수입니다. ");
		

	}

}
