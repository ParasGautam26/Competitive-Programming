import java.lang.*;
import java.io.*;
import java.util.*;

public class Main{
     
    static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
                
            case '*':
            case '/':
                return 2;
            
            case '^':
                return 3;
        }
        return -1;
    }
    
    
    public static String infixToPostfix(String s){
        
        String res = "";
        
        if(s.length()==0){
            return res;
        }
        
        Stack<Character> stack = new Stack();
        
        for(int i = 0 ; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                res+=ch;
            }
            
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    res+=stack.pop();
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && prec(ch)<=prec(stack.peek())){
                    res+=stack.pop();
                }
                stack.push(ch);
            }
            
        }
        while(!stack.isEmpty()){
            if(stack.peek()=='(')
                return "Invalid expression";
        
            res+=stack.pop();
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(infixToPostfix(s));
    }
}
