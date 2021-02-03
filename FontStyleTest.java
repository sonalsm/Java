import java.awt.*;
import java.awt.event.*;

class FontStyleTest extends Frame
{
	CheckboxGroup gp = new CheckboxGroup();
	Checkbox b1 = new Checkbox("10",gp,true);
	Checkbox b2 = new Checkbox("40",gp,false);
	Checkbox b3 = new Checkbox("60",gp,false);
	Checkbox c1 = new Checkbox("Arial",gp,true);
	Checkbox c2 = new Checkbox("Times New Roman",gp,false);
	Checkbox c3 = new Checkbox("Sanserif",gp,false);


	Label l = new Label("Info Planet",Label.CENTER);

	FontStyleTest()
	{
		setSize(600,500);
		setTitle("Radio Test");

		Panel p = new Panel();

		p.add(b1);
		p.add(b2);
		p.add(b3);
     	p.setBackground(Color.red);
	    add(p,"North");
		add(l);

		Panel pa = new Panel();

		pa.add(c1);
		pa.add(c2);
		pa.add(c3);
		pa.setBackground(Color.green);
		add(pa,"South");

        b1.addItemListener(new Handler());
        b2.addItemListener(new Handler());
        b3.addItemListener(new Handler());
        c1.addItemListener(new HandlerTest());
        c2.addItemListener(new HandlerTest());
        c3.addItemListener(new HandlerTest());
	}

class Handler implements ItemListener
{
	public void itemStateChanged(ItemEvent e)
	{
		boolean x = b1.getState();
		boolean y = b2.getState();
		boolean z = b3.getState();

		if(x==true )
		{
			Font f = new Font("Arial",Font.PLAIN,10);
			l.setFont(f);
		}
		else
		if(y==true )
		{
		  	Font f = new Font("Times New Roman",Font.PLAIN,40);
			l.setFont(f);
		}
		else
		if(z==true )
		{	Font f = new Font("Sanserif",Font.PLAIN,60);
			l.setFont(f);
		}
	}
}

	class HandlerTest implements ItemListener
	{
		public void itemStateChanged(ItemEvent e)
		{
			boolean a = c1.getState();
			boolean b = c2.getState();
			boolean c = c3.getState();


					if(a==true)
					{	Font f = new Font("Arial",Font.BOLD,40);
						l.setFont(f);
					}
					else
					if(b==true)
					{
						Font f = new Font("Times New Roman",Font.BOLD,40);
						l.setFont(f);
					}
					else
					if(c==true)
					{
						Font f = new Font("Arial",Font.BOLD,40);
						l.setFont(f);
		}
	}
	}

public static void main(String []args)
{
	FontStyleTest f = new FontStyleTest();
	f.setVisible(true);
}
}




