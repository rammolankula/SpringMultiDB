package ram.learn.productrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ram.learn.model.product.Product;

@Repository
public interface Productrepository extends JpaRepository<Product,Integer>{

}
