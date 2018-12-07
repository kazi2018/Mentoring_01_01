package encapsul;

public class TestPnt {

	public static void main(String[] args) {
		
		Pnt sohag = new Pnt();
		
		sohag.setsName("DU");
		sohag.setiID(001);
		sohag.setcSex('M');
		sohag.setbBdcitizen(true);
		sohag.setdGrade(4.999);
		
		System.out.println("This is Mr Sohag information: " +sohag.getsName()+ " "+sohag.getiID()+" "+sohag.getcSex()+" "+sohag.getdGrade()+" "+sohag.isbBdcitizen());	

		
		Pnt safwan = new Pnt("Safwan", 202, 3.555, false, 'M');
		
		System.out.println("This is Mr Safwan information: " +safwan.getsName()+" "+safwan.getiID()+" "+safwan.getcSex()+" "+safwan.isbBdcitizen()+" "+safwan.getdGrade());
		
		
		Pnt tofayel = new Pnt("Tofaye", 303, 4.555, true, 'M');
		
		System.out.println("THis is Mr Tofayel info:" +tofayel.getsName()+" "+tofayel.getiID()+" "+tofayel.getcSex()+" "+tofayel.isbBdcitizen()+" "+tofayel.getdGrade());
		
		Pnt robin = new Pnt("Robin", 505, 4.00, true, 'M');
		
		System.out.println("This is Mr Robin info:" +robin.getsName()+" "+robin.getiID()+" "+robin.getcSex()+" "+robin.isbBdcitizen()+" "+robin.getdGrade());

	}

}