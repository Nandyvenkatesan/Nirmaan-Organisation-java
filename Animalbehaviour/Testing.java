package Animalbehaviour;

public class Testing {
	public static void main(String[] args) {
		dog d=new dog();
		bird b =new bird();
		d.move();
		d.speaks();
		b.move();
		b.speaks();
		
		System.out.println(animal.isMammal("Dog"));
		System.out.println(animal.isMammal("bird"));
		
		System.out.println(dog.CATEGORY);
		System.out.println(bird.CATEGORY);
	
	}

}
