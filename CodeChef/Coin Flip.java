                                
                                
                                
                                /* YOU ARE BEAUTIFUL */
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
	     int g=scan.nextInt();
	     while(g-->0){
	         int i=scan.nextInt();
	         int n=scan.nextInt();
	         int q=scan.nextInt();
	         int heads=0,tails=0;
	         
	         if(i==1){
	             heads=n/2;
	             if(n%2==0){
	                 tails=n/2;
	             }
	             else{
	                 tails=(n/2)+1;
	             }
	         }
	         else if(i==2){
	             tails=n/2;
	             if(n%2==0){
	                 heads=n/2;
	             }
	             else{
	                 heads=(n/2)+1;
	             }
	         }
	         if(q==1){
	             System.out.println(heads);
	         }
	         else{
	             System.out.println(tails);
	         }
	     }
	 }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
}
