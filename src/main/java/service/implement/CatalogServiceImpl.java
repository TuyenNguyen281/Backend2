package service.implement;

import model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import repository.CatalogRepositoy;
import service.CatalogService;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogRepositoy catalogRepositoy;


    @Override
    public Page<Catalog> findAll(Pageable pageable) {
        return catalogRepositoy.findAll(pageable);
    }

    @Override
    public Optional<Catalog> findById(Long id) {
        return catalogRepositoy.findById(id);
    }

    @Override
    public void saveCatalog(Catalog catalog) {
        catalogRepositoy.save(catalog);
    }

    @Override
    public void removeCatalog(Long id) {
        catalogRepositoy.deleteById(id);

    }
}
