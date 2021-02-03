import java.util.*;
import java.io.*;


class Sample
{
  public static void main(String []args)throws Exception
  	{
		int c=1;

		Scanner in = new Scanner(System.in);


		System.out.println("Enter the file name");
		String fname = in.nextLine();





			try
			{
				FileInputStream fin = new FileInputStream(fname);


					int b =fin.read();
					while(b!=-1)
					{
						System.out.print((char)b);

						if(b=='\n')
						 c++;

						b = fin.read();
					}
					System.out.println();
					fin.close();


					System.out.println("total no of lines is"+c);

				}
				catch(FileNotFoundException e)
				{
					System.out.println("File does not exit");
				}
				catch(IOException e)
				{
					System.out.println(e);
			}
		}
	}
