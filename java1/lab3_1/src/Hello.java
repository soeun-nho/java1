// ���� �Է� -> ���ǹ�
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		int number;
		
		Scanner sc= new Scanner(System.in);
		number = sc.nextInt();
		
		if(number>0)
			System.out.println("����Դϴ�. ");
		else System.out.println("�����Դϴ�. ");
	}

}
