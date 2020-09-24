                                
                                
                                
                                /* YOU ARE BEAUTIFUL */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	 while(t-->0)
	 {
	     int n=scan.nextInt();
	     String s=scan.next();
	     Stack<Character> st= new Stack<Character>();
            String result =new String("");
            
            for(int i=0; i<s.length(); i++){
                char c= s.charAt(i);
                
                if(c>='A' && c<='Z'){
                    result+=c;
                }
                else if(c==')'){
                    while(st.peek()!='('){
                        result+=st.peek();
                        st.pop();
                    }
                    st.pop();
                }
                else if(c=='('){
                    st.push('(');
                }
                else{
                    while(!st.isEmpty() && getPriority(c)<=getPriority(st.peek())){
                        result+=st.peek();
                        st.pop();
                    }
                    st.push(c);
                }
            }
            
            while(!st.isEmpty()){
                result+=st.peek();
                st.pop();
            }
            System.out.println(result);
        }
	}
    public static int getPriority(char c){
        if(c=='+' || c=='-')
            return 2;
        else if(c=='*' || c=='/')
            return 3;
        else if(c=='^')
            return 4;
        else
            return 1;
    }
}
