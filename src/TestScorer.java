import javax.swing.JOptionPane;

public class TestScorer {
	
	public static void main(String[] args) {
		
		String score = JOptionPane.showInputDialog("Enter a number between 1-100");
		
		int grade = Integer.parseInt(score);

		
		if(grade == 97  )  {
			
			JOptionPane.showMessageDialog(null, "you got an A!");
			
		}
		
		
		
		
	}
}
