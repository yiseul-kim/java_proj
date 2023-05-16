package Chapter07.ex02_method;

class E { 
	
	// a는 배열, b는 배열의 각방의 값을 곱하는 인자
	// 배열의 각 방의 값을 b인자로 받은 변수로 곱해서 출력
	void print (int[] a , int b ) {
		//1. 배열의 내용을 출력
		System.out.println("==인풋 받은 배열의 내용을 출력==");
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]*b);
		} System.out.println("\n \n");
		
	}
}

public class Ex03 {
	public static void main(String[] args) {
		E e1 = new E();
		int[] arr1 = new int [] {11,22,33,44,55,66,77,88,99}; 
		e1.print(arr1, 30);
		
	}
}
