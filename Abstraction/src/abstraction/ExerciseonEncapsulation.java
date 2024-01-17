package abstraction;

public class ExerciseonEncapsulation {
	private String color;
	private int duration;
	ExerciseonEncapsulation (String color,int duration){
		this.color=color;
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration=duration;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	void changeColor(String newColor) {
		color=newColor;
	}
	
	boolean  checkIsRed() {
		return color.equals("Red");
	}
	
	boolean  checkIsGreen() {
		return color.equals("Green");
	}
	public static void main(String[] args) {
		
		ExerciseonEncapsulation e=new ExerciseonEncapsulation("Red",30);
		System.out.println(e.checkIsGreen());
		System.out.println(e.checkIsRed());
		e.changeColor("Green");
		System.out.println(e.color);
		e.setDuration(40);
		System.out.println(e.checkIsGreen());
		
		

	}

}
