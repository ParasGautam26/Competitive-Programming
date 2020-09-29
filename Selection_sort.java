import java.lang.*;
import java.util.*;
import java.io.*;

public class Selection_sort {
    public static void sort(int[] a,int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j = i+1 ; j<n;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp  = a[min];
            a[min] =a[i];
            a[i] = temp;
        }
    }    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        
        sort(a,n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}