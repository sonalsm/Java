import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MyImage extends Applet
{
	Image img;

	public void init()
		{
	      	img = getImage(getCodeBase(),"Aparna.jpg");

	  }
	public void paint(Graphics g)
	{
	       g.drawImage(img,40,40,null);
	      }
}