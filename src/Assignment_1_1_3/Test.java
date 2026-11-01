package Assignment_1_1_3;

public class Test {
    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setStartTime(100);
        c1.setEndTime(250);

        Customer c2 = new Customer();
        c2.setStartTime(300);
        c2.setEndTime(420);

        System.out.println("Customer " + c1.getId() + " spent " + c1.getTimeSpent());
        System.out.println("Customer " + c2.getId() + " spent " + c2.getTimeSpent());
    }
}