import java.awt.*;
import javax.swing.*;
public class SwingBorderLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 JFrame f = new JFrame("BorderLayout");
 JPanel MyPanel1 =new JPanel();
 MyPanel1.setLayout(new BorderLayout());
 JButton a =new JButton("button1");
 JButton b =new JButton("button2");
 JButton c =new JButton("button3");
 JButton d =new JButton("button4");
 JButton e = new JButton("button5");
 
 MyPanel1.add(a,"North");
	MyPanel1.add(b,"South");
	MyPanel1.add(c,"East");
	MyPanel1.add(d,"West");
	MyPanel1.add(e,"Center");
	
	f.getContentPane().add(MyPanel1, "North");
	
	f.setSize(300,400);
	f.setVisible(true);
	}

}
