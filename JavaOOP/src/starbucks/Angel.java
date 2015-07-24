package starbucks;

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		AngelCoffee kim = new AngelCoffee();
	//	System.out.println("1.블랙커피, 2. 설탕커피");
	//	kim.prepare(scanner.nextInt());
		AngelTea lee = new AngelTea();
		System.out.println("3.레몬티, 4.제몽티");
		lee.prepare(scanner.nextInt());
	}
}
