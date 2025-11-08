public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void addFirst(int data) {
		
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		
		currNode.next=newNode;
		newNode.next=null;
	}
	
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		
		head=head.next;
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		
		
		//if only one node present
		if(head.next==null) {
			head=null;
			return;
		}
		
		
		
		Node secondLast=head;
		Node lastNode=head.next;
		
		while(lastNode.next!=null) {
			secondLast=secondLast.next;
			lastNode=lastNode.next;
		}
		
		secondLast.next=null;
		
	}
	
	public void display() {
		Node currNode=head;
		
		while(currNode!=null) {
			System.out.print(currNode.data+" ->");
			currNode=currNode.next;
		}
		System.out.println("NULL");
		
	}
	
	
public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.addFirst(2);
	list.addFirst(1);
	list.display();
	list.addLast(3);
	list.addLast(4);
	list.display();
	
	list.deleteFirst();
	list.display();
	
	list.deleteLast();
	list.display();
	
	
}
}
