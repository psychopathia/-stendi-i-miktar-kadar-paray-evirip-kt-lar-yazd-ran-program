import java.util.Random;
import java.util.Scanner;

public class Para {
	
	public static void ParaCevir() {
		System.out.println("Atmak istedi�iniz para say�s�n� giriniz");
		Scanner sc = new Scanner(System.in);
		int paraSay�s� = sc.nextInt();
		sc.close();
		String[] c�kt�lar = new String[paraSay�s�];
		Random rnd=new Random();
		int upperBound=2;
		
		for(int i=0; i<paraSay�s�;i++) {
			int random=rnd.nextInt(upperBound);
			if(random==0) {
				c�kt�lar[i]="Yaz�";
			}
			else 
				c�kt�lar[i]="Tura";
			System.out.println((i+1)+". para : " + c�kt�lar[i] );
		}
		
		
	}

}
