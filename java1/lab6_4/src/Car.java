class Car {
	private String color;
	private int speed;
	private int gear;
	
	//�޼ҵ� ��ȯŸ�� Ȯ���ϱ� void, String .... 
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
		return color; //private Ÿ�� �������� return �����Ѱ���.. public Ŭ�����ϱ�
	}
	public int getSpeed() {
		return speed;
	}
	public int getGear() {
		return gear;
	}
}
