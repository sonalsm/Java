import java.awt.*;
import java.awt.event.*;

public class ShapeEventTest extends Frame implements ActionListener
{

	Button b1 = new Button("Hide");
	Button b2 = new Button("InfoPlanet");

	ShapeEventTest()
	{
		setSize(600,500);
		setTitle("Shape Event Test");
		setLayout(new FlowLayout());

		add(b1);
		add(b2);

		b1.addActionListener(this);
}

 public void actionPerformed(ActionEvent e)
 {
	String str = e.getActionCommand();

	if(str.equals("Hide"))
	{
		b2.setVisible(false);
		b1.setLabel("Show");
 	}

 	else
	{
		 b2.setVisible(true);
		 b1.setLabel("Hide");
	 }
}
 public static void main(String []args)
 {
	 ShapeEventTest f = new ShapeEventTest();
	 f.setVisible(true);
	}
}
