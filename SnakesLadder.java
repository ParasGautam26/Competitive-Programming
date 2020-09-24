import java.lang.*;
import java.io.*;
import java.util.*;

public class SnakesLadder {
    
    static class quentry{
        int v;      // vertex
        int dist;   // distance of the vertex from the source
    }
    
    public static int getMinDiceThrows(int[] moves,int n){
        
        int[] visited = new visited[n];
        Queue<quentry> queue = new LinkedList<>();
        quentry qe = new quentry();
        qe.v = 0;
        qe.dist = 0;
        
        visited[0]=1;
        queue.add(qe);
        
        while(!queue.isEmpty()){
             qe = queue.remove();
             int v = qe.v;
             
             if(v==n-1){
                 break;
             }
             for(int j = v+1 ; j<=(v+6) && j<n;j++){
                 if(visited[j]==0){
                     quentry a = new quentry();
                     a.dist = qe.dist+1;
                     visited[j] = 1;
                     
                     if(move[j]!=-1){
                         a.v = move[j];
                     }
                     else{
                         a.v = j;
                     }
                     q.add(a);
                 }
             }
             return qe.dist;
        }
    }
    public static void main(String args[]) {
        int n = 30;
        int[] moves = new int[n];
        Arrays.fill(moves,-1);
        // Ladders
        moves[2] = 21;
        moves[4] = 7; 
        moves[10] = 25;
        moves[19] = 28;
        
        //Snakes 
        moves[26] =0 ;
        moves[20] =8 ;
        moves[16] =3 ;
        moves[18] =6 ;
        
        System.out.println(getMinDiceThrows(moves,n));
    }
}