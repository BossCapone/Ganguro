package personality;


public class Personality  {
	private PersonalityType pType;
	private float E,I;
	private float S,N;
	private float T,F;
	private float J,P;
		
// Default constructor sets to INFP
public Personality() { 
	pType =  PersonalityType.INFP;
	E=I=S=N=T=F=J=P=0f;
}

// Create new personality from preset with default preferences
public Personality(PersonalityType pl) {
	pType = pl;
	setWIDS(pType.toWIDS() );
}

public Personality(Personality ps){	
	E = ps.E;	I = ps.I;
	S = ps.S;	N = ps.N;
	T = ps.T;	F = ps.F;
	J = ps.J;	P = ps.P;
}

// get the personality type
public String get() {
	return getWIDS();
}

// get the dominant preferences
public String getW() {
	if(E>I)
		return "E";
	else
		return "I";
}
public String getI() {
	if(S>N)
		return "S";
	else
		return "N";
}
public String getD() {
	if(T>F)
		return "T";
	else 
		return "F";
}
public String getS() {
	if(J>P)
		return "J";
	else 
		return "P";
}
public String getWIDS() {
	return getW()+getI()+getD()+getS();
}

// get the preference values
public float getPrefE() {
	return E;
}
public float getPrefI() {
	return I;
}
public float getPrefS() {
	return S;
}
public float getPrefN() {
	return N;
}
public float getPrefT() {
	return T;
}
public float getPrefF() {
	return F;
}
public float getPrefJ() {
	return J;
}
public float getPrefP() {
	return P;
}
public String getPrefWIDS() {
	float w,i,d,s;
	if(getW() == "E")
		w= getPrefE();
	else w=getPrefI();
	
	if(getI() == "S")
		i= getPrefS();
	else i=getPrefN();
	
	if(getD() == "T")
		d= getPrefT();
	else d=getPrefF();
	
	if(getS() == "J")
		s= getPrefJ();
	else s=getPrefP();
		
	return ""+w+i+d+s;
}

// set the preference values
public void setE(float e) {
	if(e>=-1 && e<=1)
		E = e;
}
public void setI(float i) {
	if(i>=-1 && i<=1)
	I = i;
}
public void setS(float s) {
	if(s>=-1 && s<=1)
	S = s;
}
public void setN(float n) {
	if(n>=-1 && n<=1)
	N = n;
}
public void setT(float t) {
	if(t>=-1 && t<=1)
	T = t;
}
public void setF(float f) {
	if(f>=-1 && f<=1)
	F = f;
}
public void setJ(float j) {
	if(j>=-1 && j<=1)
	J = j;
}
public void setP(float p) {
	if(p>=-1 && p<=1)
	P = p;
}
public void setWIDS(boolean[] wids) {
	if(wids[0]) {	setE(1); setI(0);}
	else {	setE(0); setI(1);}
		
	if(wids[1]) {	setS(1); setN(0);}
	else {	setS(0); setN(1);}
	
	if(wids[2]) {	setT(1); setF(0); }
	else {setT(0); setF(1); }
	
	if(wids[3]) {	setJ(1); setP(0); }
	else {setJ(0); setP(1); }
}

// increment a prefrence by 1%
public void incE() {
	setE(E+0.01f);
}
public void incI() {
	setI(I+0.01f);
}
public void incS() {
	setS(S+0.01f);
}
public void incN() {
	setN(N+0.01f);
}
public void incT() {
	setT(T+0.01f);
}
public void incF() {
	setF(F+0.01f);
}
public void incJ() {
	setJ(J+0.01f);
}
public void incP() {
	setP(P+0.01f);
}

// decrement a prefrence by 1%
public void decE() {
	setE(E-0.01f);
}
public void decI() {
	setI(I-0.01f);
}
public void decS() {
	setS(S-0.01f);
}
public void decN() {
	setN(N-0.01f);
}
public void decT() {
	setT(T-0.01f);
}
public void decF() {
	setF(F-0.01f);
}
public void decJ() {
	setJ(J-0.01f);
}
public void decP() {
	setP(P-0.01f);
}

//Get the personality tempermanent
public String getCategory() {
	if(getI()=="S" && getS()=="J") //Protectors
		return "SJ";
	
	if(getI()=="S" && getS()=="P")//Creators
		return "SP";
	
	if(getI()=="N" && getD()=="T") // Intellectuals
		return "NT";
	
	if(getI()=="N" && getD()=="F")//Visionary
		return "NF";
	else
		return null;
}

public String toString() {
	return pType.toString()+getWIDS();
}

}