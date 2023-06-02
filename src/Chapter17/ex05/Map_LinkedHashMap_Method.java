package Chapter17.ex05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map_LinkedHashMap_Method {

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
		
		Map<Integer, String> hmap1 = new LinkedHashMap();
		
		System.out.println("========= put(K, V) ===========");
		//2 .put(K, V) : Map에 값을 추가할 때 사용
		hmap1.put(2, "나다라");		// key : 2, value	: "나다라"
		hmap1.put(1, "가나다");		
		hmap1.put(3, "다라마");		
//		hmap1.put(3, "가가가");		
		
		System.out.println(hmap1);
		
		System.out.println("=========  putAll(다른 맵객체) ===========");
		//3. putAll(다른 맵객체) : 주의 : key, Value 타입이 같아야 한다. 
		Map<Integer, String> hmap2 = new LinkedHashMap();
		hmap2.put(10, "홍길동");
		
		hmap2.putAll(hmap1);
		
		System.out.println(hmap2);
		
		System.out.println("========= replace (K key, V value ) ===========");
		// 4. replace (K key, V value ) : key 의 값을 value로 수정
		hmap2.replace(1,"가가가");
		hmap2.replace(4,"라라라");		// key : 4는 존재하지 않음 (예외가 발생되지 않음)
		
		System.out.println(hmap2);
		
		System.out.println("========= greplace ( K key, V oldValue, V newValue) ===========");
		// 5. replace ( K key, V oldValue, V newValue)  : oldValue의 값을 newValue로 수정
		hmap2.replace(1, "가가가", "나나나");
		hmap2.replace(2, "다다다", "라라라");		// oldvalue의 값이 정확하게 일치하지 않으면 작동하지 않음
		
		System.out.println(hmap2);
		
		System.out.println("========= get (Object key) ===========");
		// 6. get (Object key) : key를 넣고 해당하는 value를 가져옴 
		
		System.out.println(hmap2.get(3));
		System.out.println(hmap2.get(1));
		
		System.out.println("========= containskey (Object key) ===========");
		// 7. containskey (Object key) : 해당 키가 존재하면 true, 없으면 false
		System.out.println(hmap2.containsKey(2));		// 값 존재 true
		System.out.println(hmap2.containsKey(4));		// 값 없음 false
		
		System.out.println("========= containsvalue(Object value)===========");
		// 8. containsvalue(Object value) : 해당 값이 존재하면 true, 없으면 false
		System.out.println(hmap2.containsValue("홍길동"));
		System.out.println(hmap2.containsValue("라라라"));
		
		System.out.println("========= Set<K> keySet() ===========");
		//9. Set<K> keySet() :키만 추출
		Set<Integer> keyset = hmap2.keySet();		// set으로만 작동 주의
		System.out.println(keyset);
		
		System.out.println("========= Set<Map.Entry<K, V> entrySet() ===========");
		//10. Set<Map.Entry<K, V> entrySet() : key와 Value ==> entry 를 추출
		Set<Map.Entry<Integer, String>> entrySet = hmap2.entrySet();
		
		System.out.println(entrySet);
		
		System.out.println("========= size(): 총갯수 ===========");
		// 11. size(): 총갯수
		System.out.println(hmap2.size());
		
		System.out.println("========= remove(Object key) ===========");
		// 12.remove(Object key) : 키로 값을 삭제 
		hmap2.remove(1);
		hmap2.remove(4);			// 방 번호가 없어도 오류 발생되지 않음.
		System.out.println(hmap2);
		
		System.out.println("========= remove ( Object key, Object value ) ===========");
		// 13. remove ( Object key, Object value ) : key와 value가 정확히 일치해야만 삭제됨
		hmap2.remove(2, "나다라");		// 삭제 완료
		hmap2.remove(3, "나다라");		// 삭제 불가능 
		System.out.println(hmap2);
		
		System.out.println("=========  clear() ===========");
		//14. clear() : 전체 삭제
		hmap2.clear(); 	//전체 삭제 
		System.out.println(hmap2);
		
		
		
		
		
		
		
	}

}

