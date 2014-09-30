package Assignment1;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x){
		val=x;
		next=null;
	}
}
public class LinkedList {
	ListNode dummy=new ListNode(0);
	ListNode node=dummy;
	
	public void insert(int val){
		//insert from the end,too slow
	/*	node=dummy;
		while(node.next!=null){
			if(node.next.val==val)
				break;
			node=node.next;
		}
		node.next=new ListNode(val);*/
		
		
		//insert from the head
		node=dummy;
		while(node.next!=null){
			if(find(val))
				break;
			new ListNode(val).next=node;
			node=new ListNode(val);
			
		}
		node=new ListNode(val);
		}
	
	
	public boolean find(int val){
		node=dummy;
		while(node.next!=null){
			if(node.next.val==val){
				return true;
			}
			node=node.next;
		}
		return false;
	}
}
