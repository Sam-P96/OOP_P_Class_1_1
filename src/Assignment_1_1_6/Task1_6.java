package Assignment_1_1_6;

public class Task1_6 {
    public static void main(String[] args) {
        int runs = 3;

        for (int run = 1; run <= runs; run++) {
            System.out.println("Run " + run + ": ");

            ServicePoint servicePoint = new ServicePoint();
            Generator generator = new Generator();

            generator.generateCustomers(servicePoint, 5);
            servicePoint.serve();

            System.out.printf("Average service time: %.1f ms%n", servicePoint.getAverageServiceTime());
            System.out.println();
        }
    }
}