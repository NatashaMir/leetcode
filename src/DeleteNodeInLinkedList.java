
public class DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {

        ListNode nextNode = node.next;

        node.next = nextNode.next;

        node.val = nextNode.val;

        return;

    }
}
