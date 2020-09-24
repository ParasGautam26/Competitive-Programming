                                
                                
                                
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
	      String str=scan.next();
	      int flag=0;
	     char[] s=str.toCharArray();
	     
	    int l=s.length;
	    int[] first=new int[26];
	    int[] sec=new int[26];
	    
	    for(int i=0;i<l/2;i++){
	        first[s[i]-'a']++;
	    }
	    
	    if(l%2==0){
	        for(int i=l/2;i<l;i++){
	            sec[s[i]-'a']++;
	        }
	    }
	    else{
	        for(int i=(l/2)+1;i<l;i++){
	            sec[s[i]-'a']++;
	        }
	    }
	    
	    for(int i=0;i<26;i++){
	        if(first[i]!=sec[i]){
	            flag=1;
	            break;
	        }
	    }
	    if(flag==1){
	        System.out.println("NO");
	    }
	    else{
	        System.out.println("YES");
	    }
	     
	     
	 }
	    }catch(Exception e){
	        System.out.println(e);
	    }
	}
}
