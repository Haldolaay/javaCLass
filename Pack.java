import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Rectangle;
public class Pack extends JFrame {
  private Button button1 = new Button("Button 1");
  private Button button2 = new Button("Button 2");
  private Button button3 = new Button("Button 3");
  private Button button4 = new Button("Button 4");
  private Button button5 = new Button("Button 5");
  private Rectangle rect = new Rectangle(50,50,50,50);

  public Pack() {
  super("pack() vs. setSize() method Example");
  
  this.addWindowListener(new WindowAdapter() {
  public void windowClosing(WindowEvent e) {
  System.exit(0);
  }
  });

  Container contentPane = this.getContentPane();
  contentPane.setLayout(new FlowLayout());

  contentPane.add(button1);
  contentPane.add(button2);
  contentPane.add(button3);
  contentPane.add(button4);
  contentPane.add(button5);

  //this.setSize(450, 90);
  this.pack();
  }

  public static void main(String[] args) {
  Pack mainFrame = new Pack();
  mainFrame.setBounds(50,50,50,50);
  mainFrame.setVisible(true);
  }  
}

