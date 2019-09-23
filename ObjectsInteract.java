/***** File name: ObjectsInteract.java ******/
import java.util.Scanner;
class MyCar{
	public String make;
	public int model;
	public int mpg;
	public static int numberOfCars;
	//public MyCar(){};
	//public MyCar(int make,int model,int mpg){
		//this.make = make;
		//this.model = model;
		//this.mpg = mpg;
	//};
	public MyCar(){numberOfCars++;};
	public MyCar(String make,int model,int mpg){
		this();
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	};
	
	public MyCar compareMPG(MyCar obj){
		return (this.mpg > obj.mpg)?this:obj;
	};
	
	
	
};

 class Driver{

	
	
	public static void main(String[]args){
		MyCar firstCar = new MyCar();
		
		userInput(firstCar);
		MyCar secondCar = new MyCar();
		userInput(secondCar);
	
		
		//System.out.println("the best car is: "+ result(firstCar.compareMPG(secondCar))); 
		// I don't know why this is not correct but I think it's awesome if it works
		System.out.println("the best car is: ");
		result(firstCar.compareMPG(secondCar));
		
		
	};
		 public static void result(MyCar obj){
		 System.out.println("the make of the car is : "+obj.make+"\n the model is: "+obj.model+"\n and the mpg is:"+obj.mpg); 
	};
	public static void userInput( MyCar obj){
		String make;
		int model, mpg;
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter car information for car number "+ obj.numberOfCars+" :");
		System.out.println("enter the car make: ");
		make = input.nextLine();
		System.out.println("enter the car model: ");
		model = input.nextInt();
		System.out.println("enter the car miles per gallen: ");
		mpg= input.nextInt();
		obj.make = make;
		obj.model = model;
		obj.mpg = mpg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}