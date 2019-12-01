import java.awt.*;
import javax.swing.JFrame;
import java.awt.Graphics;

class Graph extends JFrame{
	public Graph(String title){
		super(title);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLocation(60,60);
		Container c = this.getContentPane();
			c.setBackground(Color.WHITE);
		this.setVisible(true);
	}
	
	public void paint(Graphics g){
		
		super.paint(g);
		g.fillRect(80,140,200,200);
		//g.drawRect(70,70,70,70);
		//g.drawRect(140,140,40,40);
		g.setColor(Color.black);
		
		g.fillOval(80,140,200,200);
		g.setColor(Color.DARK_GRAY);
		//g.drawRect(240,40);
			g.setColor(Color.DARK_GRAY);
		g.fillRect(280,140,200,200);
	
	
	}
	
	
	public static void main(String[] args){
	 	Graph w = new Graph("title");
	}
	
	
	
	
}