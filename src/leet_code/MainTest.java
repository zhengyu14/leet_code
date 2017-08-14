package leet_code;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode ln = new RandomListNode(1);
		ln.next = new RandomListNode(2);
		ln.next.next = new RandomListNode(3);
		ln.next.next.next = new RandomListNode(4);
		
		ln.random = ln.next.next.next;
		ln.next.next.random = ln.next;
		
		CopyRandomList sol = new CopyRandomList();
		ln = sol.copyRandomList(ln);
		while (ln != null) {
			System.out.print(ln.data);
			ln = ln.next;
		}
	}

}
