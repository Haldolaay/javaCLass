import java.util.Scanner;
// Here is a template. Remember all methods are static. You can have more methods 

// but everything should be in a single class. 

public class  Grades 
{ 
   static int high, low=101, avg;
    
   public static void main(String[] args){ 
       int gradeA=0, gradeB=0, gradeC=0,gradeD=0, gradeF=0, total=0, input=0, numGrades=0; 
       
		Scanner userInput = new Scanner(System.in);
       //If you want, you can break this up into a bunch  of methods 
	   System.out.println("Enter the scores (-1 to end input)? ");
       do{ 
         //Grab input 
		 
		 input = userInput.nextInt();
         if (input != -1) {
			 
         
		 if(input <=100 && input >-1){		
		   //update the total 
		   total+=input;
            //call calcHigh to update the high variable 
			calcHigh(input);
            //call calcLow to update the low variable 
			numGrades++;
			calcLow(input);
            //update the counts for the grades using if or switch statements
			if (input >= 90)gradeA++;
			if (input<90 && input>=80)gradeB++;
			if (input<80 && input>=70)gradeC++;
			if (input<70 && input>=60)gradeD++;
			if (input <= 59) {gradeF++;}
			calcAvg(total,numGrades);
		 }
			
           //update the total number of grades for average calculation                                 
			
		 }
       }while(input != -1); 
       

  //You can call a method for this part as well 
       if (numGrades > 0) 
         //Display the various counts, averages, hights and lowest scores 
	 printingResult(gradeA,gradeB,gradeC,gradeD,gradeF);
   } 
 
   static void calcAvg(int total, int numGrades){ 
     avg = total/numGrades;
   } ;
    

   static void calcHigh(int input){ 
     if(high<input)high = input;
   } 
    

   static void calcLow(int input){ 
      if (low>input)low = input;
   }   
   public static void printingResult(int A, int B, int C, int D,int F){
	   System.out.println(
	    "Number of A\\s: "+A
	   +"\nNumber of B\\s: "+B 
	   +"\nNumber of C\\s: "+C
	   +"\nNumber of D\\s:  "+D 
	   +"\nNumber of F\\s:  "+F
	   +"\nHighest score:  "+high
	   +"\nLowest score: 	 "+low
	   +"\nAverage score:  "+avg
	   );






   }
   
} 
 