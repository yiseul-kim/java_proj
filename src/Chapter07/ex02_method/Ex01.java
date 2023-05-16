package Chapter07.ex02_method;

class C {
	
	void print ( int[] a, double[] b ) {
		
		// a 배열의 값을 for문으로 출력
		System.out.println("== 배열 출력 ==");
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("\n");
		
		// b 배열의 값을 for문으로 출력
		System.out.println("==더블 배열 출력 ==");
		for (int i = 0; i<b.length; i++) {
			System.out.print(b[i] + "  ");
		}
		System.out.println("\n");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		C c1 = new C();
		
		int[] arr1 = new int [] { 10,20,30,40,50,60 };
		
		
		c1.print(arr1, new double[] {10.33, 12.33});
		
	}

}
