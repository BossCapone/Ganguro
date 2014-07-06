package nquery;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class ShortText extends QType
						implements ActionListener,
									PropertyChangeListener {
	// Short Text Question
	EQtype mType = EQtype.ShortText;

	public ShortText() {
		
	}
	public ShortText(QType q) {
		
	}
	public ShortText(ShortText s) {
		
	}

	public boolean query(QType type, boolean required, boolean valid, String prompt, String hint) {
		showInputDialog(null /*new JFrame() */,prompt);		
		return true;
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


/*

boolean validate;	// if set to true, will validate input before submission
//	checked during validation

//for text
boolean istext;
boolean isemail;	// Is it a email
boolean isurl;		// Is it a URL
boolean hascbounds;	// Validate Char count
boolean haswbounds;	// Validate word count
boolean haspattern;	// Check for Pattern
int cmin, cmax; // Character Count bounds
int wmin, wmax; // Word count bounds
String pattern;		// Pattern to match for

//for numbers
boolean isnumber;
boolean isinteger; 	// Requires whole number 
boolean isdecimal;	// Requires decimal	
double vmin, vmax;	// Min/Max Number bounds
boolean gt, gteq;	// Requires <, <= alt value
boolean lt, lteq;	// Requires >, => alt value
boolean eq, neq;	// Requires =, != alt value

*/

}
