package Animalbehaviour;

public class dog implements animal{
	public void move() {
		System.out.println("the dog runs on four legs");
	}

	@Override
	public void speaks() {
		System.out.println("the dog says :woof woof");
		
	}
	

}
