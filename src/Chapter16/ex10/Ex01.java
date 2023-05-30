package Chapter16.ex10;


//제너릭 클래스
// 		X : x 좌표의 포인트
// 		Y : y 좌표의 포인트
// point 클래스는 점의 좌표를 표시하는 클래스
class Point < X, Y > {
	X x;
	Y y;	
	// 생성자를 사용해서 필드의 값 입력 
	Point (X x , Y y ) {
		this.x =x;
		this.y =y;
	}
	
	// getter로 필드의 값을 출력 
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}	
}

// 제너릭 메소드가 포함된 클래스 생성
class GenericM {
	// 두점의 좌표를 매개 변수로 받아서 넓이를 구해서 리턴(더블) : P1(10.5, 13.3) P2(30.5, 27.3)
	public static <T, V> double makeRectangle (Point<T, V> p1, Point<T, V> p2) {
		// 두 점의 좌표 값을 받아서 넓이를 구해서 더블형으로 리턴
		// p1은 
		double left = ((Number)p1.getX( )).doubleValue( );
		double right = ((Number)p2.getX( )).doubleValue( );
		double top = ((Number)p1.getY( )).doubleValue( );
		double bottom = ((Number)p2.getY( )).doubleValue( );
		
		double width = right - left ;
		double height = bottom - top;
		
		return width * height;
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// 1. 두 점의 포인트를 저장하는 객체 생성: p1(10.5, 13.3) , p2(30.5, 27.3)
		Point < Double, Double > p1 = new Point (10.5, 13.3);
		Point < Double, Double > p2 = new Point (30.5, 27.3);
		
		double size = GenericM.<Double, Double>makeRectangle(p1,p2);
		System.out.println(size+"cm2");
		 

	}

}
