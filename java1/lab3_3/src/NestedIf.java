//���� if-else��
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		int num;
		
		System.out.println("������ �Է��Ͻÿ�: ");
		
		Scanner sc= new Scanner(System.in);
		num = sc. nextInt();
		
		if(num==0)
			System.out.println("0�Դϴ�. ");
		else if (num>0)
			System.out.println("����Դϴ�. ");
		else System.out.println("�����Դϴ�. ");
		
	}

}
