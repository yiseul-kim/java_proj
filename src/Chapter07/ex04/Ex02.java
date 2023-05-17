package Chapter07.ex04;

class Car {
	// 각 생성자에서 값을 할당할 때 초기값은 로드 각 필드의 기본값을 할당
	
	
	// 기본 생성자에서 초기값 할당
	Car ()	{
		company = "회사명 없음";
		carName = "차명 없음";
		carColor = "차색 등록안됨";
		carDoor = 0;
		carweight = 0.0;
	}
	
	Car(String company ) {
		this();
		this.company = company;
	}
	Car(String company, String carName) {
		this(company);
		this.carName = carName;
	}
	Car(String company, String carName, String carColor) {
		this(company, carName);
		this.carColor = carColor;
	}
	Car(String company, String carName, String carColor, int carDoor) {
		this(company, carName, carColor);
		this.carDoor = carDoor;
	}
	Car(String company, String carName, String carColor, int carDoor, double carweight) {
		this(company, carName, carColor, carDoor);
		this.carweight = carweight;
	}
	
	// 초기값
	String company;	
	String carName;
	String carColor;
	int carDoor;
	double carweight;
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", carDoor=" + carDoor
				+ ", carweight=" + carweight + "]";
	}
}
public class Ex02 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("기아");
		Car c3 = new Car("현대","k5");
		Car c4 = new Car("삼성","sm7","흰색");
		Car c5 = new Car("벤츠","s9","노란색",2);
		Car c6 = new Car("bmw","vm6","검정",4,200.1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		
		
	}

}
