import java.util.Scanner;
public class Calcuation {

	public static void main(String[] args) {
		int received, cost;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("πﬁ¿∫ µ∑: ");
		received = sc.nextInt();
		System.out.print("ªÛ«∞ ∞°∞›: ");
		cost = sc.nextInt();
		
		System.out.println("∫Œ∞°ºº: "+ (int)(cost*0.1));
		System.out.print("¿‹µ∑: " + (received-cost));

	}

}
