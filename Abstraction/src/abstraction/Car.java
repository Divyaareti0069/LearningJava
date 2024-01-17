package abstraction;

abstract class Car {
	Car(){
		
	}
	abstract void mileage();
	void speed() {
		System.out.println("max speed is 180 ");
	}
	

	public static void main(String[] args) {
		
		Car c=new Hyundai();
		c.mileage();
		c.speed();
		

	}

}
