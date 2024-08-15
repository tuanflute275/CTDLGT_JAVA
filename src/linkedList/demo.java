package service.perso.util;

public class demo {
	public static class Node {
		private int val;
		private Node next;
		public Node(int val) {
			this.val = val;
		}
	}
	
	public static void printLinkedList(Node head) {
		if(head == null) {
			System.out.println("List empty !");
		}else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.val);
				temp = temp.next;
				if(temp != null) {
					System.out.print("->");
				}else {
					System.out.println();
				}
			}
		}
	}
	
	public static Node addToHead(Node headNode, int value) {
		Node newNode = new Node(value);
		if(headNode != null) {
			newNode.next = headNode;
		}
		return newNode;
	}
	
	public static Node addToTail(Node headNode, int value) {
		Node newNode = new Node(value);
		if(headNode == null) {
			return newNode;
		}else {
			Node lastNode = headNode;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		return headNode;
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		
		n1.next = n2;
		n2.next = n3;
		
		printLinkedList(n1);
		n1 = addToHead(n1, 0);
		n1 = addToTail(n1, 4);
		printLinkedList(n1);
		System.out.println("done");
	}
}
