class Car {
	private String color;
	private int speed;
	private int gear;
	
	//메소드 반환타입 확인하기 void, String .... 
	public void setColor(String c) {
		color = c;
	}
	public void setSpeed(int s) {
		speed=s;
	}
	public void setGear(int g) {
		gear = g;
	}
	public String getColor() {
		return color; //private 타입 변수여도 return 가능한가벼.. public 클래스니까
	}
	public int getSpeed() {
		return speed;
	}
	public int getGear() {
		return gear;
	}
}
