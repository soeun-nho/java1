// ����� ������ �Ǻ� , ���Խ�
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		boolean isLeapYear; 
		int year; 
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		isLeapYear = (year%4==0);
		System.out.println(year + " = " + isLeapYear);
	}
}
