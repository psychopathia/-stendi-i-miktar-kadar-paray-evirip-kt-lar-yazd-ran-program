import java.util.Random;
import java.util.Scanner;

public class Para {
	
	public static void ParaCevir() {
		System.out.println("Atmak istediðiniz para sayýsýný giriniz");
		Scanner sc = new Scanner(System.in);
		int paraSayýsý = sc.nextInt();
		sc.close();
		String[] cýktýlar = new String[paraSayýsý];
		Random rnd=new Random();
		int upperBound=2;
		
		for(int i=0; i<paraSayýsý;i++) {
			int random=rnd.nextInt(upperBound);
			if(random==0) {
				cýktýlar[i]="Yazý";
			}
			else 
				cýktýlar[i]="Tura";
			System.out.println((i+1)+". para : " + cýktýlar[i] );
		}
		
		
	}

}
