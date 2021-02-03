import java.io.*;
import java.util.*;



class VectorTest
{
	public static void main(String []args)throws Exception
	{

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the file name");
		String fname = in.nextLine();

	Vector <String> v = new Vector <String> (30);

		try
		{

			BufferedReader fin = new BufferedReader(new FileReader(fname));


		String line = fin.readLine();


			while(line!=0)
			{
			line = fin.readLine();
			 v.add(line);
	  }

		  int totalElements = v.size();

		   FileWriter fout = new FileWriter("tooo.txt");
			String str = v.lastElement();
 				fout.write(str);


 				for(int i=totalElements-1;i>0;i--)
 				{
					fout.write(str);
				}





			fout.close();
		 fin.close();
	 }

	 catch(FileNotFoundException e)
	 {
		 System.out.println(e);
	 }
 }

}