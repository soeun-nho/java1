
public class Employee {
	private String name; 
	private int salary;
	int age;
	
	//private �� �ƴ϶�� ����
	public Employee(String n, int s, int a) {
		name = n;
		salary = s;
		age = a;
	}
	
	public String getname() {
		return name;
	}
	
	private int getSalary() {
		return salary;
	}
	int getAge() {
		return age;
	}
}
