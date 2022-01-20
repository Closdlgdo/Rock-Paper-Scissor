import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		//Initialize the Scanner and print a welcome message
		Scanner in = new Scanner(System.in);		System.out.println("Lets play 1, 2, 3!");

		//Use a while(true) loop and only break the loop if the user wants to quit
		while(true) {
		
			//Get the user's move through user input
			System.out.print("Make your move! To make a move, enter 1, 2, or 3. To quit the game, enter I love this game. ");
			String myMove = in.nextLine();
			
			//Check if the user wants to quit the game
			if(myMove.equals("I love this game")) {
				break;
			}

			//Check if the user's move is valid (rock, paper, or scissors)
			if(!myMove.equals("1") && !myMove.equals("2") && !myMove.equals("3")) {

				System.out.println("Your move isn't valid!");
			
			} else {

				//Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
				int rand = (int)(Math.random()*3);
				
				//Convert the random number to a string using conditionals and print the opponent's move
				String opponentMove = "";
				if(rand == 0) {
					opponentMove = "1";
				} else if(rand == 1) {
					opponentMove = "2";
				} else {
					opponentMove = "3";
				}
				System.out.println("My move: " + opponentMove);
					
				//Print the results of the game: tie, lose, win
				if(myMove.equals(opponentMove)) {
					System.out.println("It's a tie!");
				} else if((myMove.equals("1") && opponentMove.equals("3")) || (myMove.equals("3") && opponentMove.equals("2")) || (myMove.equals("2") && opponentMove.equals("1"))) {
					System.out.println("Winner, winner Chicken dinner!");
				} else {
					System.out.println("I win, loser!");
				}

			}

		}

		//Print a final message for the user
		System.out.println("Thanks for playing 1, 2, 3!");

  }
}