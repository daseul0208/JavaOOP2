package encapsulation;

public class Dice {
/* ===== Field ===== */
	private int num; // ㅜ사위는 하나의 숫자만 갖는다
/* ===== Constructor ===== */
	// 생성자 단축키 컨트롤 + 스페이스
	public Dice() {
		this.num = (int) ((Math.random()*6)+1);
		this.num = (int) ((Math.random()*6)+1);
	}
/* ===== MemberMethod ===== */
	public int getNum() {
		return num;
	}
}
