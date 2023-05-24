package Chapter12.ex02;

abstract class Calc {
	abstract int add ( int a, int b );	// 두 정수를 인풋 받아서 더한값을 리턴
	abstract int diff ( int a, int b); 	// 뺴기
	abstract int mul ( int a, int b);	// 곱하기
	abstract double div ( int a, int b );	// 나누기
}
class Calc_Impl extends Calc {
	@Override
	int add(int a, int b) {
		return a+b;
	}
	@Override
	int diff(int a, int b) {
		return a-b;
	}
	@Override
	int mul(int a, int b) {
		return a*b;
	}
	@Override
	double div(int a, int b) {
		return (double)a/(double)b;
	}
}
abstract class Calc_Impl2 {
	abstract int add ( int a, int b );	// 두 정수를 인풋 받아서 더한값을 리턴
	abstract int diff ( int a, int b); 	// 뺴기
	abstract int mul ( int a, int b);	// 곱하기
	abstract double div ( int a, int b );	// 나누기
}
public class Ex02 {

	public static void main(String[] args) {
		
		
		Calc_Impl cal1 = new Calc_Impl();
		int a = 4;
		int b = 5;
		
		System.out.println(cal1.add(a, b));
		System.out.println(cal1.diff(a, b));
		System.out.println(cal1.mul(a, b));
		System.out.println(cal1.div(a, b));
				
		System.out.println("===================");
		
		Calc cal2 = new Calc_Impl () {
			@Override
			int add(int a, int b) {
				return a+b;
			}
			@Override
			int diff(int a, int b) {			
				return a-b;
			}
			@Override
			int mul(int a, int b) {
				return a*b;
			}
			@Override
			double div(int a, int b) {
				return (double)a/b;
			}
		};
		a=6;
		b=9;
		System.out.println(cal2.add(a,b));
		System.out.println(cal2.diff(a,b));
		System.out.println(cal2.mul(a,b));
		System.out.println(cal2.div(a,b));
			

	}

}
