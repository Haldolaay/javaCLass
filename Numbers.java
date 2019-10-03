import java.lang.Scanner;
//Note all methods are static. You can pass arrays back from a method such ascending
//int a[]=getData();  
//You can add more methods if you wish
public class Numbers {
	
	public static void main(String[] args){
		//Declare your arrays (two int arrays and one Integer array)
		int[] a,b;
		Integer []array = new Integer[2];
		//call function getData and put them in one the array
		//Use System.arraycopy to make a copy to another int array
		//feed the array and get back and array of wrapper class Integer
		//display sorted order
	}
	
	//Takes user input until input is -1, no duplicates, array doubled when full
	static int[] getData(){
		Scanner input = new Scanner();
		int data[] = new int[2];
		do{
			System.out.println("enter a number!");
			data.push(input);
			//grab number from the user
			//Check if input!=1
				//Check for not duplicate (call function below
					//check if array is not big enough, 
						//double size (call resize function below)
					//Enter into the array
			
		}while(true);
		return data;
	}
	
	//Method returns a copy of the original array with double size
	static int[] resize(int[] data, int size){
		//come up with a temp array double the size of the old array
//copy data into it and then return the temp variable
	}
	
	//Method returns true/false if key is in array
	static boolean checkDuplicate(int[] data, int used, int key){
		//use a for loop to check the contents of the array and return
		//a boolean variable that gives the status
	}
	
	//Boolean reverse==true will cause a reverse order print
	static void display(){
		//use a for loop to display in ascending and descending order. Can use 
		//the sort method in the Arrays class
	}
	
	static Integer[] toInteger(int[] data){
		//come up with an Integer array and copy contents of int array into it
		//return Integer array
	}
}












