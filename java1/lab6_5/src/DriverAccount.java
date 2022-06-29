import java.util.*;
public class DriverAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name; 
		int balance;
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("잔액을 입력하세요");
		balance = sc.nextInt();
		
		Account a = new Account();
		a.setName(name);
		a.setBalance(balance);
		System.out.println("이름은 " + a.getName()+ " 통장 잔고는" + a.getBalance() +"입니다. ");

	}

}
