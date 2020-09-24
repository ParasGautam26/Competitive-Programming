import java.lang.*;
import java.io.*;
import java.util.*;
class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int n = scan.nextInt();
            if(n==42){
                break;
            }
            System.out.println(n);
        }
    }
}