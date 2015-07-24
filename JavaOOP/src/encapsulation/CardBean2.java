package encapsulation;
/*
 * @ Date : 2015.07.15
 * @ Author : me
 * @ Story : 생성자 문법
 생성자는 setter를 통해 값을 할당하는 기능을 보강하여, 객체가 만들어짐과 동시에 값을 할당하도록 특수하게 만들어진 ★★★메소드
 */
public class CardBean2 {
/*====== Field ======*/
	private String name, name2; // 멤버필드 변수(멤변)는 초기화를 하지 않는다!!!
	private int card1, card2;
	
/*=====Constructor=====*/
	// 생성자 위치는 (멤버)필드와 메소드 영역 사이에 위치
	// 생성자 모양
	// publi 클래스이름(){}
	public void setName(String name) {
		this.name = name;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setCard1(int Card1) {
		this.card1 = card1;
	}
	public void setCard2(int Card2) {
		this.card2 = card2;
	}
	public String getWinner() {
		String winner = "";
		if (this.card1 > this.card2) {
				winner = name + "승리";
		} else if(this.card2 > this.card1){
				winner = name2 + "승리";
		} else {
				winner = "비김";
		}
		return winner;
	}
	@Override
	public String toString() {
		return "["+name+" : "+card1+"] vs ["+name2+" : "+card2+"]\n" + this.getWinner();
	}
}

