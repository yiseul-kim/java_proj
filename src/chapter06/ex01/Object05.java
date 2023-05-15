package chapter06.ex01;

class Animal {
	//기본생성자
	public Animal () {}
		
	//필드 
	String animalName ;
	String animalCry ;
	String animalRun ;
	int animalAge ;
	double animalWeight;
	
	//필드의 내용을 출력	 : 필드의 내용출력
	public void print() {
		System.out.println("동물의 이름 : " + animalName);
		System.out.println("동물의 울음소리 : " + animalCry);
		System.out.println("동물의 걸음걸이 : " + animalRun);
		System.out.println("동물의 나이 : " + animalAge+"살");
		System.out.println("동물의 무게 : " + animalWeight +"kg");
	}
}

public class Object05 {
	public static void main(String[] args) {
		// Animal 클래스 ==> tiger 객체 생성 : 호랑이 / 어흥 / 껑충껑충 / 10 / 300
		// Animal 클래스 ==> egle 객체 생성 : 독수리 / 키이오 / 훨훨날아감 / 20 / 30
		// Animal 클래스 ==> dog 객체 생성 : 개 / 멍멍 / 팔짝팔짝 / 40 / 20
		// arr1 배열에 객체를 저장후 끄집어내서 출력
		System.out.println("================");
		// Animal 클래스 ==> tiger 객체 생성 : 호랑이 / 어흥 / 껑충껑충 / 10 / 300
		Animal a1 = new Animal();
		
		a1.animalName = "호랑이";
		a1.animalCry = "어흥";
		a1.animalRun = "껑충껑충";
		a1.animalAge = 10;
		a1.animalWeight = 300;
		
		a1.print();
		System.out.println("================");
		// Animal 클래스 ==> egle 객체 생성 : 독수리 / 키이오 / 훨훨날아감 / 20 / 30
		Animal a2 = new Animal();
		
		a2.animalName = "독수리";
		a2.animalCry = "키이오";
		a2.animalRun = "훨훨날아감";
		a2.animalAge = 20;
		a2.animalWeight = 30;
		
		a2.print();
		System.out.println("================");
		// Animal 클래스 ==> dog 객체 생성 : 개 / 멍멍 / 팔짝팔짝 / 40 / 20
		Animal a3 = new Animal();
		
		a3.animalName = "개";
		a3.animalCry = "멍멍";
		a3.animalRun = "팔짝팔짝";
		a3.animalAge = 40;
		a3.animalWeight = 20;
		
		a3.print();
		System.out.println();
		System.out.println("====arr1배열에 객체 저장후 끄집어내기=====\n");
		
		
		Animal[] arr1 = new Animal[3];
		
		arr1[0] = a1;
		arr1[1] = a2;
		arr1[2] = a3;
		
		System.out.println(a1);
		
		Animal out1 = arr1[0];
		Animal out2 = arr1[1];
		Animal out3 = arr1[2];
		
		out1.print();
		System.out.println("==============");
		out2.print();
		System.out.println("==============");
		out3.print();
		
		
	}

}
