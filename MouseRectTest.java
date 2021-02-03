import java.awt.*;
import java.awt.event.*;

public class MouseRectTest extends Frame
{

	int x,y,x1,y1,c;

	MouseRectTest()
	{
		setSize(600,500);
		setTitle("My Document");

		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());

	}

	class MouseHandler extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			c = e.getClickCount();
			x=e.getX();
			y=e.getY();
		}


	}

	class MouseMotionHandler extends MouseMotionAdapter
		{
			public void mouseDragged(MouseEvent e)
			{
				x1=e.getX();
				y1=e.getY();
				repaint();
			}
		}


		public void paint(Graphics g)
		{
			g.fillRect(x,y,x1,y1);
		}



	public static void main(String []args)
	{
		MouseRectTest f = new MouseRectTest();
		f.setVisible(true);
	}
}



