package Chapter17.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Test {
	public static void main(String[] args) {
		// ArraysList 변수 선언 : <Student:>
		List<Student> aList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);		//콘솔로부터 값을 인풋 받는 
	
		boolean run = true ;
		int studentNum = 0;				// 스캐너로 학생수를 인풋 받는 변수 
		
	
		while ( run ) {
			System.out.println("================================");  
			System.out.println("1. 학생수 | 2. 점수 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("================================");  
			System.out.println("위의 번호중 하나의 정수를 입력하세요.  >>> ");
			
			int selectNo = sc.nextInt();
			if (selectNo == 1) {
				// 스캐너로 학생수를 인풋 받습니다. -> studentNum 변수에 할당
				System.out.println("학생 수를 입력해주세요.");
				studentNum = sc.nextInt();
				System.out.println("입력한 학생 수는 : "+ studentNum);
				System.out.println();
				
				
			} else if (selectNo == 2) {
				// 학생수가 인풋 되지 않으면 먼저 학생수를 입력하세요 메세지 출력 
				if (studentNum == 0 ) {
					System.out.println("학생수가 인풋 되지 않았습니다. 학생수를 입력하세요.");
					System.out.println();
				}else {				
				// 학생수에대한 각각의 student 객체를 생성후 점수를 입력 하고 aList에 저장 합니다.& 학생수만큼 루프돌리기 
							
					for( int i = 0 ; i<studentNum ;  i++) {			
						
						Student student = new Student() ;			// student 객체 생성
						
						System.out.print("학생"+(i+1)+"의 점수 : ");							
						int score = sc.nextInt();			// 스캐너로 점수를 인풋
						// 스캐너로 입력받은 값을 student객체에 setter를 사용해서 저장
						student.setScore(score);
						
						aList.add(student);
						} 	System.out.println("학생의 점수 입력이 완료되었습니다. "+"\n");
				}
				
				
			}else if (selectNo == 3) {
//				// 점수의 리스트를 출력 aList Student 객체내의 getter로 불러오기  
				if ( studentNum == 0) {
					System.out.println("학생수가 인풋 되지 않았습니다. 학생수를 입력하세요.");
				}else if ( aList.isEmpty( )  ) {
					System.out.println("먼저 [2. 점수]를 선택 후 입력해주세요. ");					
				}else {
					// aList의 Student 객체를 끄집어 내서 출력
					System.out.println("[3. 점수리스트]를 출력합니다. ");
					for ( int i = 0 ; i<aList.size() ; i++) {
						System.out.print((i+1)+"번 [ "+aList.get(i).getScore()+"점 ] ");						
					}
					System.out.println("학생의 점수 출력이 완료되었습니다"+"\n");
				}			
				
				
			}else if (selectNo == 4) {
				int maxScore = 0;		// 초기값 설정 0
				int sum = 0;
				double avg = 0.0;		// 초기값 설정 0.0				
				
				if ( studentNum == 0) {
					System.out.println("학생수가 인풋 되지 않았습니다. 학생수를 입력하세요.");
				}else if ( aList.isEmpty( )  ) {
					System.out.println("먼저 [2. 점수]를 선택 후 입력해주세요. ");					
				}else  {				
					// 평균 출력 
					// aList에 Student 객체에 getScore()를 사용해서 접수를 끄집어 내면서 처리
					for ( int i = 0 ; i < aList.size() ; i++) {
						Student student = aList.get(i);		// student 객체 끄집어 내는 구문						

							// 점수 : 객체의 getter를 사용해서 점수를 받아온다. 
 							int score = student.getScore();			//student의 점수를 끄집어 내는 구문
 							
 							sum += score ; 			// sum = sum+score ; 							
 							
 							// 최대 점수를 maxScore 변수에 할당 : if 조건으로 처리, 삼항 연산자로 처리
 							if ( score > maxScore ) {
 								maxScore = score ;		// maxScore보다 큰 값을 maxScore에 넣는다. 
 							} 							
					}
					avg = sum/aList.size();
				System.out.println("최대 점수는 : "+maxScore );
				System.out.println("평균 점수는 : "+ avg );				
				}			
				
				
			}else if (selectNo == 5) {
				// while 빠져나오기 
				break;		
				
				
			}else  {
				System.out.println(" !! 잘못 입력하셨습니다 !! ");
				System.out.println("1~5번까지의 정수를 입력해 주세요");
				System.out.println();
			}			
		}
		
		
		System.out.println("프로그램 종료됨");
		sc.close();			
	}
}
