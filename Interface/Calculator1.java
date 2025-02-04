package Interface;

public interface Calculator1 {

	void add(int a,int b);
	void sub(int a,int b);
	
	default void display() {
		System.out.println("CALCI");
	}
	    static void display1() {
	    	System.out.println("calculator");
	    }

	    

}
interface calc2{
	void multi(int a, int b);
	void div (int a,int b);
	
}