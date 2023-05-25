package Chapter12.ex05;

public class Banana implements Fluit {

	@Override
	public void name() {
		System.out.println("바나나");
		System.out.println();
	}

	@Override
	public void eat() {
		System.out.println("바나나는 달콤하다");
	}

	@Override
	public void color() {
		System.out.println("바나나는 노랗다");
	}

}
