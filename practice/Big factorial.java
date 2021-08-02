import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            BigInteger f = new BigInteger("1");
            for(int i =1 ; i<=n ; i++){
                f = f.multiply(BigInteger.valueOf(i));
            }
            System.out.println(f);
        }
    }
}
