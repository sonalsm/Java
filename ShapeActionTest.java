import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class ShapeActionTest extends Frame implements ActionListener
{
	Button l = new Button("Line");
	Button r = new Button("Rect");
	Button c = new Button("Circle");
	Object src;

	ShapeActionTest()
	{
		setSize(600,500);
		setTitle("Shape Event Test");
		setLayout(new FlowLayout());

		add(l);
		add(r);
		add(c);

		l.addActionListener(this);
		r.addActionListener(this);
		c.addActionListener(this);
	}

	public void paint(Graphics g)
	{
	if(src==l)
	 g.drawLine(50,50,250,250);
	 else
	 if(src==r)
	 g.drawRect(50,50,300,300);
	 else
	 if(src==c)
	 g.drawOval(50,50,300,300);
	 else
	 System.out.println("no valid value");
 }

 public void actionPerformed(ActionEvent e)
 {
	 src = e.getSource();
	 repaint();
 }

 public static void main(String []args)
 {
	 ShapeActionTest f = new ShapeActionTest();
		f.setVisible(true);
	}
}
