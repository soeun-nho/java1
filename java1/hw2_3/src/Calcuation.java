import java.util.Scanner;
public class Calcuation {

	public static void main(String[] args) {
		int received, cost;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ��: ");
		received = sc.nextInt();
		System.out.print("��ǰ ����: ");
		cost = sc.nextInt();
		
		System.out.println("�ΰ���: "+ (int)(cost*0.1));
		System.out.print("�ܵ�: " + (received-cost));

	}

}
