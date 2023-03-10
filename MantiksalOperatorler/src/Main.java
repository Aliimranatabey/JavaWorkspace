
public class Main {

	public static void main(String[] args) {
		/*
		 
		 MANTIKSAL OPERATORLER
		 
		 && --> AND operatörü 
		 Bütün sonuçlar kendi içinde true ise genel sonuç true , en az birisi bile false ise genel sonuç false olur .
		 
		 || --> OR operatörü 
		 Sonuçlardan en az birisi bile true ise genel sonuç true , hepsi false ise genel sonuç false olur .
		 
		 !  --> NOT operatörü
		 	 
		*/
		
		System.out.println(3==3 && 2<3 && "Murat"=="Murat");
		System.out.println(3==3 || 2<3 || "Murat"=="Murat");
		System.out.println(3!=3 || 2>3 || "Murat"!="Murat");
		System.out.println(!(3<4));
		System.out.println(!((3<4 && "Murat"=="Murat") || 3.4>2.1));

	}

}
