package in.java.Enum;

public enum BEER {
	
	KF(70),KO(80),RC(90),FO;
	
	int price;

	BEER(int price) {

	this.price = price;

	}
	
	BEER() {
		this.price = 100; // Default price if not specified
	}
	
	public int getPrice() {
		return price;
	}

}
