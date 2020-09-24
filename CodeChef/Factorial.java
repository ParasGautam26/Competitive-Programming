                                
                                
                                
                                /* YOU ARE BEAUTIFUL */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	        Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	 while(t-->0)
	 {
	      long n=scan.nextLong();
	      long ans=0;
	        int i=5;
	    while(n/i>0){
	        ans+=n/i;
	        i=i*5;
	    }
	      System.out.println(ans);
	 }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
}
