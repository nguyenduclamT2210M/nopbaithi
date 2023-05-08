package com.baithi;

import com.baithi.Customer;

public class MainClass {
    public static void main(String[] args) {
        com.baithi.Customer customer = new Customer();

        try {
            customer.inputData();
        } catch (Exception var3) {
            System.out.println(var3.getMessage());
        }
    }
}
