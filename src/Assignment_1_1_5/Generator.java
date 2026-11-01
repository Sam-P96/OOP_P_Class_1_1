package Assignment_1_1_5;

public class Generator {

    public void generateCustomers(ServicePoint servicePoint, int count) {
        for (int i = 0; i < count; i++) {
            Customer c = new Customer();
            c.setStartTime(System.currentTimeMillis());
            servicePoint.addToQueue(c);
        }
    }
}