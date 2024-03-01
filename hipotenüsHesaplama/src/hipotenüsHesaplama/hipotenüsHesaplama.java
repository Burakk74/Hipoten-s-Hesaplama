package hipotenüsHesaplama;

import java.util.Scanner;

public class hipotenüsHesaplama {

	public static void main(String[] args) {
		
      Scanner input = new Scanner(System.in);
      
      int kenar1,kenar2;
      
      System.out.print("Enter the first side :");
      	kenar1 = input.nextInt();
      	
      	System.out.print("Enter the second side :");
      	kenar2 = input.nextInt();
      	
     	double kenar3;
     	
     	kenar3 = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
     	
     	System.out.print("Hipotenus is :" + kenar3);
      	
      	
    		  
      		
		
	}

}
