package offer;

import java.util.HashMap;
import java.util.Map;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class N11208 {

	public static void main(String[] args) {
		
	}

	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
		Map<ListNode, ListNode> map = new HashMap<ListNode, ListNode>();
		ListNode pre = pHead;
		ListNode res = new ListNode(-1);
		while(pre.next.next!=null){
			if(map.containsKey(pre.next)){
				res.next = pre.next;
				break;
			}
			map.put(pre, pre.next);
			pre = pre.next;
		}
		return res.next;
    }
}
