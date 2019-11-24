class EmployeeException extends RuntimeException{
	//EmployeeException(){
		//System.out.println("hey hey hey");
	//}
	void jelo(){		System.out.println("hey hey hey");}
	public void k(){
		System.out.println( "exception");
		}
} 
	
class Employee { 
	int idNum;
	double hourlyWage;
	  Employee(int idNum, double hourlyWage){
		  this.idNum = idNum;
		  this.hourlyWage = hourlyWage;
		  if (this.hourlyWage< 6 || this.hourlyWage>50){
			  throw new EmployeeException();
		  }
	  }

  }

class Driver {
	//Declare array of employees
	
	public static void main(String[] args) {
		//call addEmp inside try/catch
		try{
			//addEmp(12,2);
			//addEmp(12,51);
			addEmp(12,8);
		}catch(EmployeeException e){
			e.k();
		}
	}
	static void addEmp(int idNum, double hourlyWage)throws EmployeeException {
		//validate and throw exception
		Employee first = new Employee(idNum,hourlyWage);
	}
}


