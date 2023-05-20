
public class Test {

	public static void main(String[] args) {
		/*
		 Composition da "HAS A" ilişkisi vardır .Mesela bir araba oluşturuyoruz , arabayı motordan , tekerlek , direksiyon vs. gibi bir örnekte composition kullanmamız gerekir 
		 Bu gibi durumlarda Inheritance kullanamayız . Inheritance bir şirketin çalışanlarını oluşturuyorsanız burada inheritance kullanabilirsiniz . 
		  */
		
		Resolution resolution=new Resolution(1920, 1080);
		Monitor monitor=new Monitor("VS197DE", "ASUS", "18.5", resolution);
		Kasa kasa=new Kasa("Shadow Slade","Shadow","Temperli Cam");
		Anakart anakart=new Anakart("B250-PRO", "ASUS","WİNDOWS 10" , 10);
		Bilgisayar pc=new Bilgisayar(monitor, kasa, anakart);
		
		pc.getKasa().bilgisayari_ac();
		pc.getMonitor().monitoru_kapat();
		pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");

	}

}
