//Scanner의 입력 메소드 확인 (쉼표, 공란 등을 기준으로 분리되어 입력받으므로 -> 다른 것들도 한 번에 입력 가능)
import java.util.Scanner;
public class ScannerExam {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하여 주세요.");
		System.out.println("당신의 나이는 " + a.nextInt());
		System.out.println("당신의 체중은 " + a.nextDouble());
		System.out.println("당신의 신장은 " + a.nextDouble());
	}
}
//System.in의 쓰임