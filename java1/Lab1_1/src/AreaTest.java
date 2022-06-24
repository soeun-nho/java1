// 원의 넓이 계산 - 기호 상수 , 실수 (final keyword, double type 기본) 
public class AreaTest {
	public static void main(String[] args) {
		final double PI = 3.141592;
		double radius, area; 
		
		radius = 5.0;
		
		area = radius * radius * PI ;
		
		System.out.println("반지름이 5인 원의 면적은 " + area);
	}
}
//Final 아닌 final 