package in.java.Enum;

public class EnumDemo {

	public static void main(String[] args) {

		BEER[] beers = BEER.values(); // This will call the constructor of each enum constant
		for (BEER beer : beers) {
			System.out.println(beer + " - Price: " + beer.getPrice());
		}
	}

}
