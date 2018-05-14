package ExerciseV;

public class MyStack {
    Node head;
    int count;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void pusch(Node node) {
        if (head != null) {
            node.setNext(head);
        }
        head = node;
        count++;
    }

    public Node pop() {
        if (this.head != null) {
            Node currentTop = this.head;
            head = currentTop.getNext();
            count--;
            return currentTop;
        }
        return null;
    }

}
