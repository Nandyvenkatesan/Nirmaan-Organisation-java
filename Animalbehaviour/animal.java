package Animalbehaviour;

public interface animal {
String CATEGORY="Living Being";


static boolean isMammal(String animalName) {
	if(animalName.equalsIgnoreCase("dog")||animalName.equalsIgnoreCase("cat")||animalName.equalsIgnoreCase("human"))
	return true;
	return false;

	
}
default void speaks() {
	System.out.println("animal is making a sound");
}	
	void move();
}

