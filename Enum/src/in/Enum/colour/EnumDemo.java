package in.Enum.colour;

public class EnumDemo {

	public static void main(String[] args) {

		Colour[] colours = Colour.values(); // This will call the constructor of each enum constant
		for (Colour colour : colours) {
			System.out.println(colour + " - Info: ");
			colour.info(); // Call the info method for each colour
		}
		
		// Example of using a specific enum constant
		Colour.RED.info(); // This will call the overridden method in RED
		Colour.BLUE.info(); // This will call the default method in BLUE
		Colour.GREEN.info(); // This will call the default method in GREEN
	}

}
