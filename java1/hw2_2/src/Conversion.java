import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		double mile; 
		
		System.out.print("마일을 입력하시오 : ");
		Scanner sc= new Scanner(System.in);
		
		mile = sc.nextDouble();
		
		System.out.println(mile +"마일은 "+ 1.609*mile + "킬로미터입니다. ");
	}
}
