import java.lang.*;
import java.io.*;
import java.util.*;

class CodeChef {
    public static void main(String args[]) {
       try{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long[] a = new long[t];
        
        for(int i=0;i<t;i++){
            a[i] = scan.nextLong();
        }
        Arrays.sort(a);
        long n = t,max = Long.MIN_VALUE;
        for(int i=0;i<t;i++){
            max = Math.max(max,a[i]*n);
            n--;
        }
        System.out.println(max);
       }catch(Exception e){}
    }
}