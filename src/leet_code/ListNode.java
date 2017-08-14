package leet_code;

public class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode ( int data ) {
		this.data = data;
		this.next = null;
	}
	
	public int getData()
    {
        return data;
    }

    public void setData(int d)
    {
        data = d;
    }

    public ListNode getNext()
    {
        return next;
    }

    public void setNext(ListNode n)
    {
        next = n;
    }
}
