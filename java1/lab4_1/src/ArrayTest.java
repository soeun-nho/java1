//배열 생성, 길이만큼 입출력 , 배열의 자료형
public class ArrayTest {

	public static void main(String[] args) {
		int[] s = new int[10];
		for(int i=0; i<s.length; i++)
			s[i]=i;
		for(int i=0; i<s.length; i++)
			System.out.print(i+ " ");
		
		int[] s2 = {10,20,30,40,50};
		for(int i=0; i<s2.length; i++)
			System.out.print(s2[i] + " ");

	}

}
