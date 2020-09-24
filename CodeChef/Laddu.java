                                
                                
                                
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
	      int activities=scan.nextInt();
	      String s=scan.next();
	      int ans=0;
	      
	      for(int i=1;i<=activities;i++){
	          String a=scan.next();
	          
	          if(a.equals("CONTEST_WON")){
	              int rank=scan.nextInt();
	              ans+=300;
	              if(rank<20){
	                  ans+=20-rank;
	              }
	          }
	          else if(a.equals("TOP_CONTRIBUTOR")){
	              ans+=300;
	          }
	          else if(a.equals("BUG_FOUND")){
	                int bug=scan.nextInt();
	                ans+=bug;
	          }
	          else if(a.equals("CONTEST_HOSTED")){
	                ans+=50;                     
	          }
	      }
	      if(s.equals("INDIAN")){
	          System.out.println(ans/200);
	      }
	      else{
	          System.out.println(ans/400);
	      }
	 }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
}
