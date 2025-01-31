package ABSTRACT;

public class Calcultor implements Calci {

	@Override
	public void add(int a, int b) {
	    System.out.println("Add "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Sub "+(a-b));
		
	}

	@Override
	public void multi(int a, int b) {
		System.out.println("Multi "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
	     System.out.println("div "+(a/b));
		
	}

	@Override
	public void mod(int a, int b) {
		System.out.println("mod "+(a%b));
		
	}
	

}
