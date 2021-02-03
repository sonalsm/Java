import java.awt.*;
import java.awt.event.*;

public class KeyHandle extends Frame
{
	int code;
	int x,y,x1,y1;

	KeyHandle()
	{
		setSize(600,500);
		setTitle("My Document");
		x=y=x1=y1=100;
		addKeyListener(new KeyHandler());

	}

	class KeyHandler extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			code = e.getKeyCode();
			Graphics g = getGraphics();

			int d=2;

			if( e.isShiftDown())
			{
				d=10;
				y=y+d;
				g.drawLine(x,y,x1,y1);
			}

			if(code==e.VK_LEFT)
			{
				x=x-d;
				g.drawLine(x,y,x1,y1);
			}
			else
			if(code==e.VK_RIGHT)
			{
				x1=x1+d;

				g.drawLine(x,y,x1,y1);
			}
			else
			if(code==e.VK_UP)
			{
				y=y-d;
				g.drawLine(x,y,x1,y1);
			}
			else
			if(code==e.VK_DOWN)
			{
				y1=y1+d;
				g.drawLine(x,y,x1,y1);
			}
		}
	}

	public static void main(String []args)
	{
		KeyHandle f = new KeyHandle();
		f.setVisible(true);
	}
}



