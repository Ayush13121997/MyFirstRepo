
public class LocalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int i =0;
		// for local variables JVM won't provide default values ,we have to perform initialization explicitly before using the variable
		// the only applicable modifier for local variable is final if we try to apply any other we will get compile time error
		
		
		
		for(int j = 0 ; j< 3 ; j++ )
		{
			i+=j;
		}
		//System.out.println(i + "  " + j);
	}

}
