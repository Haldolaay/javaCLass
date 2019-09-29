class RatioInfo{
	private int GPA;
	private int IQ;
	private double percentage;
	private static double totalRatio;
	static private int numOfObjects;
	RatioInfo(int GPA, int IQ){	// constructor
		this.GPA = GPA;
		this.IQ = IQ;
		this.calcRatio();
	}
	
	void calcRatio(){// this method will count the precentage, also calls the calculate total method
		this.percentage = this.IQ/this.GPA;
		cacTotalRatio(this);
		}
	double getPercentage(){return this.percentage;}// returns percentage
	String getStatus(){// returns a string
			if (this.percentage > totalRatio){return "good";}
			else if (this.percentage == totalRatio){return "avarage";}
			else if (this.percentage < totalRatio){return "bad";}
		}
	
	static void calcTotalRatio( RatioInfo obj){
				numOfObjects++;
				totalRatio = (totalRatio+obj.getPercentage())/2;
		}	
}

 class Student{
	private String fname,lname;
	private RatioInfo ratio;
	private static int studentCount;
	
	Student(){ studentCount++;	} // first constructor
	Student(String fname, String lname){// second constructor
			this();
			this.fname = fname;
			this.lname = lname;
		}
	Student(String fname, String lname, int GPA, int IQ){
			this(fname,lname);
			
		}
	
	void             setRatio(int GPA, int IQ){	}		
	void              setName(String fname, String lname){			}
	String           getName(){ return this.fname +" "+this.lname;	}// returns full name
	RatioInfo    getRatio( ){	}
	
	static int        getStudentCount(){  }
}
