package model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catalog_id;

    @NotEmpty
    private String name;

    public Catalog() {
    }

    public Catalog(@NotEmpty String name) {
        this.name = name;
    }

    public Long getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(Long catalog_id) {
        this.catalog_id = catalog_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
