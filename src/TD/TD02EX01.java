package TD;

import java.util.Scanner;

public class TD02EX01 {

	public static void main(String[] args) {
		
		//Leap year (année bissextile)
		
		//Description: A is a leap year if it is a multiple of 4.
		//We except to this roule years which are uniformely multiplayers of 100
		
		boolean response = false;
		int year = 0;
		
		do {
			while(year<1||year>2100) {
				System.out.println("Entrer a year between 1 and 2100:");
				Scanner scanner = new Scanner (System.in);  
				
				year=scanner.nextInt();
				
				if(year>=1 && year<=2100) {
					if(year%400 == 0 || (year % 100!= 0 && year%4 == 0)) {
							System.out.println(year+" is a leap year.");
					}else {
	     					System.out.println(year+" is not a leap year.");
					}
					}
				else {
					System.out.println("Enter a correct year please !");
				}	
			}
			
			System.out.print("Play again ?\n1.Yes--2.No\n------\n");
			
			//TODO optimisation pour utilisation d'une seul objet SCANNER
			//TODO Introduction de la gestion des exceptions
			
			Scanner scanner2 = new Scanner (System.in);  
			int responseInt = scanner2.nextInt();
			if(responseInt == 1) {
				response = true;
				year = 0;
			}else {
				response = false;
			}
			
		}while(response == true);
		
		
		System.out.println("END");
		
		
	}

}
