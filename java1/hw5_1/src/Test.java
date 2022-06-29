// 소속 메소드
public class Test {

	public static void main(String[] args) {
		System.out.println("메소드 호출하기 전");
		show();
		System.out.println("메소드 호출한 후");
	}
	public static void show() {
		for(int i=0; i<10; i++)
			System.out.print("*");
		System.out.println();
	}

}
