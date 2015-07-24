package encapsulation;

public class PayBean {
	// 메소드는 선언부, 연산부, 출력부 이렇게 나누고
	// Bean 클래스라면 멤버필드 + 멤버메소드
	private String name; // 멤버필드 변수(멤변)는 초기화를 하지 않는다!!!
	private int salary;
	
	
	// 멤버메소드 영역이 시작
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public int getTax() {
		int tax = 0; // 지변은 초기화 필수
		tax = (int) (salary * 0.1); 
		return tax;
	}
	/*
	 * this는 이 클래스 내부에 있는 ~~~ 의미
	 */
	public int getMoney() {
		int money = 0; // 지변 초기화
		money = salary - this.getTax();
		return money;	
	}
	@Override
	public String toString() {
		System.out.println("["+this.name+" 실급여]\n"+ "월급: "+this.salary+" 만원\n"+ "세금: "+this.getTax()+"만원\n"+ "실급여: "+this.getMoney()+"만원");
		
		
		System.out.println(" Pay 프로그램은 월급을 입력받아서 세금을 떼고 십급여를 고객에게 알려주는 프로그램입니다");
	
		return super.toString();
		
		
	}
}
