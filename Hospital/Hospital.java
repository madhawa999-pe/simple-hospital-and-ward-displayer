class Hospital{

	public String Hosname;
    Ward w1;
	Ward w2;
	Ward w3;
public Hospital(String Hosname, int w1No, String w1Name, int w2No, String w2Name, int w3No, String w3Name){
	this.Hosname = Hosname;
	this.w1 = new Ward(w1No,w1Name);
	this.w2 =  new Ward(w2No,w2Name);
	this.w3 =  new Ward(w3No,w3Name);

 }
public void Display(){
	System.out.println("Hospital Name is " +Hosname);
	System.out.println("Wards ");
	w1.Display();
	w2.Display();
	w3.Display();
	System.out.println("-----------------------------");	
 }
}
