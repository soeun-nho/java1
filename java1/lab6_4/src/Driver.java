
public class Driver {

	public static void main(String[] args) {
		Car c = new Car();
		c.setColor("red");
		c.setSpeed(100);
		c.setGear(1);
		
		System.out.println(c.getColor());
		System.out.println(c.getSpeed());
		System.out.println(c.getGear());

	}

}
