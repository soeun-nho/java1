//점수 반복해서 받고, 음수가 되면 평균을 출력
import java.util.Scanner;
public class Averager {

	public static void main(String[] args) {
		int score;
		int cnt=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			score = sc.nextInt();
			cnt++;
			
			if(score<0)
				break;
		}
		
		System.out.println("평균은 " + score/cnt);
	}

}
