package Chapter17.ex04;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_TreeSet_Method02 {

	public static void main(String[] args) {
		/*
		 	TreeSet은  < Set<E> / SortedSet<E> (정렬) / NavigableSet<E> (검색) >인터 페이스를 구현한 클래스
		 	 	-- TreeSet을 객체화 해서 Set 타입으로 지정할 경우 Set의 메소드만 사용 가능
		 	 	-- TreeSet을 객체화 해서 TreeSet 타입으로 지정하면 정렬/ 검색 기능의 메소드를 사용 가능하다. 
		 	 	-- 값을 저장할 때 오름차순 정렬되어서 값이 저장 ( 1 ==> 9 , a to z , 가 to 하 ) 
		 */
		
		// 중요 : TreeSet을 객체화 해서 TreeSet 타입으로 지정 why? 정렬과 검색 기능을 사용하기 위해( sortedSet & NavigableSet )
		TreeSet<Integer> treeSet = new TreeSet();
		
		// TreeSet에 값 입력 : 50에서 2씩 감소하면서 저장			<== 정렬 되어서 입력됨 ( 오름차순 정렬로 출력됨)  : TreeSet특
		for (int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}
		
		// 출력 : Iterator : 객체를 출력하면서 연산처리를 실행할 때 필요
		Iterator<Integer> ir = treeSet.iterator();			// Iterator 장착
		
		while (ir.hasNext() ) {
			System.out.print( ir.next() + " ");
		}
		System.out.println("\n==========");
		
		// 출력 : 간단한 방법(객체 넣어서 값만 출력할 때 )
		System.out.println(treeSet);

		System.out.println("===== 검색 기능 사용 (가져오기)=====");
		// 1. first ( ) : 제일 처음값 가져오기 
		System.out.println(treeSet.first());		//2
		
		// 2. last ( ) : 제일 마지막 값 가져오기 
		System.out.println(treeSet.last());			//50
		
		// 3. lower ( E element ) : element 보다 작은 값을 출력 
		System.out.println(treeSet.lower(26));		//24
		
		// 4. higher ( E element ) : element 보다 큰값 출력
		System.out.println(treeSet.higher(26));		//28
		
		// 5. floor ( E element ) : element를 포함해서 작은값 출력 
		System.out.println(treeSet.floor(27));		//26

		// 6. ceiling ( E element ) : element를 포함해서 큰값 출력
		System.out.println(treeSet.ceiling(26));		//26
		
		System.out.println(" === 데이터 꺼내기 ====");
		
		// 7. pollFirst ( ) : 제일 첫번째 값 꺼내기
		int treeSetSize = treeSet.size();
		System.out.println("treeSetSize : " + treeSetSize);		//25
		
		for ( int i = 0 ; i< treeSet.size() ; i++ ) {
			System.out.println(treeSet.pollFirst());		// 25번 루프 돌면서 첫번째 값만 끄집어 낸다. 
		}
		
		System.out.println("======================");
		System.out.println(treeSet.size());
		
		System.out.println("======================");
		
		
		// 8.  pollLast ( ) : 제일 마지막 값 꺼내오기
		// treeSet 값 재정의 
		for ( int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}		
		System.out.println("========= treeSet 값 출력 =============");
		System.out.println(treeSet);
		System.out.println("=========== 마지막 값 끄집어내기 ===========");
		for ( int i = 0 ;  i < treeSet.size() ; i++ ) {
			System.out.println(treeSet.pollLast()); 		// 마지막 값 끄집어내기
		}
		System.out.println("=========== 출력 ===========");
		// 출력
		System.out.println(treeSet);
		
		
		
		System.out.println("=========SortedSet<E> headSet ( E element )=========");
		// 9. SortedSet<E> headSet ( E element ) : element값의 Head 쪽으로 정렬해서 값을 저장 < element 미포함 > 
		// treeSet 값 재정의 
		for ( int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}	
		// 출력		
		System.out.println(treeSet);
		
		SortedSet<Integer> sSet = treeSet.headSet(20);		
		System.out.println(sSet);		// [2, 4, 6, 8, 10, 12, 14, 16, 18]
		
		
		System.out.println("========NavigableSet <E> headSet (E element)========");
		// 10. NavigableSet <E> headSet (E element) : element값의 Head 쪽으로 정렬해서 값을 저장 < element 포함 > 
		for ( int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}	
		System.out.println(treeSet);
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);		//NavigableSet은 뒷쪽에 하나더 조건이 붙음 (true)
		System.out.println(nSet);		//[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]			
		
		
		
		//  *  SortedSet : Head 쪽으로 갈때는 미포함, Tail 쪽으로 갈때는 포함. 
		
		
		
		System.out.println("=========SortedSet<E> tailSet ( E element )=========");
		// 11. SortedSet <E> tailSet( E element) : element값의 Tail 쪽으로 정렬해서 값을 저장 < element 포함 > 
		for ( int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}	
		// 출력		
		System.out.println(treeSet);		
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);
		System.out.println(sSet2);
		
		
		System.out.println("========NavigableSet <E> tailSet (E element)========");
		// 12. NavigableSet <E> tailSet (E element) : element값의 Tail  쪽으로 정렬해서 값을 저장 < element 미포함 > 
		for ( int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}	
		
		// 출력		
		System.out.println(treeSet);		
		NavigableSet<Integer> nSet2 = treeSet.tailSet(20, false);		// true : 20 포함, false : 20 미포함 선택 가능
		System.out.println(nSet2);
		
		
		
		System.out.println("========== 특정 범위의 값 가져오기 subSet() ==========");
		
		
		
		// 13. subSet ( ) : 특정 범위의 값 가져오기 
		System.out.println("========== 특정 범위의 값 가져오기 subSet()  SortedSet <E>==========");
		// 13-1 SortedSet <E>
		for ( int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}	
		System.out.println(treeSet);
		
		SortedSet sSet3 = treeSet.subSet(10, 20);		// 10(포함) ~ 20(미포함)		포함 여부 고정 
		// 출력 
		System.out.println(sSet3);
		
		
		System.out.println("========== 특정 범위의 값 가져오기 subSet()  NavigableSet <E>==========");
		// 13-2 NavigableSet <E>
		for ( int i = 50 ; i>0 ; i-=2) {
			treeSet.add(i);
		}	
		System.out.println(treeSet);
		
		 NavigableSet nSet3 = treeSet.subSet(10, true, 20, true);		// 끝과 시작 포함, 미포함 선택 가능 		 
		 System.out.println(nSet3);
		
		 
		 System.out.println("=============반대로 정렬하기 (desending)===============");
		 // 14. 반대로 정렬하기 (desending)
		 for ( int i = 50 ; i>0 ; i-=2) {
				treeSet.add(i);
			}	
			System.out.println(treeSet);
		
			NavigableSet<Integer> desc = treeSet.descendingSet();		// NavigableSet에 저장시켜줘야함(리턴타입이 NavigableSet이라서)
			System.out.println(desc);
		
			// desc는 내림차순 정렬되어 있다. 
			
			NavigableSet<Integer> asc = desc.descendingSet();		// desc되어 있는 것을 다시 desc시킴(asc로 만듬) 
			System.out.println(asc);
			
	}

}
