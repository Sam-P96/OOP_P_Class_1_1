package Assignment_1_1_5;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer c = removeFromQueue();
            long serviceStart = System.currentTimeMillis();

            long sleepTime = (long) (Math.random() * 1000) + 500;

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            c.setEndTime(System.currentTimeMillis());

            long serviceTime = c.getEndTime() - serviceStart;
            long responseTime = c.getTimeSpent();

            System.out.println("Customer " + c.getId() + ". Response time: " + responseTime + " ms" + ". Service time: " + serviceTime + " ms");
        }
    }
}