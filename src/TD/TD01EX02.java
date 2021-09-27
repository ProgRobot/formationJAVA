package TD;

public class TD01EX02 {

	public static void main(String[] args) {
		
		
		//Description: Second exercice of France Championnat in mathematics games and logics
		
		
		/*
		N is a number which can be written in decimal system as N = abcd
		a,b,c,d are successive numbers where a is different from 0
		N = abcd, P = cbad and Q = bcad are the three perfects squares.
		We have to find all solutions
		*/
		
		
		/*Steps
		 1-Write Solution in natural langage.
		 2-Write algorithm in pseudo langage
		 3-Coding the algorithm 
		 */
		
		//Code
		
		//Declaration & Intitilisation
		int a=0,b=0,c=0,d=0,N=0,P=0,Q=0;
	
		//Equation resolution
		for(a=1;a<6;a++) {
			
			//a,b,c,d are 4 successive numbers 
			b=a+1;
			c=b+1;
			d=c+1;
			
			System.out.println("(a,b,c,d) = "+ "("+a+","+b+","+c+","+d+")");
			
			N = a*1000+b*100+c*10+d;
			P = c*1000+b*100+a*10+d;
			Q = b*1000+c*100+a*10+d;
			
			System.out.println("(N,P,Q) = "+"("+N+","+P+","+Q+")");
			System.out.println("(sqrt(N),sqrt(P),sqrt(Q)) = "+ "("+Math.sqrt(N)+","+Math.sqrt(P)+","+Math.sqrt(Q)+")");
			
			if(N % Math.sqrt(N) == 0 && P % Math.sqrt(P) == 0 && Q % Math.sqrt(Q) == 0) {
				System.out.println("(a,b,c,d) = "+ "("+a+","+b+","+c+","+d+")"+" is a solution.");
			}	
		}
		
	}
}
