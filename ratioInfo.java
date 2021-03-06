class RatioInfo{
	private int GPA;
	private int IQ;
	private double percentage;
	private static double totalRatio;
	private static int numOfObjects;
	private static double numOfPercantage;
	RatioInfo(int GPA, int IQ){	// constructor
		this.GPA = GPA;
		this.IQ = IQ;
		this.calcRatio();
	}
	
	void calcRatio(){// this method will count the precentage, also calls the calculate total method
		this.percentage = (double)this.IQ/(double)this.GPA;
		calcTotalRatio(this);
		}
	double getPercentage(){return this.percentage;}// returns percentage
	String getStatus(){// returns a string
			if (this.percentage > totalRatio){return "good";}
			else if (this.percentage == totalRatio){return "avarage";}
			else if (this.percentage < totalRatio){return "bad";}
			return "error";
		}
	
	static void calcTotalRatio( RatioInfo obj){
				numOfObjects++;
				numOfPercantage= (numOfPercantage+(double)obj.percentage);
				totalRatio = numOfPercantage/numOfObjects;
				//if (numOfObjects ==3){totalRatio/= numOfObjects;}
				//totalRatio = (totalRatio+obj.getPercentage());
				//totalRatio = totalRatio/numOfObjects;
		}	
		String printRatio(){return this.GPA + " "+ this.IQ +"\npercentage is :" + this.percentage;}
		double ratioprint(){return totalRatio;}//for testing
		int numprint(){return numOfObjects;}   //for testing
}

 class Student{
	private String fname,lname;
	private RatioInfo ratio;
	private static int studentCount;
	
	Student(){ studentCount++;	} // first constructor
	Student(String fname, String lname){// second constructor
			this();
			this.setName(fname,lname);
		}
	Student(String fname, String lname, int GPA, int IQ){// third constructor 
			this(fname,lname);
			setRatio(GPA,IQ);
		}
	
	void   setRatio(int GPA, int IQ){// creates an object type ratio and sets the gpa and iq
		   this.ratio = new RatioInfo(GPA,IQ);
		}		
	void   setName(String fname, String lname){	// sets the first name and last name
			this.fname = fname;
			this.lname = lname;
	}
	String       getName(){ return this.fname +" "+this.lname;	}// returns full name
	RatioInfo    getRatio( ){return this.ratio;	}// returns the ratio status of a specific student
	
	static int   getStudentCount(){ return studentCount; }
}
class driver {
	
	public static void main(String[]args){
		Student hamza = new Student();
		hamza.setName("hamzah","notNull");
		hamza.setRatio(40,100);
		
		Student jay = new Student("jay"," keller");
		jay.setRatio(40,200);
		
		Student kevin = new Student("kevin", "jackson", 40, 300);
		
		System.out.println(hamza.getName());
		System.out.println(hamza.getRatio().getStatus());
		System.out.println(hamza.getRatio().printRatio());
		
		System.out.println(jay.getName());
		System.out.println(jay.getRatio().printRatio());
		System.out.println(jay.getRatio().getStatus());
		
		System.out.println(kevin.getName());
		System.out.println(kevin.getRatio().printRatio());
		System.out.println(kevin.getRatio().getStatus());
		System.out.println(kevin.getRatio().getPercentage());
		System.out.println(hamza.getRatio().getPercentage());
		System.out.println("\ntotalratio: "+ hamza.getRatio().ratioprint());
		System.out.println("\nnumberof students: "+ hamza.getRatio().numprint());
		//if (hamza.getRatio().getPercentage() == kevin.getRatio().ratioprint()){System.out.print("they are equal");}
	}
	 
}