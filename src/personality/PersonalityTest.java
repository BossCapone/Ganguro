package personality;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class PersonalityTest extends javax.swing.JFrame implements ItemListener, ActionListener {
	private JLabel jLabel1;
	private JTextField jTextField1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JTextField jTextField10;
	private JTextField jTextField9;
	private JTextField jTextField8;
	private JTextField jTextField7;
	private JLabel jLabel12;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JLabel jLabel9;
	private JLabel jLabel8;
	private JTextField jTextField6;
	private JButton jButton1;
	private JComboBox jComboBox1;
	private JLabel jLabel13;
	private JTextField jTextField25;
	private JTextField jTextField24;
	private JTextField jTextField23;
	private JTextField jTextField19;
	private JTextField jTextField5;
	private JTextField jTextField4;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private Personality persona;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PersonalityTest inst = new PersonalityTest();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public PersonalityTest() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("Personality");
				jLabel1.setBounds(12, 12, 72, 21);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(96, 9, 85, 28);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Category");
				jLabel2.setBounds(12, 45, 60, 21);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(96, 49, 110, 28);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Dominant Preferences");
				jLabel3.setBounds(12, 86, 146, 21);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("World");
				jLabel4.setBounds(12, 113, 41, 21);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setText("E");
				jTextField3.setBounds(131, 110, 27, 28);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Information");
				jLabel5.setBounds(12, 146, 78, 21);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Decisions");
				jLabel6.setBounds(12, 179, 63, 21);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Structure");
				jLabel7.setBounds(12, 212, 59, 21);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setText("E");
				jTextField4.setBounds(131, 143, 27, 28);
			}
			{
				jTextField5 = new JTextField();
				getContentPane().add(jTextField5);
				jTextField5.setText("E");
				jTextField5.setBounds(131, 176, 27, 28);
			}
			{
				jTextField6 = new JTextField();
				getContentPane().add(jTextField6);
				jTextField6.setText("E");
				jTextField6.setBounds(131, 209, 27, 28);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("Preference Values");
				jLabel8.setBounds(206, 86, 117, 21);
			}
			{
				jLabel9 = new JLabel();
				getContentPane().add(jLabel9);
				jLabel9.setText("E - I");
				jLabel9.setBounds(250, 113, 33, 21);
			}
			{
				jLabel10 = new JLabel();
				getContentPane().add(jLabel10);
				jLabel10.setText("S - N");
				jLabel10.setBounds(250, 146, 34, 21);
			}
			{
				jLabel11 = new JLabel();
				getContentPane().add(jLabel11);
				jLabel11.setText("T - F");
				jLabel11.setBounds(250, 179, 30, 21);
			}
			{
				jLabel12 = new JLabel();
				getContentPane().add(jLabel12);
				jLabel12.setText("J - P");
				jLabel12.setBounds(250, 212, 28, 21);
			}
			{
				jTextField7 = new JTextField();
				getContentPane().add(jTextField7);
				jTextField7.setText("-1");
				jTextField7.setBounds(211, 110, 33, 28);
			}
			{
				jTextField8 = new JTextField();
				getContentPane().add(jTextField8);
				jTextField8.setText("-1");
				jTextField8.setBounds(295, 110, 34, 28);
			}
			{
				jTextField9 = new JTextField();
				getContentPane().add(jTextField9);
				jTextField9.setText("-1");
				jTextField9.setBounds(211, 143, 33, 28);
			}
			{
				jTextField10 = new JTextField();
				getContentPane().add(jTextField10);
				jTextField10.setText("-1");
				jTextField10.setBounds(296, 143, 33, 28);
			}
			{
				jTextField19 = new JTextField();
				getContentPane().add(jTextField19);
				jTextField19.setText("-1");
				jTextField19.setBounds(212, 176, 32, 28);
			}
			{
				jTextField23 = new JTextField();
				getContentPane().add(jTextField23);
				jTextField23.setText("-1");
				jTextField23.setBounds(296, 209, 33, 28);
			}
			{
				jTextField24 = new JTextField();
				getContentPane().add(jTextField24);
				jTextField24.setText("-1");
				jTextField24.setBounds(212, 209, 32, 28);
			}
			{
				jTextField25 = new JTextField();
				getContentPane().add(jTextField25);
				jTextField25.setText("-1");
				jTextField25.setBounds(298, 176, 31, 28);
			}
			{
				jLabel13 = new JLabel();
				getContentPane().add(jLabel13);
				jLabel13.setText("Set Type");
				jLabel13.setBounds(255, 12, 79, 21);
			}
			{
				ComboBoxModel jComboBox1Model = 
						new DefaultComboBoxModel(
								new String[] { "none", "ESTJ", "ESFJ", "ESTP", "ESFP", "ENTJ", "ENTP", "ENFJ", "ENFP",
														"ISTJ", "ISFJ", "ISTP", "ISFP", "INTJ", "INTP", "INFJ", "INFP"});
				jComboBox1 = new JComboBox();
				getContentPane().add(jComboBox1);
				jComboBox1.setModel(jComboBox1Model);
				jComboBox1.setBounds(346, 8, 101, 28);
				jComboBox1.addItemListener(this);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Set Values");
				jButton1.setBounds(212, 249, 117, 28);
				jButton1.addActionListener(this);
			}
			persona = new Personality();
			updateGUI();
			
			pack();
			this.setSize(533, 343);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	private void updateGUI() {
		jTextField1.setText( persona.get() );
		jTextField2.setText( persona.getCategory() );
		
		jTextField3.setText( persona.getW() );
		jTextField4.setText( persona.getI() );
		jTextField5.setText( persona.getD() );
		jTextField6.setText( persona.getS() );
		
		jTextField7.setText( ""+persona.getPrefE() );
		jTextField8.setText( ""+persona.getPrefI() );
		jTextField9.setText( ""+persona.getPrefS() );
		jTextField10.setText( ""+persona.getPrefN() );
		jTextField19.setText( ""+persona.getPrefT() );
		jTextField25.setText( ""+persona.getPrefF() );
		jTextField24.setText( ""+persona.getPrefJ() );
		jTextField23.setText( ""+persona.getPrefP() );
		
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getSource() == jComboBox1) {
			switch(jComboBox1.getSelectedIndex())
			{
				case 1:
					persona = new Personality(PersonalityType.ESTJ);
					break;
				case 2:
					persona = new Personality(PersonalityType.ESFJ);
					break;
				case 3:
					persona = new Personality(PersonalityType.ESTP);
					break;
				case 4:
					persona = new Personality(PersonalityType.ESFP);
					break;
				case 5:
					persona = new Personality(PersonalityType.ENTJ);
					break;
				case 6:
					persona = new Personality(PersonalityType.ENTP);
					break;
				case 7:
					persona = new Personality(PersonalityType.ENFJ);
					break;
				case 8:
					persona = new Personality(PersonalityType.ENFP);
					break;
				case 9:
					persona = new Personality(PersonalityType.ISTJ);
					break;
				case 10:
					persona = new Personality(PersonalityType.ISFJ);
					break;
				case 11:
					persona = new Personality(PersonalityType.ISTP);
					break;
				case 12:
					persona = new Personality(PersonalityType.ISFP);
					break;
				case 13:
					persona = new Personality(PersonalityType.INTJ);
					break;
				case 14:
					persona = new Personality(PersonalityType.INTP);
					break;
				case 15:
					persona = new Personality(PersonalityType.INFJ);
					break;
				case 16:
					persona = new Personality(PersonalityType.INFP);
					break;
			}
			updateGUI();
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jButton1)
		{
			float e = Float.parseFloat( jTextField7.getText() );
			float i = Float.parseFloat( jTextField8.getText() );
			float s = Float.parseFloat( jTextField9.getText() );
			float n = Float.parseFloat( jTextField10.getText() );
			float t = Float.parseFloat( jTextField19.getText() );
			float f = Float.parseFloat( jTextField25.getText() );
			float j = Float.parseFloat( jTextField24.getText() );
			float p = Float.parseFloat( jTextField23.getText() );
			persona.setE(e);
			persona.setI(i);
			persona.setS(s);
			persona.setN(n);
			persona.setT(t);
			persona.setF(f);
			persona.setJ(j);
			persona.setP(p);
		}
		updateGUI();
	}
}
