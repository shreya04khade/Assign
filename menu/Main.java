package com.sunbeam.quiz.menu;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// MainMenu.mainMenu(sc);
		MainMenu.mainMenuWithEnum(sc);

		sc.close();
	}

}
