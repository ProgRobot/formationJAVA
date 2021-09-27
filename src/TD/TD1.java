package TD;

/**
 * 
 * @author Youcef
 * 
 */

public class TD1 {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//Rapppel algortihme types simple/appels/conditionneles/boucles
		
		//Etapes:
		//1-Description des etapes en langage naturel
		//2-Si une soulition est trouvée, l'affichée
		//3-Transformation en algortihme ecrit en pseudo langage
		//4-L'exectution n'est pas très rapide !! , revoir l'algortime pour tirer les causes possibles
		//5-Modifier pour améliorer la rapidité
		
		System.out.println("Calcul factorial N=a!+b!+c! tels que N=abc en systeme décimal");
		System.out.println("Trouver a,b,c tels que a!+b!+c! = abc");
		System.out.println("a,b,c sont 3 chiffres successifs compris entre 0 et 9");
		
		int a=0, b=0, c=0, N1 = 0, N2 = 0, compteurSolutions=0, tableauSolutions[][] = null;
		
		for(a=0;a<=7;a++) {
			
			b=a+1;
			c=a+2;
			
			N1 = factorial(a)+factorial(b)+factorial(c);
			N2 = a*100+b*10+c;
			
			System.out.println("N1 = "+N1+" , "+"N2 = "+N2);
			
			if(N1==N2) {
				//System.out.println("(a,b,c) = ("+a+","+b+","+c+")");
				
				compteurSolutions++;
				
				if(compteurSolutions!=0 && a==7) {
					//Création puis remplissage tableau
					
					tableauSolutions = new int[compteurSolutions][3];
					
					for(int s = 0;s<compteurSolutions;s++) {
						for (int m = 0;m<3;m++) {
							if(m==0) {
								tableauSolutions[s][m] = a;	
							}
							else if (m==1) {
								tableauSolutions[s][m] = b;
							}
							else if (m==2) {
								tableauSolutions[s][m] = c;
							}
						}}
					
					//Affichage de la solution
					for(int s = 0;s<compteurSolutions;s++) {
						for (int m = 0;m<3;m++) {
							System.out.print(tableauSolutions[s][m]+",");
						}
						System.out.print("\n");
						}		
		    }}}
		
		if(compteurSolutions == 0 ) {
			System.out.println("Pas de solution trouvée !");
		};
	}
	
	public static int factorial(int nombre) {
		int resultat=1;
		if(nombre == 0) {
			return 1;
		}
		else {
			for(int i=1;i<=nombre;i++) {
				resultat=resultat*i;
			}
			return resultat;
		}		
	}
}
