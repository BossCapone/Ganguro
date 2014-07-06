package nquery;
/// To redo this correctly study IS message framework and apply to NQuery Class


public class NQuery {	// Define the NQuery object 
	private String Id;
	private boolean valid;
	private boolean used;
	public NPrompt prompt;
	private NHint nHint;
	private QType answer;
	public QType type; 
	
	public NQuery() {
		valid = false;
		used = false;
		answer = null;
		prompt = new NPrompt();
		nHint = new NHint();
		type = new QType();
	}
	public NQuery(NQuery n) {
		valid = n.valid;
		used = n.used;
		answer = n.answer;
		prompt = new NPrompt(n.prompt);
		nHint = new NHint(n.nHint);
		type = new QType(n.type);
	}
	public NQuery(QType q) {
		valid = false;
		used = false;
		answer = null;
		prompt = new NPrompt();
		nHint = new NHint();
		type = new QType(q);
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getPrompt() {
		return prompt.getPrompt();
	}
	public void setPrompt(String question) {
		prompt.setPrompt(question);
	}
	

	
	public boolean isValid() {
		return valid;
	}
	public void setValid() {
		valid = true;
	}
	
	public boolean isasked() {
		return used;
	}
	public void ask() { 
		type.query(type, valid, prompt, nHint);
		used = true;
	}		

	public EQtype getType() {
		return type.getType();
	}
	public void setType(QType q) {
		type = new QType(q);
	}

	public String getHint() {
		return nHint.getHint();
	}
	public void setHint(NHint h) {
		nHint = h;
	}
	
	
	
} // end NQuery

class NPrompt {
	String prompt;
	
	public NPrompt() {
		prompt="";
	}
	public NPrompt(NPrompt p) {
		prompt=p.getPrompt();
	}

	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String p) {
		prompt = p;
	}
}

class NHint {
	String hint;
	
	public NHint() {
		hint="";
	}
	public NHint(NHint p) {
		hint=p.getHint();
	}

	public String getHint() {
		return hint;
	}
	public void setHint(String p) {
		hint = p;
	}
}
