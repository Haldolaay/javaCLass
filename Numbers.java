import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 
import java.lang.System;
//Note all methods are static. You can pass arrays back from a method such ascending
//int a[]=getData();  
//You can add more methods if you wish
public class Numbers {
	
	public static void main(String[] args){
		//Declare your arrays (two int arrays and one Integer array)
		int[] a,b;
		a = new int[2];
		b = new int[3];
		
		//call function getData and put them in one the array
		a = getData();
		
		Integer[] array = new Integer[a.length];
		
		//Use System.arraycopy to make a copy to another int array
		//feed the array and get back and array of wrapper class Integer
		
		System.arraycopy(toInteger(a),0,array,0,a.length);
		//display sorted order
		display(array);
	}
	
	//Takes user input until input is -1, no duplicates, array doubled when full
	static int[] getData(){
		Scanner input = new Scanner(System.in);
		int i = 0;
		int userInput = 0;
		int data[] = new int[2];// i need to check if the array is full first// fixed, i actually don't
		do{
			System.out.println("enter a number!");
			userInput = input.nextInt();
			//grab number from the user
			if (userInput == -1){break;}
			//Check if input!=1
			if (checkDuplicate(data, i, userInput)){
				System.out.println("this number already exist! please enter a diffirent number");
				continue;
			};//Check for not duplicate (call function below //FIXED done!!
				
				
					//check if array is not big enough, 
			//if (data[i]==0){
				if(i<data.length){
				data[i] = userInput;
			}//double size (call resize function below)
			else {
				data = resize(data,data.length);
				data[i] = userInput;
			}
			//Enter into the array
				i++;
		}while(true);
		return data;
	}
	
	//Method returns a copy of the original array with double size
	static int[] resize(int[] data, int size){
		//come up with a temp array double the size of the old array
		int[] temp = new int[size*2];
		for(int i =0; i<data.length;i++){
			temp[i] = data[i];
		}
//copy data into it and then return the temp variable
return temp;
	}
	
	//Method returns true/false if key is in array
	static boolean checkDuplicate(int[] data, int used, int key){
		//use a for loop to check the contents of the array and return
		for (int i = 0; i<data.length; i++){
		   // (data[i] == key)? return true:return false;// FIXME I need to check why is this not working!
		   if (data[i] == key){return true;}
		   
		}
		return false;//a boolean variable that gives the status
	}
	
	//Boolean reverse==true will cause a reverse order print
	static void display(Integer[] array){
		//use a for loop to display in ascending and descending order. Can use 
		//the sort method in the Arrays class
				Arrays.sort(array);
				System.out.println("sorted in ascending order:");
		for(int i = 0 ; i < array.length ; i++){
			System.out.println(i+" index value is: "+ array[i]);
		}
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("sorted in descending order:");
		for(int i = 0 ; i < array.length ; i++){
			System.out.println(i+" index value is: "+ array[i]);
		}
		
	}
	static void display(int[] array){
	
		
		Arrays.sort(array);
		for(int i = 0 ; i < array.length ; i++){
			System.out.println(i+" index value is: "+ array[i]);
		}
	
	}
	
	static Integer[] toInteger(int[] data){
		//come up with an Integer array and copy contents of int array into it
		//return Integer array
		
		Integer[] newData = new Integer[data.length];
		for(int i =0; i<data.length;i++){newData[i]=data[i];}
		return newData;
	}
}












