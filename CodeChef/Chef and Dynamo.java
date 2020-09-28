/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

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
	     int n=scan.nextInt();
	     long a=scan.nextLong();
	     
	  /*   int value_n = (int)Math.round(n);
	     int value_a =(int)Math.round(a);   
	     */

	     
	     
	     double h= (2*Math.pow(10,n));
	     long value_h =(long) h;
	     
	     long value_s = value_h + a;
	     
	     System.out.println(value_s);
	     System.out.flush();
	     
	     long b=scan.nextLong();
	     
	     double l=(Math.pow(10,n));
	     long value_l =(long) l;
	     
	     long value_c = value_l - b;
	     
	     System.out.println(value_c);
	     System.out.flush();
	     
	     long d=scan.nextLong();
	     
	      double m= (Math.pow(10,n));
	      long value_m =(long) m;
	      
	      long value_e = value_m - d;
	      
	      System.out.println(value_e);
	      System.out.flush();
	     
	     int r=scan.nextInt();

	 }
	    }catch(Exception e){}
	}
}
