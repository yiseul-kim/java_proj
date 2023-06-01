package Chapter17.ex04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 	1. for문을 사용해서 1 ~ 100까지 HashSet에 값을 저장
		 	2. Iterator를 사용해서 HashSet에  저장된 값을 출력
		 	3. Enhanced for문을 사용해서 출력
		 	4. HashSet에 저장된 값을 --> 배열로 변환, 일반 for문을 사용해서 출력 
		 	
		 	완료시간 12: 50분까지 완료  
		 */
		
		// Set 선언 		
		Set<Integer> hhSet = new HashSet();
		HashSet<Integer> hhSet1 = new HashSet();		// 가능
		
		
		System.out.println("===1. for문을 사용해서 1 ~ 100까지 HashSet에 값을 저장====");
		for ( int i = 1 ; i<=100 ; i++) {
			hhSet.add(i);
		}
		System.out.println(hhSet+"\n");
		
		
		System.out.println("===2. Iterator를 사용해서 HashSet에  저장된 값을 출력====");
		Iterator <Integer> iterator1 = hhSet.iterator();
				
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next()+ " ");
		}
		System.out.println("\n");
		
		
		System.out.println("===3. Enhanced for문을 사용해서 출력====");
		for(Integer k : hhSet ) {
			System.out.print(k + " ");
		}
		System.out.println("\n");
		
		
		System.out.println("===4. HashSet에 저장된 값을 --> 배열로 변환, 일반 for문을 사용해서 출력====");
		Integer[ ] obj1 = hhSet.toArray(new Integer[0]);
		
		for ( int i = 0 ; i < obj1.length ; i++) {
			System.out.print(obj1[i] + " ");
		}		
		System.out.println();
		System.out.println(hhSet.toString());
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
