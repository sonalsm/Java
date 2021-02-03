import java.awt.*;
import java.awt.event.*;

	public class DrawRect extends Frame implements ActionListener
	{

		Button r = new Button("Draw Rect");
		int x=50;
		int y=50;
		int x1=200;
		int y1=300;

		DrawRect()
		{
			setSize(600,500);
			setTitle("My Rect");
			setLayout(new FlowLayout());

			add(r);

			r.addActionListener(this);
	}


	 public void actionPerformed(ActionEvent e)
	 {
		 Graphics g = getGraphics();
		String str = e.getActionCommand();

		if(str.equals("Draw Rect"))
		{
		  g.drawRect(x,y,x1,y1);
		  x=x+10;
		  y=y+10;
		  x1=x1+10;
		  y1=y1+10;
}
	}
	 public static void main(String []args)
	 {
		 DrawRect f = new DrawRect ();
			f.setVisible(true);
		}
	}


