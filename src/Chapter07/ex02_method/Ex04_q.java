//package Chapter07.ex02_method;
//class F {
//	//1. 메소드 : 두 배열의 각 방의 내용을 더해서 출력(arr1+arr2) : int
//	
//	void plus (int[] a, int[] b) {
//		System.out.println("== 두 배열의 각 방의 내용을 더해서 출력 ==");
//		for ( int i = 0; i<a.length; i++) {
//			for( int j = 0; j<b.length; j++) {
//				System.out.print(a[i]+b[j]+" ");
//				}
//			}
//	}
//		
//			
//	//2. 메소드 : 두 배열의 각 방의 내용을 빼서 출력(arr1-arr2) : int
//	void minus (int[] a, int[] b) {
//		System.out.println("== 두 배열의 각 방의 내용을 빼서 출력 ==");
//		for ( int i = 0; i<a.length; i++) {
//			for( int j = 0; j<b.length; j++) {
//				System.out.print(a[i]+b[j]+" ");
//				}
//			}
//	}
//	//3. 메소드 : 두 배열의 각 방의 내용을 곱하기 출력(arr1*arr2) : int
//	void mul (int[] a, int[] b) {
//		for ( int i = 0; i<a.length; i++) {
//			for( int j = 0; j<b.length; j++) {
//				System.out.print(a[i]-b[j]+" ");
//				}
//			}
//	}
//	// 4. 메소드 : 두 배열의 각 방의 내용을 나누기 출력(arr1/arr2) : double
//	void div (double [] a, double [] b) {
//		for ( int i = 0; i<a.length; i++) {
//			for( int j = 0; j<b.length; j++) {		
//				System.out.println(a[i]/b[j]);
////				return a[i]/b[j];
//				}
//			}
//	}
// }
//
//	
//public class Ex04 {
//	public static void main(String[] args) {
//		F f1 = new F();
//		//1. 정수를 담는 배열 arr1 방 100를 생성 : 7의 배수만 저장
//			//ex) 7 14 21 ...
//		int[] arr1 = new int[100];
//		for (int i=0, a=7; i<arr1.length; i++, a+=7 ) {
//			arr1[i] = a;
//			System.out.println(arr1[i]);
//		}
//			
//		
//		
//		//2. 정수를 담는 배열 arr2 방 100를 생성 : 4의 배수만 저장 / 8의 배수는 빼고 저장 
//			//ex) 4 12 20 ...
//			
//		int[] arr2 = new int[100];
//		
//		for (int i=0, a=4; i<arr2.length; i++, a+=7 ) {
//			arr2[i] = a;
//			if( a % 8 != 0) {
//				arr2[i] = a;
//			}
//		}
//		
//		
//		f1.plus(arr1, arr2);
//		f1.minus(arr1, arr2);
//		f1.mul(arr1, arr2);
//		f1.div(arr1,arr2);
//		
//	
//
// }
// }
//
