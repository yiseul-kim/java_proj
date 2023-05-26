//package Chapter14.ex06;
//
//public class Account {
//
//	
//	
//	private long balance = 10000; 		//은행의 예금 잔고 
//	BalanceException bal = new BalanceException("예금잔고가 부족합니다. ");
//	
//	
//	//기본 생성자
//	Account () {} 
//	
//	//getter : 메소드를 호출시 필드의 정보를 출력, private 필드의 정보를 출력
//	public long getBalance ()	{
//		return balance;
//	}
//	
//	// 예금을 입금하는 메소드 : money에 +가 인풋되면 예금을 추가, 인풋 값을 받아서 잔고에 적용
//	public void deposit (int money)  {
//		// 코드 완성
//		
//			System.out.println("입금 금액은  "+ money +"원 이고, 잔액은 "+ (balance + money)+"원 입니다. ");
//		
//	
//	//예금을 출금하는 메소드  : money를 인풋받아서 예금잔고보다 작으면 BalanceException을 발생시킴 ("예금잔고가 부족합니다. ") 
//	public void withdrow (int money ) {
//		// 코드 완성
//		try {
//				if ( -10000 < money ) {
//				//정상처리
//				System.out.println("입금 금액은  "+ money +"원 이고, 잔액은 "+ (balance + money)+"원 입니다. ");
//				}else if ( money < -10000 ) {
//				throw bal;
//				}
//			}catch (BalanceException e) {
//			System.out.println(e.getMessage());
//			}					
//		}	
//}
//
