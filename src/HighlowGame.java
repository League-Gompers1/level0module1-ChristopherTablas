import java.util.Random;

import javax.swing.JOptionPane;

public class HighlowGame {

	public static void main(String[] args) {
		
		int number;
		Random ran = new Random();
		number = ran.nextInt(101);
	
		System.out.println(number);
		
		for (int i = 0; i < 100; i++) {
		
		String ans = JOptionPane.showInputDialog("Enter a number between 1-100");
		
		int guess = Integer.parseInt(ans);
		
		if (guess > number){
			
			JOptionPane.showMessageDialog(null,"its to high");
			
		}
		
		else if (guess < number){
			
			JOptionPane.showMessageDialog(null,"its to low");
			
		}

		else if (guess == number){
			
			JOptionPane.showMessageDialog(null, "You guessed right!");
			
			i = 100;
		}
		
		
		}
		
			
		}
		
		
	}
	

