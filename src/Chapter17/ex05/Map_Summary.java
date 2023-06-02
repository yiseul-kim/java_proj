package Chapter17.ex05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Summary {

	public static void main(String[] args) {
		/*
	 	map<K,V> 	:  
	 					K(Key)		: 중복되면 안됨, Set 관리됨 		<== 방번호 (List)
	 					V(Value)		: 중복된 값을 넣을 수 있음.
	 					
	 			- HashMap <K, V>	: key(HashSet) 임의로 출력됨.(랜덤출력)	/ 싱글 쓰레드(ArrayList), 
	 			- HashTable <K,V>	: key(HashSet) 임의로 출력됨.(랜덤출력)  / 멀티 쓰레드(Vector), 모든 메소드가 동기화 처리됨
	 			- LinkedHashMap<K,V> : key(LinkedHashSet) : 넣은 순서대로 출력됨
	 			- TreeMap<K, V> 	: key(TreeSet) : key가 정렬되어 들어감. <오름차순 정렬>
	 */
		
		//1. HashMap : 입력 순서와 출력 순서가 다르다.  싱글 쓰레드 환경 <== ArrayList
			Map<String, Integer	> hMap = new HashMap();
			hMap.put("다", 30);		
			hMap.put("마", 40);		
			hMap.put("나", 50);		
			hMap.put("가", 60);		
			hMap.put("가", 70);		
			
			System.out.println(hMap);
			
		// 2. HashTable : 입력 순서와 출력 순서가 다르다. 모든 메소드가 동기화, 멀티쓰레드 환경 <==Vector
			Map<String, Integer> htMap = new Hashtable();
			htMap.put("다", 30);		
			htMap.put("마", 40);		
			htMap.put("나", 50);		
			htMap.put("가", 60);		
			htMap.put("가", 70);		
			
			System.out.println(htMap);
			
		// 3. LinkedHashMap :  입력된 순서로 출력됨
			Map<String, Integer> LMap = new LinkedHashMap();
			LMap.put("다", 30);		
			LMap.put("마", 40);		
			LMap.put("나", 50);		
			LMap.put("가", 60);		
			LMap.put("가", 70);		
			
			System.out.println(LMap);
			
		// 4. TreeMap : Key 정렬되어서 입력됨, 오름차순 정렬 
			Map<String, Integer> tMap = new TreeMap();
			tMap.put("다", 30);		
			tMap.put("마", 40);		
			tMap.put("나", 50);		
			tMap.put("가", 60);		
			tMap.put("가", 70);		
			
			System.out.println(tMap);
			
			
			
	}

}
