package linkedList;

public class run {
	public static void main(String[] args) {
		Person p1 = new Person("nguyen van a", 18);
		Person p2 = new Person("nguyen van b", 19);
		Person p3 = new Person("nguyen van c", 20);
		Person p4 = new Person("nguyen van d", 21);
		Person p5 = new Person("nguyen van e", 22);
		
		Node<Person> node1 = new Node<Person>();
		node1.setData(p1);
		Node<Person> node2 = new Node<Person>();
		node2.setData(p2);
		Node<Person> node3 = new Node<Person>();
		node3.setData(p3);
		Node<Person> node4 = new Node<Person>();
		node4.setData(p4);
		Node<Person> node5 = new Node<Person>();
		node5.setData(p5);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);

		Node<Person> head = node1;
		while(true) {
			System.out.println(head.getData());
			head = head.getNext();
			if(head == null) break;
		}
	}
}
