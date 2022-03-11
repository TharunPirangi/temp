package javaassignments.assignment10;

public class Node <T> {
    T data;
    Node next;
    Node(T data,Node next){
        this.data=data;
        this.next=next;
    }
    public String toString(){
        if(data!=null){
            return data.toString();
        }
        return null;
    }
}