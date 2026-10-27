package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name=name;
        this.customers=new ArrayList<>();
    }

    public Customer findCustomer(String name){
        for (int i=0; i<customers.size();i++){
            Customer customer=customers.get(i);
            if (customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(String name){
        Customer customer=findCustomer(name);
        if (customer==null){
            this.customers.add(new Customer(name));
        }
    }

    public void addTransaction(String name,double transaction){
        Customer customer=findCustomer(name);
        if (customer!=null){
            customer.addTransaction(transaction);
        }
    }

    public void printStatement(String customerName){
        Customer customer=findCustomer(customerName);
        if (customer==null){
            System.out.println("Customer not found");
        } else {
            System.out.println("Customer name : " + customer.getName());
            System.out.println("Transactions :");
            ArrayList<Double> transactions=customer.getTransactions();
            for (int i=0; i<transactions.size();i++){
                double amount=transactions.get(i);
                System.out.println(amount);
            }
        }
    }
}
