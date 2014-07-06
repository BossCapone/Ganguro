package nquery;

import javax.swing.JOptionPane;

public class NQuery_Test {

	public static void main(String[] args) {
		NQuery question = new NQuery();
		question.setId("NQ/TestQuery:x000F:15.1.25.6:NAVI@NAVMail");
		question.setPrompt("What is 2+2?");
		//question.setAnswer("nothing.");
		
		question.type = new ShortText();
		question.ask();
		
		analyze(question);
	}

	public static void analyze(NQuery question) {
		String data =
				"NQuery data: "
				+"\n Id: \t"		+ question.getId()
				+"\n question: \t"	+ question.getPrompt()
				+"\n hint: \t\t"	+ question.getHint()
				+"\n asked: \t\t"	+ question.isasked() 
				+"\n answer: \t"	+ question.type.getAnswer()	
				+"\n type: \t"		+ question.getType();
		
		NQuery answer = new NQuery();
		answer.setPrompt(data);
		answer.ask();
		//JOptionPane.showMessageDialog(null, data, null, 0 );
	}
}
