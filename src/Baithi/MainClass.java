package Baithi;

public class MainClass {
    public static void main(String[] args) {
        Customer customer = new Customer();

        try {
            customer.inputData();
        } catch (Exception var3) {
            System.out.println(var3.getMessage());
        }
    }
}
