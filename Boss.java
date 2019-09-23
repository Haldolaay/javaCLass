 class Employee{
	public String fname;
	public String lname;
	public Employee boss;
	public address addr;

	
	Employee(String fname,String lname,Employee boss,String city, String state){
		this.fName = fname;
		this.lname = lname;
		this.boss= this.setBoss(boss);
		this.address = new Address(city,state);
	}

	public String getName(){
		return this.fname+" "+this.lname;
	}			//returns the concatenated string fname and lname
	public Address getAddress(){
		return this.address;
	}			//returns Address object
	public void setBoss(Employee object){
		this.boss.Employee(object.fname,object.lname,object.boss,object.addr);
		/*this.boss.fname = object.fname;
		this.boss.lname = object.lname;
		this.boss.boss = object.boss;
		this.boss.
		*/
	}	//assigns the boss of the current employee. The boss is really just another employee
	public Employee getBoss(){return this.boss;}//returns the boss object which is just a reference to another employee

	
	
	
}
class Address{
	        String city;
	    	String state;

	Address(String city,String state){
		this.city = city;
		this.state = state;
	}	//Constructor
	public String getAddress(){return this.city+" "+this.state;};  		//returns the concatenated string city and state

}


class Driver{
	public static void main(String[]args){
		
		Employee dave = new Employee("dave","bobo",null,"sacramento","california");
		System.out.println(dave.getAddress());
		
		
		
		
		
		
		
		
		
		
	}
}
