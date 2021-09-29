package TD;

public class TD05EX01 {

	public static void main(String[] args) {
		
		
		//TEST
		
		System.out.println("TEST:: Youcef ");
		affiche("Youcef");
		
		
	}
	
	
	
	public static void affiche(String s) {
		
		char tableChar[] = new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			tableChar[i]=s.charAt(i);
		}
		
		for(int i=0;i<s.length();i++) {
			if(i==s.length()-1) {
				System.out.print(tableChar[i]);
				break;
			}
			
			System.out.print(tableChar[i]+", ");
		}
		
		
			
	}
}
