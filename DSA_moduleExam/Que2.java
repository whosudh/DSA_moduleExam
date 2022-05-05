import java.util.Scanner;
class Node{
	int data;
	Node next;
	
	 Node(int data){
		this.data = data;
		//this.next = null; Not required as default value of referenc variable is NULL
	} 
}

class Linkedlist{
	Node head;
	void create(int value){
		Node node = new Node(value);
		if(head == null){
			head = node;
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
	}
	
	
	void reverse(){
		reverse(head);
	}
	
	void reverse(Node head){
		if(head == null){
			return;
		}
		reverse(head.next);
		System.out.println(head.data +" ");
		}
	

	
	void display(){
		if(head == null)
		{
			System.out.print("Linked list is empty");
			return;
		}
		Node temp = head;
		while(temp !=null){
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
	
		class RlinkedList{
		public static void main(String...args){
		Linkedlist list = new Linkedlist();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in linked list");
		int n = sc.nextInt;
		System.out.print("Enter the data values of elements in linked list");
		int m = sc.nextInt;
		for(int i =0;i<n;i++){
			list.create(m);
		}
		System.out.print("Original list");
		list.display();
		System.out.print("Reversed list");
		list.reverse();
	}
	}