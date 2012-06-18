package com.acme.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
        "orderId",
        "account",
        "payment",
        "shippingMethod",
        "status",
        "totalPrice",
        "lineItem"
})
@XmlRootElement(name = "Order",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class Order {

    @XmlElement(name = "OrderId", required = true)
    protected String orderId;
    @XmlElement(name = "Account", required = true)
    protected Account account;
    @XmlElement(name = "Payment", required = true)
    protected CreditCard payment;
    @XmlElement(name = "ShippingMethod", required = true)
    protected ShippingType shippingMethod;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "TotalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "LineItem", required = true)
    protected List<LineItem> lineItem;

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
     * Gets the value of the account property.
     *
     * @return possible object is
     *         {@link Account }
     */
    public Account getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     *
     * @param value allowed object is
     *              {@link Account }
     */
    public void setAccount(Account value) {
        this.account = value;
    }

    /**
     * Gets the value of the payment property.
     *
     * @return possible object is
     *         {@link CreditCard }
     */
    public CreditCard getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     *
     * @param value allowed object is
     *              {@link CreditCard }
     */
    public void setPayment(CreditCard value) {
        this.payment = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     *
     * @return possible object is
     *         {@link ShippingType }
     */
    public ShippingType getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     *
     * @param value allowed object is
     *              {@link ShippingType }
     */
    public void setShippingMethod(ShippingType value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     *         {@link StatusType }
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link StatusType }
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the totalPrice property.
     *
     * @return possible object is
     *         {@link BigDecimal }
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the lineItem property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItem property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItem().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem }
     */
    public List<LineItem> getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList<LineItem>();
        }
        return this.lineItem;
    }

}
