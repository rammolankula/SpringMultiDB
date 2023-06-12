package ram.learn.customerrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ram.learn.model.customer.Customer;


@Repository
public interface Customerrepository extends JpaRepository<Customer,Integer> {

}
