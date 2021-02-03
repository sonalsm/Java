import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;


class NewTest extends Frame
{
	String str;

	Label l = new Label("File Name",Label.CENTER);
	Label label = new Label("  ",Label.CENTER);
	TextField tf = new TextField(20);
	List li = new List(10,true);
	String line;

	NewTest()
	{
		setSize(600,500);
		setTitle("My List");

		Panel p = new Panel();
		p.add(l,"North");
		p.add(tf);
		add(p,"North");

		Panel pa = new Panel();
		pa.add(li);
	    add(pa);

		tf.addActionListener(new Handler());
		//li.addActionListener(new Handler());
	}

	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			 str = tf.getText();


			 	try
			 	{
			 		//BufferedReader fin = new BufferedReader(new FileReader(str));
			 		Scanner in = new Scanner(str);
					File f = new File(in);

							    String names[] = f.list();

								for(String s:names)
								{
									li.add(s);

								}



			}
			 catch(Exception ea)
			 {
			 }

		}
		}
		/*class HandlerTest implements ItemListener
		{
			public void itemStateChanged(ItemEvent e)
			{
				 	//String st[] = li.getSelectedItems();
					//String x = "Selected Items Are";



		}
	   }*/

	public static void main(String [] args)
	{
		NewTest f = new NewTest();
		f.setVisible(true);
	}
}