
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee("ȫ�浿", 3000, 0);
		
		e.salary = 300; //private ���� 
		e.age=26;
		int sa = e.getSalary(); //private �޼ҵ�
		String s = e.getname();
		int a = e.getAge();
	}

}
