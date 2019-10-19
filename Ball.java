class Ball{
	public double radius;
	public String color;
	public Ball(){
		this.radius = 00;
		this.color = "white";
	};
	public Ball(double radius, String color){
	
		this.radius = radius;
		this.color = color;
	
	}
	public double area(){return radius*2; }// experimenting for now, will change later;
	
	

}
class BasketBall extends Ball{

	private int noOfStripes;
	 public BasketBall(double radius, String color){
		super(radius, color);
		this.noOfStripes = 8;
		
		
	}
	 public BasketBall(int noOfStripes, double radius, String color){
		
		super(radius, color);
		this.noOfStripes = noOfStripes;
		
	}
	

}
class Driver{
	
	public static void main(String[]arg){
		
		Ball obj1 = new BasketBall(6, 10.5, "red");
		Ball obj2 = new BasketBall(6, "blue");
		System.out.println(obj1.color);
		System.out.println(obj2.color);
	}
	
	
	
}