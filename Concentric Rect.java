import java.applet.Applet;
import java.awt.*;
class ConcentricRect extends Applet
{
	public void paint(Graphics g)
	{
		int x=30;
		int y=30;
		int wt=70;
		int ht=40;

		for(int i=0;i<10;i++)
		{
			g.drawRect(x=x+20,y=y+20,wt=wt-40,ht=ht-40);
		}
	}
}