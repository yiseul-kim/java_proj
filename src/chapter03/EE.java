package chapter03;
import java.util.Random;
import java.util.Scanner;

public class EE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int randomCounter = r.nextInt(100);
		System.out.println(randomCounter);
		
		while(true) {
			int tryCount = 1; 									//시도 회수를 세기 위한 변수
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println("0~99");
		
			while(true) {
				int inputNumber;								//사용자의 입력을 받을 변수
				
				System.out.print(tryCount++ + ">>");
				inputNumber = s.nextInt();						//숫자 입력 받음
				
				if(inputNumber == randomCounter) {				//정답일 경우
					System.out.println("맞았습니다.");
					System.out.print("다시하시겠습니까?(y/n)>>");
					if(s.next().equals("y")){
						break;
					}
					else return;
				}
				else if(inputNumber > randomCounter) {			//사용자 입력값이 더 클 경우
					System.out.println("더 낮게");
				}
				else if(inputNumber < randomCounter) {			//사용자 입력값이 더 작을 경우
					System.out.println("더 높게");
				}
			}
		}
		
	}

}
 