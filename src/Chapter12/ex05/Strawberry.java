package Chapter12.ex05;

public class Strawberry implements Fluit {

	@Override
	public void name() {
		System.out.println("딸기");
		System.out.println();
	}

	@Override
	public void eat() {
		System.out.println("딸기는 상큼하다");
	}

	@Override
	public void color() {
		System.out.println("딸기는 빨갛다");
	}

}
