import java.util.*;
public class DriverAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name; 
		int balance;
		
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		System.out.println("�ܾ��� �Է��ϼ���");
		balance = sc.nextInt();
		
		Account a = new Account();
		a.setName(name);
		a.setBalance(balance);
		System.out.println("�̸��� " + a.getName()+ " ���� �ܰ��" + a.getBalance() +"�Դϴ�. ");

	}

}
