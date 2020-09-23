package LinkedList;
public class SingleLinkedList {
	class Node{
		int data;
		Node next;

		public Node(int data){
			this.data=data;		
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addNode(int data) {
		if(head==null) {
			head = new Node(data);
			tail=head;
		}else {
			tail.next=new Node(data);
			tail = tail.next;
		}
	}
	public void printList() {
		Node print=head;
		while(print!=null) {
			System.out.println(print.data);
			print=print.next;
		}
	}
	public int search(int data) {
		Node print=head;
		while(print!=null) {
			if(print.data==data) {
				return 1;
			}
			print=print.next;
		}
		return 0;
	}
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.printList();
		singleLinkedList.addNode(1);
		singleLinkedList.addNode(2);
		singleLinkedList.addNode(3);
		singleLinkedList.addNode(4);
		singleLinkedList.printList();
		System.out.println(singleLinkedList.search(2)==1?"Found":"Not Found");
		System.out.println(singleLinkedList.search(5)==1?"Found":"Not Found");
	}
}
