import java.io.*;
public class caps
{
		static String toggleCase(String str,int len)
	{
		String temp="";
		char ch;
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(Character.isLowerCase(ch))
				temp+=Character.toUpperCase(ch);
			else
				temp+=Character.toLowerCase(ch);
		}
		return temp;
	}
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int len=str.length();
	char ch;
	int exit=0;
	for(int i=1;i<len;i++)
	{
		ch=str.charAt(i);
		if(Character.isLowerCase(ch))
		{
			exit=1;
			break;
		}
		
	}
	if(exit == 1)
		System.out.print(str);
	else
	{
		System.out.print(toggleCase(str,len));
	}
			
	}
	

}