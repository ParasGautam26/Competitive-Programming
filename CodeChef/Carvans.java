import java.lang.*;
import java.io.*;
import java.util.*;

class CodeChef {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int cnt=0,currmax =Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int a= scan.nextInt();
                if(a<=currmax){
                    currmax=a;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}