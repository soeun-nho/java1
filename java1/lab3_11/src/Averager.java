//���� �ݺ��ؼ� �ް�, ������ �Ǹ� ����� ���
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
		
		System.out.println("����� " + score/cnt);
	}

}
