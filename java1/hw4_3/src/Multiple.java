//�ݺ���, ���ǹ�
import java.util.*;
public class Multiple {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		int cnt =0;
		int sum=0;
		System.out.print("���Ϸ��� ������ ���ڸ� �Է��ϼ���: ");
		num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			if(i%3==0) {
				System.out.printf("%5d", i);
				sum+=i;
				cnt++;
			}
			if(cnt%5==0)
				System.out.println();			
		}
		System.out.println();
		System.out.println("0����"+ num +"������ 3�� ��� ��:" + sum);
	}

}