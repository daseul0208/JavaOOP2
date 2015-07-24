package bank;

public interface BankRole {
	/*
	 계좌 개설 기능
	 */
	public void openAccount(
			
			String owenerName, // 계좌주 이름
			int password,   // 이름
			int restMoney      //잔액
			);
	public abstract BankBook searchAccountByAccountNo(String accountNo);
	// 계좌주 에름을 입력하면 그 사람 소유의 계좌가 전부 검색 (단, 동일인이 다수의 계좌를 가질수있다)
	
	public BankBook[] searchAccountByName(String ownerName);
	// 계좌주 이름을 입력하면 그 사람 소유의 계좌 갯수를 알려줌
	
	public int searchCountByName(String name);
	// 계좌번호로 특정계좌를 폐기하는 기능
	public boolean closeAccount(String accountNo);
	
	// 만들어진 통장을 고객에 주는 기능 = 생성결과를 보여준다
	

}
