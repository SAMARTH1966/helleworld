package test;

public class exceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int n= 10;
		if (n<18) {
			throw new ArithmeticException("invalid");
			
		}else {
			System.out.println("valkid");
		}}
		catch (ArithmeticException e){
			System.out.println("exception");
			
		}
	}

}
