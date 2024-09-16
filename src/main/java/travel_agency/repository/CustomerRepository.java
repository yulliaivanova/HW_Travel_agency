package travel_agency.repository;

import travel_agency.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    // Клиент:
    //Сохранение клиента
    //Получение списка клиентов
    //Получение клиента по ID
    //Изменение клиента
    //Логическое удаление клиента

    Customer save (Customer customer);
    List<Customer> findAll();
    Customer findById(long id);
    void update (long id, String name);
    void  deleteById(long id);


}


