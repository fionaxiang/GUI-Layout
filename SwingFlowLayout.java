import java.awt.*;
import javax.swing.*;
public class SwingFlowLayout {
	public static  void main(String [] args){
		JFrame f =new JFrame( "FlowLayout");
		JPanel MyPanel = new JPanel();
		MyPanel.setLayout(new FlowLayout());
		JButton a = new JButton ("button1");
		JButton b = new JButton ("button2");
		JButton c = new JButton ("button3");
		JButton d = new JButton ("button4");
		
		MyPanel.add(a);
		MyPanel.add(b);
		MyPanel.add(c);
		MyPanel.add(d);
		f.getContentPane().add(MyPanel, "Center");
		
		f.setSize(400,400);
		f.setVisible(true);
	}

}
