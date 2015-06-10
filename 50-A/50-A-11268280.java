import java.util.*;
public class domino
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int m=s1.nextInt();
        int n=s1.nextInt();
        int max=(int)((m*n)/2);
        System.out.println(max);
    }
}