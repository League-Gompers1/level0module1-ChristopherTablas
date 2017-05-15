package for_loops;

import javax.swing.JOptionPane;

public class Votingmachine {

	public static void main(String[] args) {
		
		String people = JOptionPane.showInputDialog("how many people are voting");
		int total = Integer.parseInt(people);
		System.out.println(total);
		int bill = 0;
		int rock = 0;
		
		for (int i = total; i > 0; i--) {
			
			String person = JOptionPane.showInputDialog("Who are you voting for, Rock or Bill?");
			
		
		if (person.equals("Bill")) {
			bill++;
			
		}
		else if(person.equals("Rock")) {
			
			rock++;
		}
		
					
		}
		
		if(rock > bill){
			JOptionPane.showMessageDialog(null, "the winner is the Rock!");}
			else if(bill> rock) {
				JOptionPane.showMessageDialog(null, "the winner is bill");
				
			} 
			else if(bill == rock){
				JOptionPane.showMessageDialog(null, "its a tie");
			}
		}
		
				
	}

	
