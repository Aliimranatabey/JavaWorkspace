
public class Main {

	public static void main(String[] args) {
		
		Abone abone=new Abone();
		abone.isim="Mustafa Murat Coşkun";
		abone.bakiye=200;
		abone.sehir="Ankara";
		
		abone.dogalgaz_kullan(200);
		
		GelismisAbone gelismisAbone=new GelismisAbone("Mustafa Murat Coşkun", 200, "Ankara");
		gelismisAbone.bakiye_ogren();

	}

}
