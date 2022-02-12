public class DeleteNode {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        LinkedListNode<Integer> prev=head;
		if(pos==0){
            if(head!=null){
                head=head.next;
            }
            
        }else{
            int i=0;
            while(i<pos-1 && prev!=null){
                prev=prev.next;
                i++;
            }
            if(prev!=null && prev.next!=null ){
                 prev.next=prev.next.next; 
            }
            
        }
        return head;
	}
}
