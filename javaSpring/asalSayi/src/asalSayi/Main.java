package asalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi=5;
		
		for(int i=2; i<sayi; i++) {
			if(sayi%i!=0) {
				
				System.out.println("asal sayi degil");
			}
			else {
				System.out.println("asal sayi");
			}
		}

	}

}
