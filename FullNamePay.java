import java.util.Scanner;
public class FullNamePay{

		public static void main(String[]args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter your first and last name:");
		String name = userInput.nextLine();
		System.out.println("enter your hourly pay:");
		int pay = userInput.nextInt();
		System.out.println("enter the number of hours:");
		int hours = userInput.nextInt();
		System.out.print("name = " +name +" " +  "\npay = "+ pay * hours); 
		}

}
class PayFullName {
	
	public static void main(String[]args){
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter your hourly pay:");
		int pay = userInput.nextInt();
		System.out.println("enter the number of hours:");
		int hours = userInput.nextInt();
		userInput.nextLine();
		System.out.println("enter your first and last name:");
		String name = userInput.nextLine();
		System.out.print("name = " +name +" " +  "\npay = "+ pay * hours); 
		
		
	}

}
class PayFirstLastName{
	
	public static void main(String[]args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter your hourly pay:");
		int pay = userInput.nextInt();
		System.out.println("enter the number of hours:");
		int hours = userInput.nextInt();
		userInput.nextLine();
		System.out.println("enter your first name");
		String firstName = userInput.nextLine();
		System.out.println("enter your last name");
		String lastName = userInput.nextLine();
		System.out.println("first name = " +firstName+"\nlast name ="+lastName
		+ "\npay = " + pay * hours);
	}
	
}