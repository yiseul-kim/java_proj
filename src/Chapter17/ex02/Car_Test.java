package Chapter17.ex02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import Chapter17.ex01.List_ArrayList_Method;

public class Car_Test {

	public static void main(String[] args) {
		// 1. Car 타입의 객체 5개 생성후
		Car c1 = new Car("현대", "그랜저", "빨간", 300);
		Car c2 = new Car("삼성", "SM6", "노랑", 250);
		Car c3 = new Car("BMW", "BM6", "파랑", 350);
		Car c4 = new Car("밴츠", "밴츠6", "검정", 250);
		Car c5 = new Car("기아", "셀토스", "초록", 300);
		
		
		// 2. ArrayList에 저장
		List<Car> cList = new ArrayList <Car> ();
		cList.add(c1);	cList.add(c2);	cList.add(c3);
		cList.add(c4);	cList.add(c5);
		
		// 3. Vector에 저장
		List<Car> cList2 = new Vector <Car> ();
		cList2.add(c1);	cList2.add(c2);	cList2.add(c3);
		cList2.add(c4);	cList2.add(c5);
				
		// 4. LinkedList에 저장
		List<Car> cList3 = new LinkedList <Car> ();
		cList3.add(c1);	cList3.add(c2);	cList3.add(c3);
		cList3.add(c4);	cList3.add(c5);
		
		// 5. 리스트에 저장된 Car 객체를 가지고와서 출력 
		// 5-1. For문으로 출력
		for ( int i = 0; i<cList.size(); i++) {
			System.out.println(cList.get(i));
		}
				
		// 5-2. Enhanced For 문으로 출력 
		for (int d : cList2 ) {
			System.out.print(cList2.get(d));
		}
		
	}

}
