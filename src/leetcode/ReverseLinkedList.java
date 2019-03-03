package leetcode;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}
public class ReverseLinkedList {
	static ListNode res = new ListNode(0);
	static ListNode temp = res;
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode t = head;
		t.next = new ListNode(2);
		t= t.next;
		t.next = new ListNode(3);
		t= t.next;
		t.next = new ListNode(4);
		t= t.next;
		reverseList(head);
	}
	public static ListNode reverseList(ListNode head) {
        dfs(head);
        while(res!=null){
        	System.out.println(res.val);
        	res = res.next;
        }
        return res;
    }
	public static void dfs(ListNode head) {
		if(head==null) return;
		dfs(head.next);
		temp.next = new ListNode(head.val);
		temp =temp.next;
	}
}
