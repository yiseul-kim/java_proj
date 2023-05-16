package Chapter07.ex02_method;
class F {
	//1. 메소드 : 두 배열의 각 방의 내용을 더해서 출력(arr1+arr2) : int
	
	void arrSum (int[] a, int[] b) {		//!!주의 int가 처음에는 숫자로 표시되지만 두번째 방부터는 문자로 출력된다.
		System.out.println("== 두 배열의 합은 : ");
		for(int i = 0 ; i<a.length; i++) {	// 방법 1.
			System.out.print(a[i] + b[i] + " ");
		} System.out.println("\n \n");
			
	}
		
			
	//2. 메소드 : 두 배열의 각 방의 내용을 빼서 출력(arr1-arr2) : int
	void arrDiff (int[] a, int[] b) {
		System.out.println("== 두 배열의 차는 : ");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]-b[i] + " ");
		} System.out.println("\n \n");
		
	}
	//3. 메소드 : 두 배열의 각 방의 내용을 곱하기 출력(arr1*arr2) : int
	void arrMul (int[] a, int[] b) {
		System.out.println("== 두 배열의 곱은 : ");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]*b[i]+ " ");
		} System.out.println("\n \n");
			
			
	}
	// 4. 메소드 : 두 배열의 각 방의 내용을 나누기 출력(arr1/arr2) : double
	void arrDiv (int [] a, int [] b) {
		System.out.println("== 두 배열의 나누기는 : ");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print((double)a[i] / b[i]+ " ");
		} System.out.println("\n \n");
	}
	
 }

	
public class Ex04 {
	public static void main(String[] args) {
		
		F f1 = new F();
		//1. 정수를 담는 배열 arr1 방 100를 생성 : 7의 배수만 저장
		//ex) 7 14 21 ...
		// J : 7의 배수를 저장하는 변수
		
		int[] arr1 = new int[100];
		for (int i = 0, j = 7;i<arr1.length; i++ ) {
			arr1[i] = j; 
			j+=7;
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\n \n");
			
		
		
		//2. 정수를 담는 배열 arr2 방 100를 생성 : 4의 배수만 저장 / 8의 배수는 빼고 저장 
			//ex) 4 12 20 ...
			// j : 4의 배수만 저장하는 변수
		
		int[] arr2 = new int[100];
		
		for (int i=0 , j= 1; true; j++) { // j가 4의 배수이고 8의 배수가 아닐때만 출력
			if (j % 4 == 0  && j % 8 != 0) {
			arr2[i] = j;
			
			System.out.print(arr2[i]+" ");
			i++;
			} 
			if(i==100) break;
		}   System.out.println();
//			System.out.println(arr1[99]);
//			System.out.println(arr1[100]);
		
			System.out.println("==========마지막 방 출력 ===================");
			f1.arrSum(arr1, arr2);
			f1.arrDiff(arr1, arr2);
			f1.arrDiv(arr1, arr2);
			f1.arrMul(arr1, arr2);
		
		
	
	}
  }
 

