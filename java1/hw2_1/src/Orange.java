import java.util.Scanner;
public class Orange {

	public static void main(String[] args) {
		int orange;
		int box, left;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		orange = sc.nextInt();
		
		box = orange / 10;
		left = orange %10;
		
		System.out.println(box + "�ڽ��� �ʿ��ϰ� "+ left + "���� �����ϴ�. ");

	}

}
