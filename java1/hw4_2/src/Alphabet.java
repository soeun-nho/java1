//do-while + String equals()
import java.util.*;
public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpha;

		while(true) {
			System.out.print("���ڸ� �Է��ϼ���: ");
			alpha = sc.next();
			if(alpha.equals("a")||alpha.equals("A"))
				System.out.println("�����Դϴ�. ");
			else if(alpha.equals("e")||alpha.equals("E"))
				System.out.println("�����Դϴ�. ");
			else if(alpha.equals("o")||alpha.equals("O"))
				System.out.println("�����Դϴ�. ");
			else if(alpha.equals("i")||alpha.equals("I"))
				System.out.println("�����Դϴ�. ");
			else if(alpha.equals("u")||alpha.equals("U"))
				System.out.println("�����Դϴ�. ");
			else if(alpha.equals("quit"))
				break;
			else System.out.println("�����Դϴ�. ");
		}
		
		System.out.println("���α׷� ����! ");
		
	}

}
