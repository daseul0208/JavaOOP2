package abstraction;

public class GunBot extends BasicBot{
	private int attack; // 공격력
	
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	@Override
	public void status() {
		super.status();
		System.out.println("로봇 공격력 :" + this.attack);
	}
}
