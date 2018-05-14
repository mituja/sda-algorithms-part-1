package ExerciseVII;

public class MyQueue {
    Node head;
    Node tail;
    int count;

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add(Node node) {
        if (tail != null) {
            node.setNext(tail);
        } else{
            head = node;
        }
        tail = node;
        count++;
    }

    public Node remove(){
        Node currentNode = tail.getNext();
        while (currentNode != null){
            if (currentNode.getNext().getNext() == null){
                currentNode.setNext(null);
                return currentNode.getNext();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }
}
