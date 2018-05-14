//Zamiana liczb w systemie dziesiętnym na binarne

package ExerciseVI;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        decimal12Binary(number);
    }

    public static void decimal12Binary(int number) {
        Stack stack = new Stack();
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
