import java.awt.*;
import javax.swing.*;
public class SwingGridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   JFrame f = new JFrame("GridLayout");
   JPanel MyPanel =new JPanel();
   MyPanel.setLayout(new GridLayout(2,2));
   
   JButton a = new JButton("button1");
   JButton b = new JButton("button2");
   JButton c = new JButton("button3");
   JButton d = new JButton("button4");

	MyPanel.add(a);
	MyPanel.add(b);
	MyPanel.add(c);
	MyPanel.add(d);
	f.getContentPane().add(MyPanel, "Center");
	f.setSize(300,300);
	f.setVisible(true);
   
	}

}
