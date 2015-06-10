import java.util.*;
public class longwords
{
    static String reduce(String str)
    {
        int len=str.length();
        String red=""+str.charAt(0) + (len-2) + str.charAt(len-1) ;
        return red;
    }
    
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in) ;
        int n=s1.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.next();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i].length() > 10)
            System.out.println(reduce(arr[i]));
            else
            System.out.println(arr[i]);
        }
    }
    
}