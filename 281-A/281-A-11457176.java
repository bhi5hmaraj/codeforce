import java.util.*;
public class capital
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		String str=s1.next();
		if(str.length()>=1)
		System.out.print(Character.toUpperCase(str.charAt(0))+str.substring(1));
		else
		System.out.print(str);
	}
}