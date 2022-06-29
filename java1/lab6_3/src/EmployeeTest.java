
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee("홍길동", 3000, 0);
		
		e.salary = 300; //private 변수 
		e.age=26;
		int sa = e.getSalary(); //private 메소드
		String s = e.getname();
		int a = e.getAge();
	}

}
