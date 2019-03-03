package leetcode;

public class AddTwoNumbers {

	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } }
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(5);
//		ListNode l2 = new ListNode(4);
//		l1.next = l2;
//		ListNode l3 = new ListNode(5);
//		l2.next = l3;
		ListNode n1 = new ListNode(5);
//		ListNode n2 = new ListNode(9);
//		n1.next = n2;
//		ListNode n3 = new ListNode(3);
//		n2.next = n3;
		ListNode l = addTwoNumbers(l1, n1);
		while (l != null) {
			System.out.print(l.val );
			l = l.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int a = l1.val + l2.val;
		// System.out.println(a);
		l1 = l1.next;
		l2 = l2.next;
		ListNode l = new ListNode(a % 10);
		ListNode r = l;
		a /= 10;
		while (l1 != null || l2 != null) {
			if(l1 !=null && l2!=null){
				a += l1.val + l2.val;
				// System.out.println(l.val);
				ListNode t = new ListNode(a % 10);
				r.next = t;
				r = t;
				l1 = l1.next;
				l2 = l2.next;
				a /= 10;
			}
			else if(l1 !=null){
				if (a == 1) {
					l1.val +=a;
					a = l1.val /10;
					l1.val %=10;
				}
				r.next = l1;
				r=l1;
				l1 = l1.next;
			}
			else if(l2!=null){
				if (a == 1) {
					l2.val +=a;
					a = l2.val /10;
					l2.val %=10;
				}
				r.next = l2;
				r = l2;
				l2 = l2.next;
			}		
		}
		if(a == 1){
			r.next = new ListNode(a);
		}
		return l;
	}
	
}
