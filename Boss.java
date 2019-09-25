 class Employee{
	private String fname;
	private String lname;
	private Employee boss;
	private Address addr;

	
	public Employee(String fname,String lname,Employee boss,String city, String state){
		this.fname = fname;
		this.lname = lname;
		this.setBoss(boss);
		//boss != null?this.setBoss(boss):;
		this.addr = new Address(city,state);
	}

	public String getName(){
		return this.fname+" "+this.lname;
	}			//returns the concatenated string fname and lname
	public Address getAddress(){
		return this.addr;
	}			//returns Address object
	public void setBoss(Employee object){
		if (object.boss != null){
		//this.boss = new Employee(null,null,object.boss,null,null);
		//this.boss = new Employee().fname = object.fname;
		/*this.boss.fname = object.fname;
		this.boss.lname = object.lname;
		this.boss.boss = object.boss;
		this.boss.addr = object.addr;
		*/
		this.boss= new Employee(object.fname,object.lname,object.boss,object.city,object.state);
		};
	}	//assigns the boss of the current employee. The boss is really JUST ANOTHER EMPLOYEE!!!!!!
	public Employee getBoss(){return this.boss;}//returns the boss object which is just a reference to another employee

	
	
	
}
class Address{
	     private String city;
	     private String state;

	Address(String city,String state){
		this.city = city;
		this.state = state;
	}	//Constructor
	public String getAddress(){return this.city+" "+this.state;};  		//returns the concatenated string city and state

}


class Driver{
	public static void main(String[]args){
		
		Employee dave = new Employee("dave","bobo",null,"sacramento","california");
		Employee kevin = new Employee("kevin","dodo",dave,"london","england");
		System.out.println(dave.getAddress());
		
		
		
		
		
		
		
		
		
		
	}
}
