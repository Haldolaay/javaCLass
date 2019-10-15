import java.lang.*; 
import java.util.Scanner;
public class Bank{
  static BankAccount[] accounts; //This array will point to all the BankAccount objects
  static int noOfAccs;           //Keeps track of the total number of accounts
  static{
		accounts[0] = new BankAccount(0,0);
	   accounts[0].setAcc(0);
	   accounts[0].setBalance(0);
  }
  public static void main(String[] args) { 
	//call bankMenu

	
	bankMenu();// the program doesn't work, i keep getting a nullPointerException!! sorry!
  }
   public static boolean isItThere(int userInput){
	  for (int i =0; i<accounts.length;i++){
		  if (accounts[i].getAcc() == userInput ){return true;}
	  }
	  return false;
  }
  
  //bankMenu runs the main part of the program, until user selects 'Q'
  static void bankMenu(){
    int currentIndex = -1;	//This variable tells us whether we are pointing to a valid account 
	boolean quit = false;
    do{  
	 //display menu and ask for user selection
	 String userSelection;
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println(" O: Open account \n D: Deposit \n S: Select account \n C: Close account \n W: Withdraw \n L: List all accounts \nQ: Quit \n");
	 userSelection = input.nextLine();		
	 switch(userSelection){
        case "O": //Open account 
		if(accounts[accounts.length-1] != null){
			BankAccount temp[] = new BankAccount[accounts.length*2];
			System.arraycopy(accounts, 0, temp, 0, accounts.length);
			accounts = temp;
			
		}
			System.out.println("Enter an account number");
			int anumber = input.nextInt();
          //make sure you have enough space or double size OF accounts array
		  if (isItThere(anumber)){
			  System.out.println("account already exit, please select another account");
			  continue;
		  }
		//make sure the account number is not a duplicate. Assign array index to account
          //set the current index;
		  for (int i = 0 ; i< accounts.length ; i++){
			  if (accounts[i] == null){
				  currentIndex = i;
				  System.out.println("enter new account number,");
				  int newNumber = input.nextInt();
				  accounts[i].setAcc(newNumber);
				  input.next();
				  System.out.println("enter new balance");
				  double newBalance = input.nextDouble();
				  accounts[i].setBalance(newBalance);
			  }
		  }
          //increment the number of accounts
		  noOfAccs++;
		  break;
        case "D": //Deposit 
          //deposit only if currentIndex is not -1. you are depositing into a particular account 
			
				if(currentIndex == -1){System.out.println("no account selected");break;}
				accounts[currentIndex].deposit();
			
		  break;		  
        case "S": //Select account
		//look for account and if it exists, set currentIndex to it 
		currentIndex = selectAcc();
          break;
		           
        case "C": //Close account
		closeAcc(currentIndex);
          		  break;
		  //if currentindex is not -1 close the account and reset currentIndex		            
        case "W": //Withdraw
		if (currentIndex != -1){
			accounts[currentIndex].withdraw();
		}
        		  break;
		//if current index is not -1, withdraw
        case "L": //List accounts
          //traverse through all the accounts and display their information
		  listAccounts();
          break;
        case "Q": //Quit
          //end the program
		  System.out.println("goodBye");
		  quit = true;
		  break;
      }
    }while(!quit);
  }

  //Print the menu, takes index of currently selected account
  static void printMenu(int index){
    //display menu 
    //if index is not -1 display the account information    
	if (index != -1){
    System.out.println("name: " + accounts[index].getAcc()+
	"      Balance:" + accounts[index].getBalance());
	}
  }

 
 
  
 

  static void listAccounts(){
	//Go through all the accounts using a for loop and display their content
	if(accounts.length> -1){
	for (int i =0 ; i < accounts.length ; i++){
		System.out.println("account: " +accounts[i].getAcc()+ "         balance:"+accounts[i].getBalance());
	}
	}else{System.out.println("there are no accounts availabe");}
  }

  static int selectAcc(){
    //ask for the account number, check to see if it exists and return index
	System.out.println("Enter account number");
	Scanner input = new Scanner(System.in);
	int userInput = input.nextInt();
	  for (int i =0; i<accounts.length;i++){
		  if (userInput == accounts[i].getAcc()){return i;}
	  }
	  return -1;
  }
	
  
  
  static void closeAcc(int index){
    //move last account to the index that needs to be deleted 
    //set last account to null
    //decrement noOfAccts variable
	if (index == -1){System.out.println("Please select an account");}
	else{
	accounts[index] = accounts[accounts.length-1];
	accounts[accounts.length-1] = null;
	noOfAccs --;
	};
  }
}
class BankAccount{
  private int accNbr;
  private double balance;
  
  BankAccount(int accNbr, double balance){
    //set instance variables
	this.accNbr = accNbr;
	this. balance = balance;
  }
  public void setAcc(int accNbr){this.accNbr = accNbr;}
  public void setBalance(double balance){this.balance = balance;}
  
  public int getAcc(){
    //return accountNumber
	return this.accNbr;
  }
  
  public double getBalance(){
   //return balance
   return this.balance;
  }
  
  void deposit(){     
	//add to deposit  
	if (this.accNbr != 0){
	    System.out.println("Enter amount of deposit:");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		this.balance += amount;
		}
	else{
		System.out.print("Please select an account");
		}
  }
  
  void withdraw (){
    //withdraw as long as there is still $1 in the account
	if (this.balance > 1){
		System.out.println("thank you for the money");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		this.balance -= amount;
		System.out.println("new balance is "+this.balance);
	}else{
		System.out.println("your gonna have a negative balance, try again");
	}
  }
}


