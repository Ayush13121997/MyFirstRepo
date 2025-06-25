package in.Enum.colour;

public enum Colour {
	
	BLUE , RED{
		
		public void info() {
			System.out.println("Dangerous colour");;;
		}
	}, GREEN;
	
	public void info() {
		System.out.println("Universal colour");
	}

}
