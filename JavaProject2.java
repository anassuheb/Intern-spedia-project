//importing important packages

import java.util.*;  


//main program

public class JavaProject2 {
	public static void main(String[] args) {
		int ans,guess,guessNum=0;
		final int maximumGuesses=5;
		String str,playAgain="yes";
		
		Scanner scan=new Scanner(System.in);
		Random generator=new Random();
		ans=generator.nextInt(101)+1;
		
		while(playAgain.equals("yes") || playAgain.equals("YES")) {
			System.out.println("Hey Welcome to the game \nGuess a Number between 1 to 100");
			System.out.println("Guess a number(Enter 0 to exit from game):");
			
			guess=scan.nextInt();
			guessNum=0;
			while(guess!=0) {
				guessNum++;
				if(guess==ans) {
					System.out.println("perfect!You got it right \nHurray!!You Win");
					break;
				}else if(guess<ans)
					System.out.println("OPPS!! The guessed number is lower than actual number");
				else if(guess>ans)
					System.out.println("OOPs!! The guessed number is higher than actual number");
				if(guessNum==maximumGuesses) {
					System.out.println("your "+maximumGuesses+" chances are exhausted");
					System.out.println("The actual number was "+ans+"\nBetter Luck next time");
					break;
				}
				System.out.println("Enter your guess(0 to exit from game:)");
				guess=scan.nextInt();
					
			}
			System.out.println("want to play again?(yes/no)");
			playAgain=scan.next();
			ans=generator.nextInt(101)+1;
		}
		System.out.println("Thanks for playing \nWelcome again");
	}
}
