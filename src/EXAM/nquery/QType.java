package nquery;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class QType extends JOptionPane { 
// Basic Question Type Shows a null dialog without input options; 
	boolean answer;
	EQtype mType;
	
// Getters / Setters
	public QType() {
		answer = false;
		mType = EQtype.NULL;
	}
	public QType(QType q) {
		answer = q.answer;
		mType = q.mType;
		
	}
	public EQtype getType() {
		return mType;
	}
	public boolean getAnswer() {
		return answer;
	}
	public void setAnswer(boolean answer) {
		this.answer = answer;
	}

	public boolean query(QType type, boolean required, NPrompt prompt, NHint hint) {
		showMessageDialog(new JFrame(),prompt.getPrompt()+ "\n Hint: "+ hint.getHint());		
		return answer = true; // if ok is pressed
	}
	
	
	
}