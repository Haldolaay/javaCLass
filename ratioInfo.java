class RatioInfo{
	private int GPA;
	private int IQ;
	private double percentage;
	private static double totalRatio;
	static private int numOfObjects;
	RatioInfo(int GPA, int IQ){	
		this.GPA = GPA;
		this.IQ = IQ;
		this.calcRatio();
	}
	
	void calcRatio(){// constructor, also calls the calculate total method
		this.percentage = this.IQ/this.GPA;
		cacTotalRatio(this);
		}
	double getPercentage(){return this.percentage;}// returns percentage
	String getStatus(){
			if (this.percentage > totalRatio){return "good";}
			else if (this.percentage == totalRatio){return "avarage";}
			else{return "bad";}
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
	
	Student(){	}
	Student(String fname, String lname){	}
	Student(String fname, String lname, int GPA, int IQ){	}
	
	void             setRatio(int GPA, int IQ){	}		
	void              setName(String fname, String lname){			}
	String           getName(){	}
	RatioInfo    getRatio( ){	}
	
	static int        getStudentCount(){  }
}
