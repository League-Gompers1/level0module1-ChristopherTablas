package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
		
		String June = "Hacking";
		
		String Daniel = "Hacking";
		
		String Ebuka = "Endurance";
				
		String Christopher = "Reading";
		
		String Jesus = "Speed";
	
		String Jason = "Smarts";
	
		String Alfredo = "Gaming";
		
		String Joshua = "Inspiration";
		
		
		
		
        // 2. Ask the user to enter a name. Store their answer in a variable.
		
		
		
		String name = JOptionPane.showInputDialog("Enter a name");
		
		
		        // 3. Show the superpower in a pop-up, depending on the name entered. 
		
		if (name.equals("June")) {	
			JOptionPane.showMessageDialog(null, "June's Superpower Is "+ June);			
		}
			
		if (name.equals("Daniel")) {			
			JOptionPane.showMessageDialog(null, "Daniel's Superpower Is "+ Daniel);			
		}
		
		if (name.equals("Ebuka")) {			
			JOptionPane.showMessageDialog(null, "Ebuka's Superpower Is "+ Ebuka);		
		}
		
		if (name.equals("Christopher")) {		
			JOptionPane.showMessageDialog(null, "Christopher's Superpower Is "+ Christopher);			
		}
		
		if (name.equals("Jesus")) {			
			JOptionPane.showMessageDialog(null, "Jesus's Superpower Is "+ Jesus);			
		}
		
		if (name.equals("Jason")) {			
			JOptionPane.showMessageDialog(null, "Jason's Superpower Is "+ Jason);			
		}
		
		if (name.equals("Alfredo")) {			
			JOptionPane.showMessageDialog(null, "Alfredo's Superpower Is "+ Alfredo);			
		}
		
		if (name.equals("Joshua")) {
			JOptionPane.showMessageDialog(null, "Joshua's Superpower Is "+ Joshua);
		}
		
		
		
		
		
    }
}