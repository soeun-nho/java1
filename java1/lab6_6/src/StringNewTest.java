
public class StringNewTest {

	public static void main(String[] args) {
		String s1 = new String("JAVA");
		String s2 = new String("JAVA");
		String s3 = "JAVA";
		String s4 = "JAVA";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);

	}

}
