package Assignment_1_1_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Interface_1_1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean onOff = true;

        while (onOff) {

            System.out.println("Select 1: Queue ");
            System.out.println("Select 2: De-Queue ");
            System.out.println("Select 3: Exit");
            System.out.printf("Select Task: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("You selected queue");
                Customer c = new Customer();
                c.setStartTime(System.nanoTime());
                queue.addFirst(c);
                System.out.println("Que size: " + queue.size());

            } else if (choice.equals("2")) {
                System.out.println("You selected dequeue");
                if (queue.isEmpty()) {
                    System.out.println("The queue is empty.");
                } else {
                    Customer removed = queue.removeLast();
                    removed.setEndTime(System.nanoTime());
                    long ns = removed.getTimeSpent();
                    System.out.println(removed.getId() + " was removed from the queue. Time in queue: " + ns + " ns (" + (ns / 1_000_000) + " ms)");
                }
            } else if (choice.equals("3")) {
                System.out.println("EXIT SELECTED");
                onOff = false;
            } else {
                System.out.println("Please retry, you selected: " + choice);

        }

        }
    }
}
