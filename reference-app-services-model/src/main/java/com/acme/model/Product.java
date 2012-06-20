package com.acme.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
        "productId",
        "category",
        "name",
        "description"
})
@XmlRootElement(name = "Product",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class Product {
    @XmlElement(name = "ProductId", required = true)
    private String productId;
    @XmlElement(name = "Category", required = true)
    private Category category;
    @XmlElement(name = "Name", required = true)
    private String name;
    @XmlElement(name = "Description", required = true)
    private String description;

    public Product() {
    }

    public Product(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
