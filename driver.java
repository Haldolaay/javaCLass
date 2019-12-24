import java.util.*;

class node{
	int data;
	node next;
	public node(int data){this.data = data;}
}
class LinkedList{
	node root;
	node next;
	public static void main(String[]args){
		LinkedList ll = new LinkedList();
		ll.addnode(4);
		ll.addnode(3);
		ll.printNode(ll);
		
	}
	public void addnode(int data){
		node n = new node(data);
		if (this.root == null){
			this.root = n;
		}else {
			this.root.next = n;
			n.next = root.next;
		}
	}
	public void printNode(LinkedList ll){
		while( ll.next != null){
			System.out.println(ll.next.data);
			ll.next = ll.next.next;
		}
	}
}