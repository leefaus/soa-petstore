package com.acme.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
        "itemId",
        "product",
        "listPrice",
        "unitCost",
        "supplier",
        "quantity",
        "status",
        "attributes"
})
@XmlRootElement(name = "Item",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class Item {

    @XmlElement(name = "ItemId", required = true)
    protected String itemId;
    @XmlElement(name = "Product", required = true)
    protected Product product;
    @XmlElement(name = "ListPrice", required = true)
    protected BigDecimal listPrice;
    @XmlElement(name = "UnitCost", required = true)
    protected BigDecimal unitCost;
    @XmlElement(name = "Supplier", required = true)
    protected Supplier supplier;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Attributes")
    protected List<String> attributes;

    /**
     * Gets the value of the itemId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the product property.
     *
     * @return possible object is
     *         {@link Product }
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     *
     * @param value allowed object is
     *              {@link Product }
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the listPrice property.
     *
     * @return possible object is
     *         {@link BigDecimal }
     */
    public BigDecimal getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setListPrice(BigDecimal value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the unitCost property.
     *
     * @return possible object is
     *         {@link BigDecimal }
     */
    public BigDecimal getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setUnitCost(BigDecimal value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the supplier property.
     *
     * @return possible object is
     *         {@link Supplier }
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     *
     * @param value allowed object is
     *              {@link Supplier }
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the quantity property.
     *
     * @return possible object is
     *         {@link BigInteger }
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the attributes property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<String>();
        }
        return this.attributes;
    }

}
