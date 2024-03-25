package northwindProject.demo.business.abstracts;

import northwindProject.demo.entities.concretes.Product;

import java.util.List;

public
interface ProductService {
    List<Product> getAll();
}
