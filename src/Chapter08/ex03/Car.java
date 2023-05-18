package Chapter08.ex03;

public class Car {	// 외부 패키지에서 접근이 가능 
		
	private String company;
	private String carName;
	private int carMaxSpeed;
	private double carWeight;
	
	
	// getter 
	
	public String getCompany() {
		return company;
	}
	public String getCarName()	{
		return carName;
	}
	public int getCarMaxSpeed () {
		return carMaxSpeed;
	}
	public double getCarWeight () {
		return carWeight;
	}
	
	// setter
	
	public void setCompany ( String Company ) {
		this.company = Company;
	}
	public void setCarName ( String carName ) {
		this.carName = carName;
	}
	public void setCarMaxSpeed (int carMaxSpeed ) {
		this.carMaxSpeed = carMaxSpeed;
	}
	public void setCarWeight (double carWeight ) {
		this.carWeight = carWeight;
	}
	
	
		public static void main(String[] args) {
			
			Car c1 = new Car();
			c1.setCarName("그랜저");
			c1.setCompany("현대");
			c1.setCarMaxSpeed(255); 
			c1.setCarWeight(2.54);
			
			System.out.println(c1.getCarMaxSpeed());
			System.out.println(c1.getCarName());
			System.out.println(c1.getCarWeight());
			System.out.println(c1.getCompany());
			
		}
		
}
