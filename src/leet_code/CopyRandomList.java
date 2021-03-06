package leet_code;
//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
//Return a deep copy of the list.

import java.util.*;

public class CopyRandomList {
	public RandomListNode copyRandomList(RandomListNode head) {
		  if (head == null) return null;
		  
		  Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		  
		  // loop 1. copy all the nodes
		  RandomListNode node = head;
		  while (node != null) {
		    map.put(node, new RandomListNode(node.data));
		    node = node.next;
		  }
		  
		  // loop 2. assign next and random pointers
		  node = head;
		  while (node != null) {
		    map.get(node).next = map.get(node.next);
		    map.get(node).random = map.get(node.random);
		    node = node.next;
		  }
		  
		  return map.get(head);
		}
}
