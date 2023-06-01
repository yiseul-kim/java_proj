package Chapter17.ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_VS_LinkedList {
	public static void main(String[] args) {
		/*
		 		List<E>
		 			-  ArrayList<E>, Vector<E> : 검색시 성능이 빠르다. 추가(add)/ 삭제시 부하가 많이 걸린다. 
		 			-  LinkedList<E> : 검색이 느리다. 추가/ 제거 부하가 걸리지 않는다. 
		 */
		
		// 1. 데이터를 추가할 때 성능 비교
		List <Integer> aList = new ArrayList();
		List <Integer> linkedList = new LinkedList();
		
		//성능을 체크하는 변수 선언
		long startTime = 0 , endTime = 0;
		
		System.out.println("=== ArrayList 성능 체크 ===");
		// 1-1. ArrayList의 성능 체크 
		startTime = System.nanoTime();			// 현재 시간을 나노로 변환해서 정수형으로 저장.
		System.out.println(startTime);
			
		
		System.out.println("===ArrayList 10만개의 값 생성 속도[나노(초)]===");
			// ArrayList에 1부터 1씩 증가하면서 10만개의 값을 arrayList에 저장
		for(int i = 0 ; i< 100000 ; i++ ) {
			aList.add(0, i) ; 
		}
		endTime = System.nanoTime(); 

		// 프로그램을 실행한 나노타임;
		System.out.println(endTime - startTime);							// 250569500  나노(초) : ArrayList
		
		
		System.out.println("===LinkedList 10만개의 값 생성 속도[나노(초)]====");
		// 1-2. LinkedList 1부터 1씩 증가하면서 10만개의 값을 arrayList에 저장
		startTime = System.nanoTime();		
		for(int i = 0 ; i< 100000 ; i++ ) {
			linkedList.add(0, i) ; 
		}
		endTime = System.nanoTime(); 
		
		// 프로그램을 실행한 나노타임;
		endTime = System.nanoTime(); 
		System.out.println(endTime - startTime);						// 4690700 나노(초) : LinkedList
		
		System.out.println("===ArrayList 검색시 성능======");
		
		// 2. ArrayList 검색시 성능
		startTime = System.nanoTime();		
		for (int i = 0 ; i <100000 ; i ++) {
			aList.get(i);			//
		}
		endTime = System.nanoTime(); 
		
		System.out.println(endTime - startTime);							// 1787000 나노(초) : ArrayList
		
		System.out.println("=====LinkedList 검색시 성능======");
		
		// 2. LinkedList 검색시 성능
		startTime = System.nanoTime();		
		for (int i = 0 ; i <100000 ; i ++) {
			linkedList.get(i);			//
		}
		endTime = System.nanoTime(); 
		
		System.out.println(endTime - startTime);							// 2898874600 나노(초) : LinkedList
		
		
		
		
		
	}
}
