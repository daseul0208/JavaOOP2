package starbucks;

public class Coffee implements Recipe{
	  /*커피 끓이는 순서
	  1. 물을 끓인다
	  2. 커피를 내린다
	  3. 물을 컵에 붓는다.
	  4. 설탕 첨가 여부를 손님에게 묻는다
	      -무설탕: 블랙, 설탕 : 밀크
	  5. 커피를 제공한다
	      -고객님 []커피가 나왔습니다.*/
/*=== 필드 ===*/	
	
	/*=== 생성자 ===*/
	/*=== 멤버메소드 ===*/
	@Override
	public void boilWater() {
		System.out.println("물을 끓인다.");
	}
	
	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 붓는다.")
	}
	
	@Override
	public void select(int option) {
		switch (option) {
		case 1: this.coffee = "블랙";break;
		case 2: this.coffee = "밀크";break;
		
		
		
		default:this.coffee = "선택오류";
			break;
		}
		
	}
	@Override
	public void serve() {
		System.out.println("커피를 내린다.");
	
}
