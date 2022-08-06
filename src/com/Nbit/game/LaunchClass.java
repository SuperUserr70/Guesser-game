package com.Nbit.game;

import java.util.Scanner;

class Gusser {
	int guessNum;

  public int guessNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser please Guess the numbers:");
		int guessNum1 = sc.nextInt();
		if(guessNum1>0 && guessNum1<10)
		{
			guessNum = guessNum1;
		}
		else
		{
			System.out.println("Guesser please Guess the numbers between 1 - 9");
			 guessNum = sc.nextInt();
			
		}

		return guessNum;

	}

}

class Player1 {
	
	int pguessNum;
    public int playerNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("player1 please guess the number :");
	    pguessNum = sc.nextInt();
		return pguessNum;
	}
}
class Player2 {
	
	int pguessNum;
    public int playerNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("player2 please guess the number :");
	    pguessNum = sc.nextInt();
		return pguessNum;
	}
}
class Player3 {
	
	int pguessNum;
    public int playerNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("player3 please guess the number :");
	    pguessNum = sc.nextInt();
		return pguessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void collectNumFromGuesser() {

		Gusser g = new Gusser();
		numFromGuesser = g.guessNumber();
		/*
		 * if(numFromGuesser>0 && numFromGuesser<10) { numFromGuesser = numFromGuesser1;
		 * } else { Gusser g1 = new Gusser();
		 * System.out.println("Guesser please Guess the numbers between 1 - 9");
		 * numFromGuesser = g1.guessNumber(); }
		 */
	}

	public void collectFromPlayer() {

		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		Player3 p3 = new Player3();

		numFromPlayer1 = p1.playerNumber();
		numFromPlayer2 = p2.playerNumber();
		numFromPlayer3 = p3.playerNumber();
	}
	public void collectFromPlayer1And2() {

		Player1 p1 = new Player1();
		Player2 p2 = new Player2();

		numFromPlayer1 = p1.playerNumber();
		numFromPlayer2 = p2.playerNumber();
	}
	public void collectFromPlayer1And3() {

		Player1 p1 = new Player1();
		Player3 p3 = new Player3();

		numFromPlayer1 = p1.playerNumber();
		numFromPlayer3 = p3.playerNumber();
	}
	public void collectFromPlayer2And3() {

		Player2 p2 = new Player2();
		Player3 p3 = new Player3();

		numFromPlayer2 = p2.playerNumber();
		numFromPlayer3 = p3.playerNumber();
	}
	void compare() {
		if(numFromGuesser == numFromPlayer1) 
		{
			if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser == numFromPlayer2) 
			{
				System.out.println("Player1 and player2 tied");
				System.out.println("------------- FINAL ROUND----------------");
				Umpire u = new Umpire();
				u.collectNumFromGuesser();
				u.collectFromPlayer1And2();
				u.compareSemi();
				
				
			}
			else if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player1 and player3 tied");
				System.out.println("------------- FINAL ROUND ----------------");
				Umpire u = new Umpire();
				u.collectNumFromGuesser();
				u.collectFromPlayer1And3();
				u.compareSemi();
				
			}
			else
			{
				System.out.println("player1 won the game");
			}
		}
		else if(numFromGuesser == numFromPlayer2) 
		{
			if(numFromGuesser == numFromPlayer3) 
			{
				System.out.println("Player2 and player3 tied");
				System.out.println("------------- FINAL ROUND ----------------");
				Umpire u = new Umpire();
				u.collectNumFromGuesser();
				u.collectFromPlayer2And3();
				u.compareSemi();
				
			}
			else
			{
				System.out.println("player2 won the game");
			}
		 	
		}
		else if(numFromGuesser == numFromPlayer3) 
		{
			System.out.println("Player3 won the game");	
		}
		else
			System.out.println("Game lost try again...");
	}

 void compareSemi()
 {
	 if(numFromGuesser == numFromPlayer1)
	 {
		 System.out.println("player1 won the game");
	 }
	 else if(numFromGuesser == numFromPlayer2)
	 {
		 System.out.println("player2 won the game");
	 }
	 else if(numFromGuesser == numFromPlayer3)
	 {
		 System.out.println("player3 won the game");
	 }
	 else
	 {
		 System.out.println("Game lost please try again...");
	 }
 }
}
public class LaunchClass {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectFromPlayer();
		u.compare();

	}

}
