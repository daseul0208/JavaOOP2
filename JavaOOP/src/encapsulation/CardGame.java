package encapsulation;
/*
 버전업
 현재는 홍길동 승 이라고 나오는데 개선을 해달랍니다
 ==========
 홍길동 : 6
 김유신 : 4
 홍길동 승리
 ==========
 */
public class CardGame {
/*===== Field =====*/
	
	private String winner, looser; // 멤변선언
	private int winScore, looserScore;
	
/* ===== Constructor =====*/	
	// 생상자 단축키
	// CTRL + SPACE
	public CardGame() {} // 디폴트 생성자

	public CardGame(CardBean bean1, CardBean bean2) {
		// getter에서 문제해결 패턴
		// 제일 먼저 리턴타입을 카피
		String winner = "", looser = "";
		int winScore = 0, looseScore = 0;
		// 지역변수(로컬변수)는 메모리 영역중에서 (콜)스텍에 저장
		// 인스턴스변수는 메모리영역중에서 힙에 저장
		if (bean1.getCard1() > bean2.getCard1()) {
			winner = bean1.getName();
			looser = bean2.getName();
			winScore = bean1.getCard1();
			looserScore = bean2.getCard1();
		} else if(bean2.getCard1() > bean1.getCard1()) {
			winner = bean2.getName();
			looser = bean1.getName();
			winScore = bean2.getCard1();
			looserScore = bean1.getCard1();
		} else{
			
			winner = "비김";
		}
		this.winner=winner;
		this.looser = looser;
		this.winScore = winScore;
		this.looserScore = looseScore;
	}

/* ===== 멤머메소드 =====*/
	@Override
	public String toString() {
		
		return "==========\n"
				+ this.winner +" : "+this.winScore+" \n"
				+ this.looser+" : "+this.looserScore+" \n"
				+ this.winner+""
						+ " \n"
				+ "==========";
	}
}
