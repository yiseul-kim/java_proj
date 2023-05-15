package chapter05.ex03;

import java.util.Scanner;

public class Ex01_Q {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		
		
		
		do {
			System.out.println("=============================================");
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수 만 빼고 저장후 출력");
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장후 출력");
			System.out.println("4.프로그램 종료");
			System.out.println("=============================================");

			System.out.println(" 1 ~ 4번 까지 번호를 입력 하세요 >>> ");
			a = sc.nextInt();
			
			if (a ==1 ) {
				System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
				System.out.println();
				
				System.out.println("정수를 입력하세요.");
				int b=sc.nextInt();
				int[] arr2 = new int[b];
				
				for (int d=0 ; d<arr2.length; d++) { 
					System.out.println(d*7+","+d*8);
					
				}					

			}else if (a==2) {
				System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수 만 빼고 저장후 출력");
				System.out.println();

				System.out.println("정수를 입력하세요");
				int c=sc.nextInt();
				int[] arr3 = new int[c];
				
				 for (int aa=1; aa<arr3.length; aa++) {
					if(aa%4==0) {
						System.out.print("");
					}else {
						System.out.println(aa);
					}
				}
			}else if (a==3) {
				System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수인 경우 빼고 저장후 출력");
				System.out.println();
				
				System.out.println("정수를 입력하세요.");
				int f=sc.nextInt();
				int[] arr4 = new int[f];
				
				for (int g = 0 ; g<arr4.length; g++) { 
					int h = g*3;
					if( h % 6 == 0) {
						System.out.print("");
					}else {
						System.out.println(h);
				
					}}	
			}else if (a==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력 했습니다. 1~4사이의 정수를 입력 하세요.");
			}
			
		} while (true);
		
		sc.close();
		
		
		
		
		
		
		
		
	}
}
