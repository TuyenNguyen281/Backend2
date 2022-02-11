package service;

import model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);
    Optional<Product> findById(Long id);
    void saveProduct(Product product);
    void removeProduct(Long id);
}
