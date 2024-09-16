package client;

import travel_agency.domain.Customer;
import travel_agency.domain.Tour;
import travel_agency.repository.CustomerRepository;
import travel_agency.repository.CustomerRepositoryImpl;
import travel_agency.repository.TourRepository;
import travel_agency.repository.TourRepositoryImpl;

import java.util.ArrayList;
import java.util.List;


public class Client {

    public static void main(String[] args) {

        TourRepository repository = new TourRepositoryImpl();
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
//        repository.save(new Tour(true, "Ukraine", "Odessa", "walk", 3200, 7));
//        repository.save(new Tour(true, "Ukraine", "Nikolaev", "walk", 1200, 10));
//        repository.save(new Tour(true, "Ukraine", "Charkiv", "walk", 2200, 8));
//        repository.save(new Tour(true, "Ukraine", "Cherkasy", "walk", 2200, 12));

          customerRepository.save(new Customer(true, "Julia", new ArrayList<>()));
        //   customerRepository.findAll().forEach(System.out::println);
       // Customer customer1 = new Customer(true, "Jack", new ArrayList<>());
      //  Customer customer2 = new Customer(true, "Jack", new ArrayList<>());
      //  Customer customer3 = new Customer(true, "Jack", new ArrayList<>());

        // customerRepository.save(customer1);
        // customerRepository.save(customer2);
        // customerRepository.save(customer3);
        customerRepository.findAll().forEach(System.out::println);

        List<Tour> tours = repository.findAll();


        tours.forEach(System.out::println);



    }


}
