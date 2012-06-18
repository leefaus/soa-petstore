package com.acme.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCard", propOrder = {
        "creditCardId",
        "type",
        "number",
        "expiration",
        "billingAddress"
})
@XmlRootElement(name = "CreditCard",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class CreditCard {

    @XmlElement(name = "CreditCardId", required = true)
    protected String creditCardId;
    @XmlElement(name = "Type", required = true)
    protected CreditCardType type;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "Expiration", required = true)
    protected String expiration;
    @XmlElement(name = "BillingAddress", required = true)
    protected Address billingAddress;

    /**
     * Gets the value of the creditCardId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCreditCardId() {
        return creditCardId;
    }

    /**
     * Sets the value of the creditCardId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreditCardId(String value) {
        this.creditCardId = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link CreditCardType }
     */
    public CreditCardType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link CreditCardType }
     */
    public void setType(CreditCardType value) {
        this.type = value;
    }

    /**
     * Gets the value of the number property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the expiration property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExpiration(String value) {
        this.expiration = value;
    }

    /**
     * Gets the value of the billingAddress property.
     *
     * @return possible object is
     *         {@link Address }
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     *
     * @param value allowed object is
     *              {@link Address }
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

}
