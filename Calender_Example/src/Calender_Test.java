
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calender_Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar takvim = new GregorianCalendar();
		Scanner giris = new Scanner(System.in);
		System.out.println("Ýþe baþlama yýlýný giriniz....");
		int baslangic_tarihi = giris.nextInt();
		int bugunun_tarihi =     takvim.get(GregorianCalendar.YEAR);
		System.out.println("Ýþe baþlama tarihiniz :" + baslangic_tarihi);
		System.out.println("Bugünün tarihi :" + bugunun_tarihi);
		System.out.println("Yaklaþýk olarak " + (bugunun_tarihi-baslangic_tarihi) + " yýldýr çalýþmaktasýnýz.");
		Date currentDate = new Date();
		
	}

}
