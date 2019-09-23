import java.util.*;
import javax.swing.*;
public class Family{
	
	double income;
	int children;
	static int random;// i needed a variable to store the random value in, andd the static block wont let me!
	static{
		   
			 Random r = new Random();
			 random =r.nextInt(7)+1;
	}
	{
		//children= (random.nextInt(7)+1);
		children = random;
	}
	public Family(){};
	public Family(double income){
		this.income = (income*this.children);
	}
	
	
	public static void main(String[]args){
		
		/*int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number of children please: ");
		number = input.nextInt();
		*/
		/*
		Family houshold = new Family();
		if (houshold.children < 4 ){

		    houshold.income = houshold.children * 1000;}
		else{
			//Double input = new Double().valueOf(JOptionPane.showInputDialog("enter the amount of income"));
			  String input = JOptionPane.showInputDialog("enter the amount of income");
			  double dInput = new Double(input).doubleValue();
			
			houshold(dInput);
		}
		*/
				if (random < 4 ){
				Family houshold = new Family();
		    houshold.income = houshold.children * 1000;
			System.out.println("no of children: "+houshold.children+"\nincome:"+houshold.income);
			}
		else{
			//Double input = new Double().valueOf(JOptionPane.showInputDialog("enter the amount of income"));
			  String input = JOptionPane.showInputDialog("enter the amount of income");
			  double dInput = new Double(input).doubleValue();
			
			Family houshold = new Family(dInput);
		    System.out.println("no of children: "+houshold.children+"\nincome:"+houshold.income);
		}
		
		
	}
	
	
	
}