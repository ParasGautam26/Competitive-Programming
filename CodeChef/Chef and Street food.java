import java.lang.*;
import java.io.*;
import java.util.*;
class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int max = 0;
            for(int i=0;i<n;i++){
                int stores = scan.nextInt();
                int price = scan.nextInt();
                int people = scan.nextInt();
                stores+=1;
                max = Math.max(max,(price/stores)*people);
                
            }
            System.out.println(max);
        }
    }
}