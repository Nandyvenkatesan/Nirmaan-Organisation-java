package Animalbehaviour;

public class bird implements animal {
	public void move() {
		System.out.println("the bird flies in the skies");
	}

	@Override
	public void speaks() {
		System.out.println("the bird says : chrip chrip");
		
	}
	

}
