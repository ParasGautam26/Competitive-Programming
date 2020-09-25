import java.lang.*;
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scan.nextInt();
            }
            int[] flav = new int[k+1];
            int l=0,r=0,max=0,dist_flav=0;
            
            
            while(r<n){
                if(dist_flav<k){
                    flav[a[r]]++;
                    if(flav[a[r]]==1){
                        dist_flav++;
                    }
                    r++;
                }
                else{
                    flav[a[l]]--;
                    if(flav[a[l]]==0){
                        dist_flav--;
                    }
                    l++;
                }
                if(dist_flav<k){
                    max = ((r-l)>max)?(r-l):max;
                }
            }
            System.out.println(max);
        }
    }
}