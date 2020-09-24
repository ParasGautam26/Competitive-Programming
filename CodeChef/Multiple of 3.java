                                
                                
                                
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
	      long n=scan.nextLong();
	      int d0=scan.nextInt();
	      int d1=scan.nextInt();
	        long sum=d0+d1;
	        long rep_sum=0;
	        List<Long> list=new ArrayList<Long>();
	       sum+=sum%10;
	       int i=1;
	       while(i<=4){
	           long dig=sum%10;
	           sum+=dig;
	           list.add(dig);
	           rep_sum+=dig;
	           i++;
	       }
	       sum-=rep_sum;
//	       System.out.println(list);
	       if(n==2){
	           sum=d0+d1;
	       }
	       else if(n>3){
	           long remain = (n-3)/4;
	           sum+=rep_sum*remain;
	           
	           for(int j=0;j<(n-3)%4;j++){
	               sum+=list.get(j);
	           }
	       } 
	       if(sum%3==0){
	           System.out.println("YES");
	       }
	       else{
	           System.out.println("NO");
	       }
	 }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
}
