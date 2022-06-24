//switch문 *변수의 범위 설정 불가, break 없으면 빠져나오지 않음
import java.util.Scanner;
public class Grading2 {

	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		//범위 설정 불가를 극복하는 식
		score/=10;
		switch(score) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade ='D';
			break;
		default:
			grade = 'F';
		}
		System.out.println("학점: "+ grade);

	}
}
//String 이 아닌 char 사용 가능 
//if- else 문과 switch 문 언제 사용