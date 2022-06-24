//다중 if-else문 대표예제
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		int score;
		String grade;
		
		System.out.println("성적을 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score>=90)
			grade = "A";
		else if(score>=80)
			grade = "B";
		else if(score>=70)
			grade = "C";
		else if(score>=60)
			grade = "D";
		else grade = "F";
		
		System.out.println("학점" + grade);
	}
}
