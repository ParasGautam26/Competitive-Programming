import java.lang.*;
import java.io.*;
import java.util.*;

class CodeChef {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int new_num=0;
            while(n!=0){
                int dig = n%10;
                new_num = (new_num*10)+dig;
                n = n/10;
            }
            System.out.println(new_num);
        }
    }
}