// while문 - 종료조건 있어야 무한루프 방지
public class WelcomeLoop {

	public static void main(String[] args) {
		int i = 0; 
		while(i<5) {
			System.out.println("환영합니다. ");
			i++;
		}
		System.out.println("반복이 종료되었습니다. ");
	}

}
