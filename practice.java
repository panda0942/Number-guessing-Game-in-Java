//Number guessing game using Java 
import javax.swing.JOptionPane;
import java.util.Random;
public class practice {
	public static void main(String[] args) {
	Random random = new Random();
	int randomNum = random.nextInt(10)+1;
	int counter = 1;
	int tries = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tries you want to take?"));
	for( int i = 0 ; i < tries ; i++) {
		int guessingNum = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to guess"));
		if(guessingNum != randomNum) {
			counter++;
			JOptionPane.showMessageDialog(null, "Number guessed is wrong at try " + (i+1) );
		}	
		else {
			JOptionPane.showMessageDialog(null, "You got the right guess after " + counter + " tries " + "and the right guess is " + guessingNum);
		}
	}
       if ( counter >= tries ) {
    	   JOptionPane.showMessageDialog(null, " GAME OVER ");	   
       }
	}
}
