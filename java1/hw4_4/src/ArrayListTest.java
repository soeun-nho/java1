import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListTest {

	public static void main(String[] args) {
		String[] arr= {"Hello"};
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("World");
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		for(String value : list)
			System.out.println(value);
	}
}
//Arrays 가 뭔지, toString 을 어떻게 했길래 이렇게 된건지, 과제처럼 원소별로 ln 은 어떠헤? 