package Chapter12.ex05;

public class Apple implements Fluit {

	@Override
	public void name() {
		System.out.println("사과");
		System.out.println();
	}

	@Override
	public void eat() {
		System.out.println("사과는 아삭하다");
	}

	@Override
	public void color() {
		System.out.println("사과는 빨갛다");
	}
}
