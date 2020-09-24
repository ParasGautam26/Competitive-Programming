/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
            int n = scan.nextInt();
            String s = scan.next();
            char [] a = s.toCharArray();
            int ans=0,r=0,b=0,ac=0,bc=0;
            for(int i=0 ; i<2*n ; i++)
            {
                if(i%2==0)
                {
                    ac++;    
                    if(a[i] == '1')
                        r++;
                }
                else
                {
                    bc++;
                    if(a[i] == '1')
                        b++;
                }
                
                    
                if(r>b && n-bc < r-b)
                {
                    ans = i+1;
                    break;
                }
                else if(b>r && n-ac < b-r)
                {
                    ans = i+1;
                    break;
                }
            }
            if(ans==0)
                ans = 2*n;
                
            System.out.println(ans);
		}//test
	}
}
