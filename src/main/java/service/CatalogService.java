package service;

import model.Catalog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface CatalogService {

    Page<Catalog> findAll(Pageable pageable);
    Optional<Catalog> findById(Long id);
    void saveCatalog(Catalog catalog);
    void removeCatalog(Long id);
}
