package chapter02.ex03;

public class RangeOfVariable {
	public static void main(String[] args) {
		// 변수의 사용 범위 : 블락에서 선언되면 그 블락 까지가 사용 범위

		
		  int vali =3;        // 전역변수
		  
		  { // if, for, while, do while     <== 블락({}) 내부에서 선언된 변수를 지역변수라고 부름 : 
		      int val2=5; // 지역 변수
		    //  System.out.println(val1);
		      System.out.println(val2);  
		}

		        
		// System.out.println(val2);
		      
		//System.out.println(val2);  // 오류 발생 : 블락 밖에서 선언됐기 때문에
	}

}
