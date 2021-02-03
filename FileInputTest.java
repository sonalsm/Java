import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class FileInputTest extends Frame implements ActionListener
{
	TextField t = new TextField(20);
	TextArea ta = new TextArea();
String line;
	FileInputTest()
	{
		setSize(600,500);
		setTitle("File Open");

		Panel p = new Panel();
		p.add(new Label("File Name To Open"));
		p.add(t,"North");
		add(p);
		p.add(ta);

		t.addActionListener(this);
	}
public void actionPerformed(ActionEvent e)
{
	String str = t.getText();

	try
	{
		BufferedReader fin = new BufferedReader(new FileReader(str));

		 line = fin.readLine();
	while(line!=null)
	{
	 if(line!=null)
	   ta.append("\n");

	 ta.append(line);

	  line = fin.readLine();
	}
	fin.close();
}
catch(Exception ea)
{
}
}

public static void main(String []args)
{
	FileInputTest f = new FileInputTest();
	f.setVisible(true);
}
}
