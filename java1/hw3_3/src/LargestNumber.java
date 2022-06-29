import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		int n1,n2,n3;
		int largest = 0;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세오: ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세오: ");
		n2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세오: ");
		n3 = sc.nextInt();
		
		for(int i=0; i<3; i++)
			if(n1>n2)
				if(n1>n3)
					largest = n1;
				else if (n3>n1)
					largest = n3;
			else
				if(n2>n3)
					largest = n2;
				else if(n3>n2)
					largest = n3;

		System.out.println("가장 큰 숫자는 " + largest + "입니다. ");
	}

}
