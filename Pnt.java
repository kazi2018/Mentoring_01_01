package encapsul;

public class Pnt {

	
	private String sName;
	private int iID;
	private double dGrade;
	private boolean bBdcitizen;
	private char cSex;
	
	public Pnt() { //this is default constructor or no argument constructor 
		
		
		
		
		
	}

	
	public Pnt(String sName, int iID, double dGrade, boolean bBdcitizen, char cSex) {
		super();
		this.sName = sName;
		this.iID = iID;
		this.dGrade = dGrade;
		this.bBdcitizen = bBdcitizen;
		this.cSex = cSex;
	}


	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getiID() {
		return iID;
	}

	public void setiID(int iID) {
		this.iID = iID;
	}

	public double getdGrade() {
		return dGrade;
	}

	public void setdGrade(double dGrade) {
		this.dGrade = dGrade;
	}

	public boolean isbBdcitizen() {
		return bBdcitizen;
	}

	public void setbBdcitizen(boolean bBdcitizen) {
		this.bBdcitizen = bBdcitizen;
	}

	public char getcSex() {
		return cSex;
	}


	public void setcSex(char c) {
		// TODO Auto-generated method stub
		
	}

	
	
	
		
}
