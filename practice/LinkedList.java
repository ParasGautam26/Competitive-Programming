import java.lang.*;
import java.util.*;
import java.io.*;

public class LinkedList{
    
    Node head;
    
    class Node{
        int data; 
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    LinkedList(){
        head = null;
    }
    
    public void insertAtBeg(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    
    public void insertAtEnd(int data){
        if(head == null ){
            head = new Node(data);
            return;
        }
        
        Node last = head ;
        Node node  = new Node(data);
        while(last.next!=null){
            last = last.next; 
        }
        
        last.next = node;
        node.next = null;
    }
    
    public void printList(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();
    
        for(int i = 1 ; i <= 5 ; i++ ){
            list.insertAtEnd(i);
        }    
        
        for(int i = 6; i<=10;i++){
            list.insertAtBeg(i);
        }
        
        list.printList();
    }
}
