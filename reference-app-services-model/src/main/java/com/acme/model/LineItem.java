package com.acme.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItem", propOrder = {
        "orderId",
        "quantity",
        "unitPrice",
        "item"
})
@XmlRootElement(name = "LineItem",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class LineItem {

    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "Quantity", required = true)
    protected BigInteger quantity;
    @XmlElement(name = "UnitPrice", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "Item", required = true)
    protected Item item;

    /**
     * Gets the value of the orderId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOrderId(String value) {
        this.orderId = value;
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
     * Gets the value of the unitPrice property.
     *
     * @return possible object is
     *         {@link BigDecimal }
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the item property.
     *
     * @return possible object is
     *         {@link Item }
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value allowed object is
     *              {@link Item }
     */
    public void setItem(Item value) {
        this.item = value;
    }

}
