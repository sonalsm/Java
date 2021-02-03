import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ValidationTest extends JFrame
{
	JLabel l1 = new JLabel("Name");
	JLabel l2 = new JLabel("Mob.no");
	JLabel l3 = new JLabel("Password");
	JTextField tf1 = new JTextField(20);
	JPasswordField tf3 = new JPasswordField(20);
	JTextField tf2 = new JTextField(20);

	ValidationTest()
	{
		setSize(600,500);
		setTitle("My Form");

		JPanel p = new JPanel();
		p.add(l1,"North");
		p.add(tf1,"North");
		p.add(l2,"North");
		p.add(tf2,"North");
		add(l3,"Center");
		add(tf3,"Center");

		add(p);

	    tf2.addKeyListener(new Handler());
	}

	class Handler extends KeyAdapter
	{
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyChar()>=0 && e.getKeyChar()<=9)
		tf2.setEditable(true);

        else
		if(e.getKeyChar()>='a' && e.getKeyChar()<='z' || e.getKeyChar()>='A' && e.getKeyChar()<='Z')
		{
		 JOptionPane.showMessageDialog(null,"Enter Only Numeric Value");
	 }
	}
}

public static void main(String []args)
{
	ValidationTest f = new ValidationTest();
	f.setVisible(true);
	f.setDefaultCloseOperation(3);
}
}