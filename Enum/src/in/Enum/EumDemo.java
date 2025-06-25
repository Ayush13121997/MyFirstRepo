package in.Enum;

public class EumDemo {

	public static void main(String[] args) {
		
		Beer b = Beer.RC ;
		
		switch(b)
		{
			case KF:
				System.out.println("It's a Children's brand");
				break;
			case KO:
				System.out.println("It is too light");
				break;
			case RC:
				System.out.println("It has not that much kick");
				break;
			case FO:
				System.out.println("Buy One Get One Free");
				break;
			default:
				System.out.println("Other Brands not recommended");
		}
		
		
		Beer[] beers = Beer.values();
		for(Beer beer : beers)
		{
			System.out.println(beer + " " + beer.ordinal());
		}
		

	}

}
