import java.util.*;
public class stringman
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        String str=s1.next();
        String parsed="";
        for(int i=0;i<str.length();i++)
        {
            char ch=Character.toLowerCase(str.charAt(i));
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':    
                continue;
            }
            parsed=parsed+"."+ch;
        }
        System.out.println(parsed);
    }
}