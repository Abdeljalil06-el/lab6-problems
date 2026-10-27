package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank("My Bank");

        bank.addCustomer("Salma");
        bank.addCustomer("Youssef");
        bank.addCustomer("Salma"); 

        bank.addTransaction("Salma", 500.0);
        bank.addTransaction("Salma", -120.5);
        bank.addTransaction("Youssef", 1000.0);
        bank.addTransaction("Youssef", -300.0);
        bank.addTransaction("Omar", 50.0); 

        Customer customer=bank.findCustomer("Youssef");
        System.out.println("Found : " + customer.getName());
        System.out.println();

        bank.printStatement("Salma");
        System.out.println();
        bank.printStatement("Youssef");
        System.out.println();
        bank.printStatement("Omar");
    }
}