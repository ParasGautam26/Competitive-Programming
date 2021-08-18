import java.lang.*;
import java.util.*;
import java.io.*;

public class LinkList{
    
    Node head;
    
    class Node{
        int data; 
        Node next;
        
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    
    LinkList(){
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
    
    public int printLength(){
        Node node  = head;
        int l =0;
        while(node!=null){
            l++;
            node = node.next;
        }
        return l;
    }
    
    
    public int recursion(Node node){
        if(node == null){
            return 0;
        }
        return 1 + recursion(node.next);
    }
    
    public int printLengthRec(){
        return recursion(head);
    }
    
    public void reverseList(){
        Node curr = head, prev = null, next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        LinkList list = new LinkList();
    
        for(int i = 1 ; i <= 5 ; i++ ){
            list.insertAtEnd(i);
        }    
        
        for(int i = 6; i<=10;i++){
            list.insertAtBeg(i);
        }
        
        list.printList();
        System.out.println("");
        System.out.println(list.printLength());
        System.out.println(list.printLengthRec());
        
        list.reverseList();
        
        list.printList();
        System.out.println("");
        
    }
}
