package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	
	
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String question;

		question=JOptionPane.showInputDialog("do you know how to write code?");
		if(question.equalsIgnoreCase("yes")) {
			JOptionPane.showInputDialog(null,"You will rule the world.");
		
		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	} else{
		JOptionPane.showInputDialog("good luck washing dishes.");
	}
	}
}


