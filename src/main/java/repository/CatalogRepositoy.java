package repository;

import model.Catalog;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CatalogRepositoy extends PagingAndSortingRepository <Catalog, Long> {
}
