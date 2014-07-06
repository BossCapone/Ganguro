package personality;

public enum PersonalityType {
	// The Enumerated PersonalityType class is a simplified version of the personality class.
	// Its functions are:
	// *getting the Personality type,
	// *getting the type category,
	// *getting the type as a boolean array
	
	ESTJ (true, true, true, true),
	ESFJ (true, true, false, true),
	ESTP (true, true, true, false),
	ESFP (true, true, false, false),
	ENTJ (true, false, true, true ),
	ENTP (true, false, true, false),
	ENFJ (true, false, false, true),
	ENFP (true, false, false, false),
	ISTJ (false, true, true, true),
	ISFJ (false, true, false, true),
	ISTP (false, true, false, false),
	ISFP (false, true, false, false),
	INTJ (false, false, true, true),
	INTP (false, false, true, false),
	INFJ (false, false, false, true),
	INFP (false, false, false, false),
	;	
private boolean W,I,D,S;
	
PersonalityType(boolean w, boolean i, boolean d, boolean s) {
	this.W = w;
	this.I = i;
	this.D = d;
	this.S = s;
}

public String getCategory() {
	if(I && S) //Protectors
		return "Protectors";
	
	if(I && !S)//Creators
		return "Creators";
	
	if(!I && D) // Intellectuals
		return "Intellectual";
	
	if(!I && !D)//Visionary
		return "Visionary";
	else
		return null;
}

public String toString() {
	String w,i,d,s;
	if(W)
		w="E";
	else
		w="I";
	if(I)
		i="S";
	else
		i="N";
	if(D)
		d="T";
	else 
		d="F";
	if(S)
		s="J";
	else
		s="P";	
	return w+i+d+s;
}

public boolean[] toWIDS() {
	boolean[] wids = {W,I,D,S};
	return wids;
		
}

}
