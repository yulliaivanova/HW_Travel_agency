package client;

import travel_agency.domain.Customer;
import travel_agency.domain.Tour;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        Tour tour = new Tour();


        Customer customer = new Customer(true, "Anna ", new ArrayList<>());
        System.out.println(customer);
    }



}
