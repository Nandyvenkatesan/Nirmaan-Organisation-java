package Interface;

public class Calculators2 implements Calculator1,calc2 {

	@Override
	public void multi(int a, int b) {
		System.out.println("add :"+(a+b));
		
	}

	@Override
	public void div(int a, int b) {
	   System.out.println("sub :"+(a-b));
		
	}

	@Override
	public void add(int a, int b) {
		System.out.println("multi : "+(a*b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("div :"+(a/b));
		
	}
	
	

}
