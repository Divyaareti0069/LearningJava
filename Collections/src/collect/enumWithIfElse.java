package collect;

public class enumWithIfElse {
	enum Laptop{
		MacBook (2000),Dell (1700),Thinkpad (1800),Samsung (1500);
		private int price;
		

		private Laptop(int price) {
			this.price = price;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
	}

	public static void main(String[] args) {
		for(Laptop l:Laptop.values()) {
			System.out.println(l.ordinal());
		}
		System.out.println(Laptop.valueOf("Dell"));		
	}

}
