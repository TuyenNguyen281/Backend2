package model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;


@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;

    @ManyToOne
    @JoinColumn(name = "Catalog_id")
    private Catalog catalog;

    @NotEmpty
    @Column(name = "Name")
    private String name;

    @NotEmpty
    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "Discount")
    private String discount;

    @Column(name = "Image_link")
    private String image_link;

    @Column(name = "View")
    private int view;

    public Product() {
    }

    public Product(Long product_id, Catalog catalog, @NotEmpty String name, @NotEmpty BigDecimal price, String discount, String image_link, int view) {
        this.product_id = product_id;
        this.catalog = catalog;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.image_link = image_link;
        this.view = view;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
