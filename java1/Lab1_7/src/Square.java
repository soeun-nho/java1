import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		int width, height;
		int area;
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("가로를 입력: ");
		width = sc.nextInt();
		System.out.println("세로를 입력: ");
		height = sc.nextInt();
		
		area = width * height;
		System.out.println("사각형 넓이: " + area);	
	}
}
