package Assignment_1_1_5;

public class Task1_5 {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        Generator generator = new Generator();

        generator.generateCustomers(servicePoint, 5);
        servicePoint.serve();
    }
}