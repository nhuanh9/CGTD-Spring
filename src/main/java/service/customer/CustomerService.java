package service.customer;


import model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    List<Customer> customerList = new ArrayList<>();

    public CustomerService() {
        customerList.add(new Customer(1L, "A", "B"));
        customerList.add(new Customer(2L, "B", "B"));
        customerList.add(new Customer(3L, "C", "B"));
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerList;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void remove(Long id) {

    }
}