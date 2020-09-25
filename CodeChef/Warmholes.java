import java.lang.*;
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] afsadr) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] str = new int[n];
        int[] end = new int[n];
        int[] v = new int[x];
        int[] w = new int[y];
        for(int i = 0; i < n ;i++) {
            str[i] = sc.nextInt();
            end[i] = sc.nextInt();    
        }
        for(int i = 0; i < x; i++)
            v[i] = sc.nextInt();
        for(int i = 0; i < y; i++)
            w[i] = sc.nextInt();
        Arrays.sort(v);
        Arrays.sort(w);
        int ans = w[y-1] - v[0]+1;
        for(int i = 0; i < n; i++) {
            int s = str[i];
            int e = end[i];
            if(s < v[0] || e > w[y-1]) 
                continue;
            int vd = Arrays.binarySearch(v, s);
            if(vd < 0) {
                vd = -(vd+1);
                vd--;
            }
            int ed = Arrays.binarySearch(w, e);
            if(ed < 0)
              ed = -(ed+1);
            ans = Math.min(ans, w[ed]-v[vd]+1);
        }
        System.out.println(ans);
        sc.close();
    }
}