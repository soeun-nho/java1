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
//Arrays �� ����, toString �� ��� �߱淡 �̷��� �Ȱ���, ����ó�� ���Һ��� ln �� ���? 