package com.qa.java;

public class Blackjack {

	public static void main(String[] args) {

		play(16, 20);

	}

	public static void play(int n1, int n2) {

		if (n1 > 21 && n2 > 21)
			System.out.println("0");
		if (n1 <= 21 || n2 <= 21) {
			if (n1 <= 21 && (n1 >= n2 || n2 > 21))
				System.out.println(n1);
			else if (n2 <= 21)

				System.out.println(n2);
		}
	}

}
