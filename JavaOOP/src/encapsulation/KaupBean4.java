package encapsulation;

import java.util.Scanner;

/*
 * @ Date : 2015.07.14
 * @ Author : me
 * @ Story : Kaup지수 프로그램을 객체화 하는 예제
 */
public class KaupBean4 {
	
	private String name, msg; // 멤버필드
	private double height, weight;
	private int idx;
	
	/*
	 * 스캐너가 입력받은 값을 저장하는 메소드가 필요해졌습니다.
	 * 이를 setter 메소드라고 합니다. 이 메소드는 set + 멤버필드()로 이름이 자동 생성됩니다 
	 * setter는 write의 의미입니다
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getIndex() { // 메소드(동사)

		idx = (int) ((weight / (height*height))*10000);
		if (idx > 30) {
			msg = "비만";
		} else if(idx > 24){
			msg = "과체중";
		} else if(idx > 20){
			msg = "정상";
		} else if(idx > 15){
			msg = "저체중";
		} else if(idx > 13){
			msg = "마름";
		} else{
			msg = "영양실종";
		}
		
	}
	
	@Override
	public String toString() {
		/*
		 public : 접근제한자
		 String : 리턴 타입(결과값의 타입이 Sttring이다)
		 toString() : 메소드 이름(이것은 자바에서 픽스된 메소드) 
		 */
		// 선언부
		String str = ""; // 지역변수는 무조건 초기화
		// 연산부
		str = "["+name+"] 키: "+height+"cm, "+ "weight: "+70+"kg, 카우푸지수: "+msg;
		// 출력부
		return str;
	}
}
