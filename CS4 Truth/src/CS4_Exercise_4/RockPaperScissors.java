package CS4_Exercise_4;
import java.util.Scanner;
public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		Scanner scanner = new Scanner(System.in);

		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);

		//initalization of variables
		Move computerMove;
		Move playerMove;
		int roundsToWin = 2;
		boolean playingGame = true;

		//the application will loop until the player chooses to exit the application
		while(playingGame){
			//settings and starting menu
			System.out.printf("%n Welcome to Rock, Paper, Scissors. Please choose an option: %n 1. Start game %n 2. Change number of rounds %n 3. Exit application %n" );
			int startingChoice = scanner.nextInt();
			String choice = Integer.toString(startingChoice);
			
			if (choice.equals("1")){
				//rock paper scissors game 
				int playerScore = 0;
				int computerScore = 0;
				System.out.printf("This match will be first to %d wins", roundsToWin);
				
				// the do while is used so that the loop terminates when the player or the computer reaches the number of rounds to win
				do{
					//chooses the computer's move
					int random = (int) Math.floor(Math.random()*3) + 1;
					if (random == 1){
					computerMove = rock;
					} else if (random == 2){
					computerMove = paper;
					} else {
					computerMove = scissors;
					}

					//gets the player's input and assigns the corresponding move to playerMove
					System.out.printf("%n The computer has selected its move. Select your move:");
					System.out.printf("%n 1. Rock %n 2. Paper %n 3. Scissors %n");
					int move = scanner.nextInt();

					if (move == 1){
						playerMove = rock;
					} else if (move == 2){
						playerMove = paper;
					} else {
						playerMove = scissors;
					}
					
					//this variable is the result, 0 = computer wins, 1 = player wins, 2 = tie
					int result = Move.compareMoves(computerMove, playerMove);

					//displays the result and increments the score for both, no score is added for a tie
					if (result == 0){
						System.out.printf("Player chose %s. Computer chose %s. Computer wins the round! %n", playerMove.getName(), computerMove.getName());
						computerScore++;
						System.out.printf("Player: %s - Computer: %s %n", playerScore, computerScore);
					} else if (result == 1){ 
						System.out.printf("Player chose %s. Computer chose %s. Player wins the round! %n", playerMove.getName(), computerMove.getName());
						playerScore++;
						System.out.printf("Player: %s - Computer: %s %n", playerScore, computerScore);
					} else {
						System.out.printf("Player chose %s. Computer chose %s. The round is tied! %n", playerMove.getName(), computerMove.getName());
						System.out.printf("Player: %s - Computer: %s %n", playerScore, computerScore);
					}

					//checks if the player or computer have reached the no of rounds to win
					if (playerScore == roundsToWin) {
						System.out.printf(" %nPlayer wins!");
						break;
					}

					if (computerScore == roundsToWin) {
						System.out.printf("%nComputer wins!");
						break;
					}
				} while (computerScore <= roundsToWin || playerScore <= roundsToWin);
			} else if (choice.equals("2")){
				//sets the rounds to win to the user's input
				System.out.println("How many wins are needed to win a match?");
				roundsToWin = scanner.nextInt();
				
				System.out.println("New setting has been saved!");
			} else {
				//exits the application and terminates the loop
				System.out.println("Thank you for playing!");
				playingGame = false;
				break;
			}
		}
	} 
}