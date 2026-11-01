package Assignment_1_1_6;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int customersServed = 0;

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

            totalServiceTime += serviceTime;
            customersServed++;

            System.out.println("Customer " + c.getId() + ". Response time: " + responseTime + " ms" + ". Service time: " + serviceTime + " ms");
        }
    }

    public double getAverageServiceTime() {
        if (customersServed == 0) {
            return 0;
        } else {
            return (double) totalServiceTime / customersServed;
        }
    }
}