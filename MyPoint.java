	import java.util.Scanner;
	 public class MyPoint{
		private int x;
		public int y;
		private static int noOfObjects;
		
		public MyPoint(){setNoOfObject();};
		public MyPoint(int x){
			this();
			this.x = x;};
		public MyPoint(int x, int y){
			this(x);
			this.x = x; 
			this.y = y;};
		
		public void setX(int x){this.x =x;};
		public void setNoOfObject(){noOfObjects++;};
		
		public int getX(){return this.x;};
		public int getNoOfObject(){return noOfObjects;};
		
		
};


	 class Driver{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("input the number value of X:");
			int x = input.nextInt();
			System.out.println("input the number value of Y:");
			int y = input.nextInt();
			
			MyPoint obj1 = new MyPoint();
			MyPoint obj2 = new MyPoint(x);
			MyPoint obj3 = new MyPoint(x,y);
			
			
			
			obj1.setX(x);
			obj1.y = y;
			
			obj2.y = y;
			
			System.out.println("obj1 values are: \n X:"+ obj1.getX()+"\n value of y:"+obj1.y+"\n"+ " number of objects:"+obj1.getNoOfObject()+"\n"
			                  +"obj1 values are: \n X:"+ obj2.getX()+"\n value of y:"+obj2.y+"\n"+ " number of objects:"+obj2.getNoOfObject()+"\n"
			                  +"obj1 values are: \n X:"+ obj3.getX()+"\n value of y:"+obj3.y+"\n"+ " number of objects:"+obj3.getNoOfObject()+"\n");
		};
	}