package leet_code;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(2);
		ln.next.next = new ListNode(3);
		
		ReverseLinkedList sol = new ReverseLinkedList();
		ln = sol.reverse(ln);
		while (ln != null) {
			System.out.print(ln.data);
			ln = ln.next;
		}
	}

}
