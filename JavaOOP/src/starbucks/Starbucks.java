package starbucks;

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {
		/*
		 인터페이스를 구현한 클래스의 객체 생성문법
		 인터페이스 인스턴스 = new 생성자();
		 */
		Recipe coffee = new Coffee();
		Recipe tea = new Tea();
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		System.out.println("1.블랙커피, 2. 설탕커피");
		Scanner scanner = new Scanner(System.in);
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("3.레몬티, 4.제몽티");
		Scanner scanner = new Scanner(System.in);
		tea.select(scanner.nextInt());
		tea.serve();
	}
}
