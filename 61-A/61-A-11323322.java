import java.util.*;
public class fastmaths
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str1=s1.nextLine();
		String str2=s1.nextLine();
		String str3="";
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) == str2.charAt(i))
				str3=str3+"0";
			else
				str3=str3+"1";
		}
		System.out.println(str3);
	}
}