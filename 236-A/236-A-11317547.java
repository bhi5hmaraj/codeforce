import java.io.*;
public class boygirl
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ;
		String str=br.readLine();
		char ch;
		int len=str.length();
		int unique=0;
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch != '*')
				unique++;
			str=str.replace(ch,'*');
		}
		if(unique % 2 == 1)
			System.out.print("IGNORE HIM!");
		else
			System.out.print("CHAT WITH HER!");
	}
}