package Chapter12.ex04;

public class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("멍멍");

	}

	@Override
	public void run() {
		System.out.println("강아지 껑충껑충 ");

	}

}
