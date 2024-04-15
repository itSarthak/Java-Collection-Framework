import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        //Adding objects/elements from the last
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.pollLast(); //Deleting from the last, acting as an Queue

        dq.pollFirst(); //deleting from the front, acting as a stack
    }
}