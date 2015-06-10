import java.util.*;
public class petya_string
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str1=s1.nextLine();
		String str2=s1.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int cmp=str1.compareTo(str2);
		if(cmp > 0)
			System.out.print("1");
		else if(cmp < 0)
			System.out.print("-1");
		else
			System.out.print("0");
	}
}