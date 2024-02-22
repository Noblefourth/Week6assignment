package Week6;

public class App {
	
	public static void main(String[] args) {
		
		Player player1 = new Player("Ash", 0);
		Player player2 = new Player("Gary", 0);
		System.out.println("Greetings " + player1.playerName + " and " + player2.playerName + " to the game.");
		
		Deck deckOne = new Deck();
		System.out.println("The deck contains " + deckOne.cards.size() + " cards.");
		
		deckOne.shuffle();
		
		for (int i = 1; i<= 52; i++) {
			if (i % 2 != 0) {
				Card player1Draw = deckOne.draw();
				player1.hand.add(player1Draw);
			} else {
				Card player2Draw = deckOne.draw();
				player2.hand.add(player2Draw);
			}
		}
		
		System.out.println(player1.playerName + " has a hand of " + player2.hand.size() + " cards.");
		System.out.println(player2.playerName + " has a hand of " + player1.hand.size() + " cards.");
		
		for (int j = 0; j < 26; j++) {
			Card player1FlippedCard = player1.flip();
			System.out.println(player1.playerName + " flips a(n) ");
			player1FlippedCard.describe();
			
			
			Card player2FlippedCard = player2.flip();
			System.out.println(player2.playerName + " flips a(n) ");
			player2FlippedCard.describe();
			
			if (player1FlippedCard.getValue() > player2FlippedCard.getValue() ) {
				player1.incrementScore();
				System.out.println(player1.playerName + " won round " + (j +1) + " " + player1.playerName + "'s score is: " 
						+ player1.score + "\n");
			} else if (player2FlippedCard.getValue() > player1FlippedCard.getValue() ) {
				player2.incrementScore();
				System.out.println(player2.playerName + " won round " + (j +1) + " " + player2.playerName + "'s score is: " 
						+ player2.score + "\n");
			} else {
				System.out.println("Draw! No points given.\n");
				
			}
			
			
		}
		if (player1.score > player2.score) {
			System.out.println(player1.playerName + " wins with: " + player1.score);
		} else if (player2.score > player1.score) {
			System.out.println(player2.playerName + " wins with: " + player2.score);
		} else {
			System.out.println(" Draw!");
		}
		
		
		
		
	}

}
