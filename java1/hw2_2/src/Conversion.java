import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		double mile; 
		
		System.out.print("������ �Է��Ͻÿ� : ");
		Scanner sc= new Scanner(System.in);
		
		mile = sc.nextDouble();
		
		System.out.println(mile +"������ "+ 1.609*mile + "ų�ι����Դϴ�. ");
	}
}
