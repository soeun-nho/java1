import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		int n1,n2,n3;
		int largest = 0;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		n1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		n2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ���: ");
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

		System.out.println("���� ū ���ڴ� " + largest + "�Դϴ�. ");
	}

}
