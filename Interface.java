interface Amount { 
		void setPrice();
 }
// using interfaces
abstract class Book implements Amount {
	String title;
	double price;
	Book(String title){this.title = title;};
	public String getTitle(){return this.title;}
	public double getPrice(){return this.price;}
	public abstract void setPrice();
}

final class Fiction extends Book{
	String rating;
	public void setPrice(){this.price = 24.99;};
	Fiction(String title){
		super(title);
		setPrice();
		this.rating = "good";
	}
	public String getRating(){return this.rating;}
}

class Adults extends NonFiction {
	String level;	
	Adults(String title){
		super(title);
		setPrice();
	}
	public void setPrice(){
		
	}
}

class NonFiction extends Book {  
		NonFiction(String title){
			super(title);
			setPrice();
		}
	public void setPrice(){this.price = 37.99;}

  }

class Driver {
	public static void main(String[]args){
		// these can be changed later to differnt values
	 Book[] myBooks = new Book[4];
			myBooks[0] = new Fiction("hoho");
			myBooks[1] = new NonFiction("scary");
			System.out.println(myBooks[1].getTitle());
			System.out.println(myBooks[1].getPrice());
			System.out.println((myBooks[0]).getTitle());
			System.out.println(myBooks[0].getPrice());
			System.out.println(((Fiction)myBooks[0]).getRating());
	}
}
