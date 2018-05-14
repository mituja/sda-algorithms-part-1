package ExerciseV;

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(21);
        Node node2 = new Node(34);
        Node node3 = new Node(25);
        Node node4 = new Node(45);

        MyStack stack = new MyStack();
        stack.pusch(node1);
        stack.pusch(node2);
        stack.pusch(node3);
        stack.pusch(node4);

        Node popNode = stack.pop();
    }
}
