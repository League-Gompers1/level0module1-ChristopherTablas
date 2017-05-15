import javax.swing.JOptionPane;

public class song {

	public static void main(String[] args) {
		int number = 100;
		for (int i = number; i > 0; i--) {
			
		JOptionPane.showMessageDialog(null, number + " bottles of milk on the wall");
		JOptionPane.showMessageDialog(null, number + " bottles of milk");
		JOptionPane.showMessageDialog(null, " Take one down pass it around");
		number--;
		JOptionPane.showMessageDialog(null, number + " bottles of milk on the wall");
		if(number == 0){	
			JOptionPane.showMessageDialog(null, "no more bottles of milk on the wall BOO HOO!");
		}
		}
		
	}
}
