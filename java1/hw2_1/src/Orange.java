import java.util.Scanner;
public class Orange {

	public static void main(String[] args) {
		int orange;
		int box, left;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		orange = sc.nextInt();
		
		box = orange / 10;
		left = orange %10;
		
		System.out.println(box + "박스가 필요하고 "+ left + "개가 남습니다. ");

	}

}
