import java.util.*;
public class codeforce
{
    public static void main(String args[])
    {
        Scanner stdin=new Scanner(System.in);
        int len=stdin.nextInt();
        int k=stdin.nextInt();
        int arr[]=new int[len];
        int qualify=k;
        int index=k-1;
        for(int i=0;i<len;i++)
        {
            arr[i]=stdin.nextInt();
        }
            if((index < len-1) && (arr[index] > 0))
            {
            if(  (arr[index+1] == arr[index]) ) 
            {
                    for(int i=index+1;i<len;i++)
                    {
                        if(arr[i] == arr[index])
                        qualify++;
                        else
                        break;
                    }
            }                
            }
        else
        {
            if(arr[index] == 0)
            {
            for(int i=index;i>=0;i--)
            {
                if(arr[i] == 0)
                qualify--;
                else
                break;
            }
            }
        }
        
        System.out.println(qualify);
        
    }    
}