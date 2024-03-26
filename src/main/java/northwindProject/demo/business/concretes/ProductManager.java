package northwindProject.demo.business.concretes;

import java.util.List;

import northwindProject.demo.dataAccess.abstracts.ProductDao;
import org.springframework.stereotype.Service;

import northwindProject.demo.business.abstracts.ProductService;
import northwindProject.demo.entities.concretes.Product;

@Service
public
class ProductManager implements ProductService {
    private
    ProductDao productDao;

    public
    ProductManager ( ProductDao productDao ) {
        this.productDao = productDao;
    }

    @Override
    public
    List<Product> getAll () {
        return productDao.findAll ( );
    }
}
