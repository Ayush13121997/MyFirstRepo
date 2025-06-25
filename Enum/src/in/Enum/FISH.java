package in.Enum;

public enum FISH {

	STAR,GUPPY,GOLD;
	
	FISH() {
		System.out.println("Fish Constructor Called");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enum Main Method");
		FISH f = FISH.GOLD;
	}
}
