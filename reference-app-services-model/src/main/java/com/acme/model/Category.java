package com.acme.model;

import org.springframework.core.style.ToStringCreator;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", propOrder = {
        "id",
        "categoryId",
        "name",
        "description"
})
@XmlRootElement(name = "Category",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class Category implements Serializable {
    private static final long serialVersionUID = -7454630869604964843L;

    @XmlElement(name = "Id", required = true)
    private long id;
    @XmlElement(name = "CategoryId", required = true)
    private String categoryId;
    @XmlElement(name = "Name", required = true)
    private String name;
    @XmlElement(name = "Description", required = true)
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
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

    @Override
    public String toString() {
        return new ToStringCreator(this).
                append("id", id).
                append("categoryId", categoryId).
                append("name", name).
                append("description", description).
                toString();
    }
}
