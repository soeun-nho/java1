//switch�� *������ ���� ���� �Ұ�, break ������ ���������� ����
import java.util.Scanner;
public class Grading2 {

	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		//���� ���� �Ұ��� �غ��ϴ� ��
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
		System.out.println("����: "+ grade);

	}
}
//String �� �ƴ� char ��� ���� 
//if- else ���� switch �� ���� ���