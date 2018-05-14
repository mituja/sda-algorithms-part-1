package ExerciseIV;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(21);
        Node node2 = new Node(34);
        Node node3 = new Node(25);
        Node node4 = new Node(18);

//        node1.setNext(node2);
//        node2.setPrevious(node1);
//
//        node2.setNext(node3);
//        node3.setPrevious(node2);

        MyList myList = new MyList();
        myList.addFirst(node1);
        myList.addFirst(node2);
        myList.addFirst(node3);
        myList.addLast(node4);
        myList.remove(node2);
    }
}
