import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variables	
		Scanner input = new Scanner(System.in);
		String playerAnswer = "";
		String endGame = "";	
		int numOfGame = 0 ;
		int winNumber = 0;
	
		int caseEven = 0;
		int oddGenerated = 0;
		
		//loop through the dice generate and ask player to play again
		do
		{
			System.out.print("Please enter your answer either \"odd\" or \"even\": ");
			playerAnswer = input.next();
			int dice1=(int)(Math.random()*6+1);
			System.out.println("Number generated by Dice: " + dice1);
			//switch through odd or even answer from player
			switch(playerAnswer.toLowerCase())
			{
			case "odd":
				//check odd answer and print win, counting the win number, and odd number generated by computer
				if((dice1 == 1) || (dice1 == 3) || (dice1 == 5))
				{
					System.out.println("You win!!!");
					//increment by one if player win
					winNumber++;
					//increment by one if odd number is generated
					oddGenerated++;
				}
				if((dice1 == 0) || (dice1 == 2) || (dice1 == 4) || (dice1 == 6))
				{
					System.out.println("You lose!!!");
				}				
				break;
				//check even answer, counting winning number, and
			case "even":
				if((dice1 == 0) || (dice1 == 2) || (dice1 == 4) || (dice1 == 6))
				{
					System.out.println("You win!!!");
					//increment by one if player win
					winNumber++;
				}
				
				if((dice1 == 1) || (dice1 == 3) || (dice1 == 5))
				{
					System.out.println("You lose!!!");
					//increment by one if odd number is generated
					oddGenerated++;
				}
				caseEven++;
				break;
			}
			//increment by one after each game
			numOfGame++;
			//prompt user to keep playing or terminate the game
			System.out.print("Do you want to continue to Play? type \"yes\" or \"no\" to end game: ");
			endGame = input.next();
			
		}while(endGame.equalsIgnoreCase("yes"));
		
		float percentageWin = ((winNumber*100.0f)/numOfGame);
		float percentageOddGenerated = (oddGenerated*100.0f)/numOfGame;
		float percentageEvenGuess = (caseEven*100.0f)/numOfGame;
		//print the number of odd/even guesses, percentage win, percentage odd number generated
		//and number of game played.
		System.out.println("Number of games you played " + numOfGame);
		System.out.printf("Number of games you win %.2f%% \n", percentageWin);
		System.out.printf("Percentage even guesses entered by player %.2f%% \n", percentageEvenGuess);
		System.out.printf("Percentage odd number generated by Dice %.2f%% \n", percentageOddGenerated);
		
		System.out.println("Thanks for playing!!!");

		input.close();
	}

}
