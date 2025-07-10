
public class FloatingLiterals {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //float f =123.456;
		float f =123.456F;
		double d =123.456;
		double e =123.456D;
		//double d =0x123.445;
		//double a =0786;// Integer number too large
		double b  =0786.0;
		double c =0777;// ((7 *(8^2))+(7 *(8^1)) +( 7 *(8^0))) =511
		//double g = OXFace;
		double n= 10;// we can assign integral literal to floating point literal
		//int x= 10.0; we cannot assign floating point literal to integral literal
		double h = 1.2e3;// we can specify floating point literal in exponential form also
		
		
		double a = 1_23_45_67.2_242_4225;
		
		//usage of underscore symbol between numeric digits is allowed which improves readability of the code . At the time of compilation these underscore are automatically removed by he compiler
		
		
		
		System.out.println(f +  "  " + d + "  " +e+"   " + b +"   "+c +"   "+n +"    "+h);
	}

}
