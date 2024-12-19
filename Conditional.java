package day3;
import java.util.Scanner;
public class Conditional {
public static void main(String[] args) {
	/*Scanner sc = new Scanner(System.in);
	System.out.println("enter the mark : ");
	int m1 = sc.nextInt();
	if(m1>=70 && m1<=100){
		System.out.println("pass");
	}
		else if(m1>=100) {
		System.out.println("invalid mark");
			}
       else {
		System.out.println("fail");
	}
}*/
	System.out.println("eneter the choice");
	System.out.println("1 for add");
	System.out.println("2for sub");
	System.out.println("3for multiplication");
	System.out.println("4for division");
	System.out.println("5for modulus");
	Scanner sc = new Scanner (System.in);
	int num = sc.nextInt();
	
	switch(num){
	case 1:{
		System.out.println("enter the fstnum : ");
		int fstnum=sc.nextInt();
		System.out.println("enter the scndnum");
		int scndnum=sc.nextInt();
		System.out.println("add :" +(fstnum+scndnum));
		break;
	}
	
	
    case 2:{
    	System.out.println("enter the fstnum : ");
    	int fstnum=sc.nextInt();
    	System.out.println("enter the scndnum");
    	int scndnum=sc.nextInt();
    	System.out.println("sub :" +(fstnum-scndnum));
	    break;
	    }
	
    case 3:{
        System.out.println("enter the fstnum : ");
		int fstnum=sc.nextInt();
		System.out.println("enter the scndnum");
		int scndnum=sc.nextInt();
		System.out.println("multiplication :" +(fstnum*scndnum));
		break;
		
	
	}

    case 4:{
        System.out.println("enter the fstnum : ");
		int fstnum=sc.nextInt();
		System.out.println("enter the scndnum");
		int scndnum=sc.nextInt();
		System.out.println("Division :" +(fstnum/scndnum));
		break;
		}
    

    case 5:{
        System.out.println("enter the fstnum : ");
		int fstnum=sc.nextInt();
		System.out.println("enter the scndnum");
		int scndnum=sc.nextInt();
		System.out.println("modulus :" +(fstnum%scndnum));
		break;
		}
    default:{
    	System.out.println("invalid");
    }
	}
}
}


