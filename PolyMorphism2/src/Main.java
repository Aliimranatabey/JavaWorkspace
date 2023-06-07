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

	// POLYMORPHİSM mantığı aşağıdaki makeItTalk methodu içerisindeki sorgulamaları
	// yapmaya gerek kalmıyor . Bizim nesnemiz hangi classdan tanımlanmışssa
	// otomatik ordaki talk() çalışıyor .
	public static void makeItTalk(Object object) {
		// System.out.println(object.talk());
		if (object instanceof Dog) {
			Dog dog = (Dog) object;
			System.out.println(dog.talk());
		} else if (object instanceof Cat) {
			Cat cat = (Cat) object;
			System.out.println(cat.talk());
		} else if (object instanceof Horse) {
			Horse horse = (Horse) object;
			System.out.println(horse.talk());

		} else if (object instanceof Animal) {
			Animal animal = (Animal) object;
			System.out.println(animal.talk());
		}
	}

	public static void main(String[] args) {

		makeItTalk(new Cat("Tekir"));
		makeItTalk(new Dog("Golden"));
		makeItTalk(new Horse("Arapatı"));

		// Biz bir objenin hangi classdan olduğunu anlamak için "instanceof" anahtar
		// kelimesini kullanabiliriz . Bu anahtar kelime aracılıgı ile true yada false
		// değeri elde edebiliriz .

		// Bizim Cat,Dog,Horse classlarımız Animal classını extends ediyor ama biz
		// farkında olmasakda Animal Classı da Object classını extends ediyor . Yani
		// bizim yazdığımı her class Object classından türüyor aslında .
		Dog dog = new Dog("Karabaş");
		Cat cat = new Cat("Tekir");
		Horse horse = new Horse("Şahbatur");
		Animal animal = new Animal("Limon");
		makeItTalk(dog);
		makeItTalk(cat);
		makeItTalk(horse);
		makeItTalk(animal);
		if (dog instanceof Dog) {
			System.out.println("Bu nesne köpek sınıfındandır .");
		}

	}

}
