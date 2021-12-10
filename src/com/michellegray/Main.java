package com.michellegray;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bank = new BankAccount();
//                (12345, 300.00, "Michelle Gray",
//                "Shelley@gmail.com", "01234222333");


        System.out.println(bank.getCustomerName());
        bank.depositFunds(500.00);
        System.out.println(bank.getBalance());
        bank.withdrawFunds(250.00);
        System.out.println(bank.getBalance());
        bank.withdrawFunds(500.00);
        System.out.println(bank.getBalance());
        System.out.println(bank.getCustomerPhoneNumber());

        VipCustomer me = new VipCustomer();

        System.out.println(me.getName());
        System.out.println(me.getCreditLimit());
        System.out.println(me.getEmailAddress());

        VipCustomer customer2 = new VipCustomer("Captain Jack", 20.00);

        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("Thor - God of Thunder", 200.00, "Thor@avengersTower.com");
        System.out.println(customer3.getEmailAddress());
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
    }
}
