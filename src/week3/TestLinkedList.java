package week3;


public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList s = new LinkedList();
		System.out.println(s);
		System.out.println();

		s.addToTail (42);
		System.out.println(s);
		System.out.println();
		s.addToTail ('n');
		System.out.println(s);
		System.out.println();
		s.addToTail ("hello");
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
			System.out.println();
		}

		s.addToHead (42);
		System.out.println(s);
		System.out.println();
		s.addToHead ('n');
		System.out.println(s);
		System.out.println();
		s.addToHead ("hello");
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromTail());
			System.out.println(s);
			System.out.println();
		}
	}
} // class TestLinkedList