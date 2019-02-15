package oop.inherit;

class Mother {
	int age = 55;
	String name = "123";

	Mother() {
		System.out.println("난 엄마 생성자!");
	}

	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
}

public class Extends1 extends Mother {
	Extends1() {
		System.out.println("난 확장 생성자!");
		attack();
		eat();
		
	}
	void eat() {
		System.out.println("확장이 먹습니다.");
	}

	public static void main(String[] args) {
		Extends1 e = new Extends1();
		System.out.println(e.age);
		
	}
}
