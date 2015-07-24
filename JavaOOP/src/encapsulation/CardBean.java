package encapsulation;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 생성자 문법
 생성자는 setter를 통해 값을 할당하는 기능을 보강하여, 객체가 만들어짐과 동시에 값을 할당하도록 특수하게 만들어진 ★★★메소드
 */
public class CardBean {
/*====== Field ======*/
	private String name, name2, winner; // 멤버필드 변수(멤변)는 초기화를 하지 않는다!!!
	private int card1, card2;
	
/*=====Constructor=====*/
	// 생성자 위치는 (멤버)필드와 메소드 영역 사이에 위치
	// 생성자 모양
	// publi 클래스이름(){}
	public CardBean(){} //디폴드 생성자
	public CardBean(String name) {
	// setter 역할을 겸용하는 생성자
		this.name = name;
		this.card1 = (int) ((Math.random()*13)+1);
	}
	// 디폴트 생성자는 개발자가 직접 만들지 않아도
	// 프로그램 내부에서는 생성되 있는 것으로 인식한다
	// 그런데, 이것을 꺼내 든 이유는 new 키워드를 통한 객체생성 역할뿐 아니라
	// 생성과 동시에 값을 할당하는기능을 추가시키기 위해서...
	
/*=====Method=====*/	
	
	public String getName() {
		return name;
	}
	public int getCard1() {
		return card1;
	}
	public int getCard2() {
		return card2;
	}
	public String getWinner() {
		// getter에서 문제해결 패턴
		// 제일 먼저 리턴타입을 카피
		String winner = "";
		if (this.card1 > this.card2) {
			winner = name + "승리";
		} else if(this.card2 > this.card1){
			winner = name2 + "승리";
		} else{
			winner = "비김";
		}
		return winner;
	}
	public void setName(String name) {
			this.name = name;
	}
	@Override
	public String toString() {
		return "["+name+" : "+card1+"] vs ["+name2+": "+card2+"]\n"
		 +this.getWinner();
	}
	
}
