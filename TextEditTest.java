import java.awt.*;
import java.awt.event.*;

class TextEditTest extends Frame implements ActionListener
{
	Button b1 = new Button("BOLD");
	Button b2 = new Button("ITALIC");
	Label l = new Label("Info Planet");

	TextEditTest()
	{
		setSize(600,500);
		setTitle("Text Edit");

		Panel p = new Panel();
		p.add(l,"North");
		Panel pa = new Panel();
		pa.add(b1);
		pa.add(b2);

		add(p,"North");
		add(pa,"Center");

		b1.addActionListener(this);
		b2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();

		if(str.equals("BOLD"))
		{
			Font font =new Font("Arial",Font.BOLD,20);
			l.setFont(font);
		}
		else
		if(str.equals("ITALIC"))
		{
				Font font =new Font("Arial",Font.ITALIC,20);
						l.setFont(font);
}
}

public static void main(String []args)
{
	TextEditTest f = new TextEditTest();
	f.setVisible(true);
}
}