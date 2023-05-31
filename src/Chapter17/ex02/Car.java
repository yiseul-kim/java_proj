package Chapter17.ex02;

public class Car {
	
	String company ;
	String carName ;
	String carColor ;
	int maxSpeed ;
	
	// 생성자를 통해서 필드에 값 입력
	public Car(String company, String carName, String carColor, int maxSpeed) {
//		super();		// Object 클래스의 기본 생성자 호출 (없어도 상관x)
		this.company = company;
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}

	// 객체 자체를 출력(print)시 객체의 필드의 값을 출력 재정의 
	@Override
	public String toString() {
		return "Car [company=" + company + ", carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	
	
	
	

}
