import java.util.Scanner;
//�� �Է¹��� -> ¦Ȧ ����
public class OddEven {

	public static void main(String[] args) {
		int num;
		
		System.out.println("������ �Է��Ͻÿ� : ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("�Էµ� ������ ¦���Դϴ�. ");
		else System.out.println("�Էµ� ������ Ȧ���Դϴ�. ");
		

	}

}
