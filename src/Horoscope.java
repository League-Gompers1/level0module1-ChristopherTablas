import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		
		String January = "Capricorn";
				
		String February = "Aquarius";
		
		String March = "Pisces";
		
		String April = "Aries";
		
		String May = "Taurus";
		
		String June = "Gemini";
		
		String July = "Cancer";
		 
		String August = "Leo" ;
		
		String September = "virgo";
		
		String October = "Libra";
		
		String November = "Scorpio";
		
		String December = "Sagittarius";
		
		
		String month = JOptionPane.showInputDialog("what month were you born");
		
		if (month.equals("January")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ January);			
		}

		if (month.equals("February")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ February);			
		}
		
		if (month.equals("March")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ March);			
		}

		if (month.equals("April")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ April);			
		}
		
		
		if (month.equals("May")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ May);			
		}
		
		if (month.equals("June")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ June);			
		}
		
		if (month.equals("July")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ July);			
		}
		
		if (month.equals("August")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ August);			
		}
		
		if (month.equals("September")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ September);			
		}
		
		if (month.equals("October")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ October);			
		}
		
		if (month.equals("November")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ November);			
		}
		
		if (month.equals("December")) {	
			JOptionPane.showMessageDialog(null, "You Horoscope is "+ December);			
		}
	}
	
	
}
