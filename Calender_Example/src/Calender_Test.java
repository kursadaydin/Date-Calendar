
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calender_Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar takvim = new GregorianCalendar();
		Scanner giris = new Scanner(System.in);
		System.out.println("��e ba�lama y�l�n� giriniz....");
		int baslangic_tarihi = giris.nextInt();
		int bugunun_tarihi =     takvim.get(GregorianCalendar.YEAR);
		System.out.println("��e ba�lama tarihiniz :" + baslangic_tarihi);
		System.out.println("Bug�n�n tarihi :" + bugunun_tarihi);
		System.out.println("Yakla��k olarak " + (bugunun_tarihi-baslangic_tarihi) + " y�ld�r �al��maktas�n�z.");
		Date currentDate = new Date();
		
	}

}
