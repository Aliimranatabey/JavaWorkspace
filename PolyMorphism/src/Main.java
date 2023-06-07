//Aşağıdaki class kelimesinin başına public koyarsak alttaki public class Main ile aynı olmak zorunda olur .
class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String talk() {
		return "Hayvan Konuşuyor...";
	}
}

class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public String talk() {
		return this.getName() + " miyavlıyor...";
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public String talk() {
		return this.getName() + " havlıyor...";
	}

}

class Horse extends Animal {

	public Horse(String name) {
		super(name);
	}

	@Override
	public String talk() {
		return this.getName() + " kişniyor...";
	}

}

public class Main {

	public static void makeItTalk(Animal animal) {
		System.out.println(animal.talk());
	}

	public static void main(String[] args) {

		/*
		 * 
		 * Polymorphismi buradaki örnek üzerinden anlatmak gerekirse bizim referansımız
		 * animal2 üzerinden yola çıkalım . animal2 Cat classından referans olarak
		 * üretilmiş. animal2.talk() dendiği zaman öncelikle gidip Cat classına bakıyor
		 * bu classda talk() diye bir methot var mı diye eğer varsa ordaki methodu
		 * kullanıyor , şayet eğer yoksa extends ettigi bir üst sınıfa gidiyor oraya
		 * bakıyor orda varsa ordakini kullanıyor . Eğer ikisinde de yoksa zaten hata
		 * verecektir .
		 * 
		 */

		Animal animal = new Animal("Limon");
		Animal animal2 = new Cat("Şaşkın"); // Polymorphism budur aslında 1 tane referans birden farklı obje gibi
											// davranıyor . Bizim hayvan referansımız var ancak biz buna kedi referansı
											// atadık ancak java bize sorun çıkarmadı .
		Animal animal3 = new Dog("Pablo");
		Animal animal4 = new Horse("Şahbatur");
		System.out.println("Animal classından türetilen referans çalışınca => " + animal.talk());
		System.out.println("Cat classından türetilen referans çalışınca => " + animal2.talk());
		System.out.println("Dog classından türetilen referans çalışınca => " + animal3.talk());
		System.out.println("Horse classından türetilen referans çalışınca => " + animal4.talk());

	}

}
