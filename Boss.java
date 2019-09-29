 class Employee{
	private String fname;
	private String lname;
	private Employee boss;
	private Address addr;

	
	 Employee(String fname,String lname,Employee b,String city, String state){
		this.fname = fname;
		this.lname = lname;
		//this.setBoss(boss);
		if (b != null){this.setBoss(b);}
		this.addr = new Address(city,state);
	}

	public String getName(){
		if (this.fname != "null"){
		return this.fname+" "+this.lname;
		}else{return "null";}
		
	}			//returns the concatenated string fname and lname
	public String  getAddress(){
		return this.addr.getAddress();
	}			//returns Address object\
				//return this.addr.getAddress();
	public void setBoss(Employee object){
		if (object.fname != null){
		//this.boss = new Employee(object.fname,null,null,null,null);
				this.boss = object;
		//this.boss = new Employee().fname = object.fname;
		/*this.boss.fname = object.fname;
		this.boss.lname = object.lname;
		this.boss.boss = object.boss;
		this.boss.addr = object.addr;
		*/
		//this.boss= new Employee(object.fname,object.lname,object.boss,object.addr);
		};
	}	//assigns the boss of the current employee. The boss is really JUST ANOTHER EMPLOYEE!!!!!!
	public Employee getBoss(){
		if (this.boss == null){
			return new Employee("null","null",null,"null","null");
			// returning just null won't let me run the program, i keep getting an error saying 
			// nullpointerexception so I used a new object with a null for a name;
		}else {
		return this.boss;
		}
		
		/*
		if (this.boss != null)
			return this.boss;
		else {return null;}
		*/
		//returns the boss object which is just a reference to another employee
	   
	
	
	
    }
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
		System.out.println(dave.getName()+" lives in "+dave.getAddress()+" and boss is "+dave.getBoss().getName());
		System.out.println(kevin.getName()+" lives in "+kevin.getAddress()+" and boss is " +kevin.getBoss().getName());
	
		
		
		
		
		
		
		
		
		
		
	}
}
