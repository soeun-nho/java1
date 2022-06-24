//switch문의 쓰임, String 가능
import java.util.Scanner;
public class StringSwitch {

	public static void main(String[] args) {
		String month;
		int monthNumber = 0; //
		
		System.out.print("월의 이름을 입력하시오: ");
		
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
		System.out.println(month+ " 월은 "+ monthNumber + "번 째 입니다. ");
	}

}
//if- else는 이게 어려운지? 