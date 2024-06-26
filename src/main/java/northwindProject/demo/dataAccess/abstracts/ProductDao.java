package northwindProject.demo.dataAccess.abstracts;

import northwindProject.demo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface ProductDao extends JpaRepository<Product, Integer> {
}
