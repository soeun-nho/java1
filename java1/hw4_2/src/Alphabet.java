//do-while + String equals()
import java.util.*;
public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpha;

		while(true) {
			System.out.print("문자를 입력하세요: ");
			alpha = sc.next();
			if(alpha.equals("a")||alpha.equals("A"))
				System.out.println("모음입니다. ");
			else if(alpha.equals("e")||alpha.equals("E"))
				System.out.println("모음입니다. ");
			else if(alpha.equals("o")||alpha.equals("O"))
				System.out.println("모음입니다. ");
			else if(alpha.equals("i")||alpha.equals("I"))
				System.out.println("모음입니다. ");
			else if(alpha.equals("u")||alpha.equals("U"))
				System.out.println("모음입니다. ");
			else if(alpha.equals("quit"))
				break;
			else System.out.println("자음입니다. ");
		}
		
		System.out.println("프로그램 종료! ");
		
	}

}
