public class LengthOfLL {

	public static int length(LinkedListNode<Integer> head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
		return count;
	}
}
