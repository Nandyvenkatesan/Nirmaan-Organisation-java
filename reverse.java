package day6;

public class reverse {
	public static void main(String[] args) {
		String name="Nandhini Venkat";
		String rev = "";
		for(int i=7; i>=0; i--) {
			rev+=name.charAt(i);
		}
		System.out.println(name);
		System.out.println(rev);
		System.out.println("lowercase : "+name.toLowerCase());
		System.out.println("upprcase : "+name.toUpperCase());
		
		String fruits[] = {"Apple,Orange,Banana,Pomogranete"};
		for(int j = 0; j<fruits.length; j++) {
			System.out.print(fruits[j]);
		}
	}

}
