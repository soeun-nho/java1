//���� �Է�, ���� �ݺ���
import java.util.Scanner;
public class GuGu {

	public static void main(String[] args) {
		int num;
		int i=1;
		
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ� : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(i<10) {
			System.out.println(num + "*" + i + " = "+ num*i);
			i++;
		}
	}
}
