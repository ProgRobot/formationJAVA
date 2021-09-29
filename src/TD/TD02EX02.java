package TD;

import java.util.Scanner;

public class TD02EX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Description: Multiplicaation table
		
		boolean repeat = false;
		
		
		do {
			
			System.out.println("Multiplication table");
			System.out.println("Entrer un nombre:");
			
			Scanner sc = new Scanner(System.in);
			int nombre = sc.nextInt();
			
			for(int i=0;i<=10;i++) {
				System.out.println(i+" x "+nombre+" = "+i*nombre);
			}
			
			System.out.println("Voulez-vous repeter ? 1.Oui\n2.Non");
			
			int repeatInt= sc.nextInt();
			
			
			if(repeatInt == 1) {
				repeat = true;
			}else {
				repeat = false;
			}
			
		}while(repeat==true);
		System.out.println("END");
		
		
		
		

	}

}
