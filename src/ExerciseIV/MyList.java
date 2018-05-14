package ExerciseIV;

public class MyList {
    Node head = null;
    Node tail = null;
    int count;

    public void addFirst(Node newFirst){
        if(head != null){
            newFirst.setNext(head);
            head.setPrevious(newFirst);
        } else {
            tail = newFirst;
        }
        head = newFirst;
        count++;
    }

    public void addLast(Node newLast){
        if (tail != null){
            tail.setNext(newLast);
            newLast.setPrevious(tail);
        } else {
            head = newLast;
        }
        tail = newLast;
        count++;
    }

    public void remove(Node removeNode){
        Node currentNode = head;
        while (currentNode.getNext() != null || currentNode != null){
            if (currentNode.equals(removeNode)){
                swapNodes(currentNode);
                break;
            }
            currentNode = currentNode.getNext();
        }
    }

    public void swapNodes(Node currentNode){
        Node currPrevious = currentNode.getPrevious();
        Node currNext = currentNode.getNext();
        currPrevious.setNext(currNext);
        currNext.setPrevious(currPrevious);
        if (currPrevious == null){
            head = currNext;
        } else{
            currPrevious.setNext(currNext);
        }
        if (currNext == null){
            tail = currPrevious;
        } else {
            currNext.setPrevious(currPrevious);
        }
        count--;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

}
