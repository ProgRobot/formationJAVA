package TD;

public class TD05EX02 {
	
	public static String ajouteEtoiles(String s, int n) {
		
		String etoiles="";
		
		if(n>0) {
			for(int i=1; i<=n;i++) {
				etoiles.concat("*");
			}
		}
		// To see why doesn't it work ?
		
		return etoiles+s+etoiles; 
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("TEST::Youcef,3 etoiles");
		System.out.println(ajouteEtoiles("Youcef",3));
	
	}
	
}
