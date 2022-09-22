package arkadasSayi;

public class Main {

	public static void main(String[] args) {
		//arkadasSayi
		

        int no1 = 220;
        int no2 = 284;
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < no1; i++) {
            if (no1 % i == 0) {
                total1 += i;
            }

        }
        for (int i = 1; i < no2; i++) {
            if (no2 % i == 0) {
                total2 += i;
            }

        }
        if (no1 == total2 && no2 == total1) {
            System.out.println("Arkadaş sayıdır.");
        } else {
            System.out.println("Arkadaş sayı değildir.");
        }

				
				
	}

}
