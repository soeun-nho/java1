//switch���� ����, String ����
import java.util.Scanner;
public class StringSwitch {

	public static void main(String[] args) {
		String month;
		int monthNumber = 0; //
		
		System.out.print("���� �̸��� �Է��Ͻÿ�: ");
		
		Scanner sc= new Scanner(System.in);
		month = sc.next(); //
		
		switch(month) {
		case "january":
			monthNumber = 1;
			break;
		case "feburary":
			monthNumber = 2;
			break;
		case "march":
			monthNumber = 3;
			break;
		default:
			break;
		}
		System.out.println(month+ " ���� "+ monthNumber + "�� ° �Դϴ�. ");
	}

}
//if- else�� �̰� �������? 