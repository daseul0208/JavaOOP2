package starbucks;

import java.util.Scanner;

public class Tea implements Recipe{
	 /*홍차(Tea) 끓이는 순서
	 1. 물을 끓인다
	 2. 티백을 내린다
	 3. 물을 컵에 붓는다
	 4. 레몬, 자몽 첨가 여부를 손님에게 묻는다
	    -레몬 : 레몬티, 자몽 : 자몽티
	 5. 홍차를 제공한다
	 	-고객님 레몬티가 나왓습니다*/
	private 
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
		case 3: this.tea = "레몬티"; break;
		case 2: this.tea = "자몽티"; break;
		
		
		default:this.tea = "선택오류";
			break;
		}
		
	}
	@Override
	public void serve() {
		System.out.println("고객님 "+this.tea+"가 나왔습니다.");
	
	
	
	

	}
}
