package leet_code;

public class ReverseLinkedList {
	public ListNode reverse ( ListNode head) {
		ListNode resultHead = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = resultHead;
			resultHead = head;
			head = next;
		}
		return resultHead;
	}
}
