package Chapter12.ex05;

public class Fluit_Test {

	public static void main(String[] args) {
		Fluit f1 = new Apple();
		Fluit f2 = new Banana();
		Fluit f3 = new Strawberry();
		
		Fluit[] arr = new Fluit[] { f1, f2, f3 };
		
		System.out.println("=========");
		for ( Fluit k : arr) {
			k.name();
			k.eat();
			k.color();
			System.out.println("=========");
		}		
	}
}
