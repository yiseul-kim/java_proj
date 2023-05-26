package Chapter14.ex06;

public class Account_Test {

	public static void main(String[] args) {
		// 
//		Account a2 = new Account ();
//		a2.deposit(1000);
//		a2.withdrow(-8000);
//		a2.withdrow(-20000);
		
		Account2 a1 = new Account2 ();		
		//현재 잔고 // 필드의 접근 제어자가 private 이므로 getter를 사용해서 필드 정보를 출력
		System.out.println(a1.getBalance());
		System.out.println("================");
		
		//예금입금
		a1.deposit(30000);		// 3만원 입금.		
		System.out.println(a1.getBalance());		// 잔고가 변환됨. 
		System.out.println("================");
		
		//추가 예금
		a1.deposit(50000); 		
		System.out.println("================");
		
		// 출금 --> 일반 예외를 throws 호출하는 곳에서 예외를 처리하도록 적용. 		
		try {
			a1.withdrow(60000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("================");
		
		// 출금 --> 예외 발생
		try {
			a1.withdrow(40000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
