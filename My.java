
import java.awt.*;

public class My extends Frame
{

My()
{
	setTitle("My Frame");
	setSize(600,500);
	setLayout( new FlowLayout());

	for(int i=1;i<=20;i++)
	{
		Button b= new Button("Button"+i);
		add(b);

}
			}
public static void main(String []args)
{
	My m = new My();
	m.setVisible(true);

	}
}