import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		int width, height;
		int area;
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("���θ� �Է�: ");
		width = sc.nextInt();
		System.out.println("���θ� �Է�: ");
		height = sc.nextInt();
		
		area = width * height;
		System.out.println("�簢�� ����: " + area);	
	}
}
