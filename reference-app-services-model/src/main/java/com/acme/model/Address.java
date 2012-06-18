package com.acme.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
        "addressId",
        "street1",
        "street2",
        "city",
        "state",
        "zipCode",
        "country"
})
@XmlRootElement(name = "Address",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class Address {

    @XmlElement(name = "AddressId", required = true)
    protected String addressId;
    @XmlElement(name = "Street1", required = true)
    protected String street1;
    @XmlElement(name = "Street2", required = false)
    protected String street2;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "ZipCode", required = true)
    protected String zipCode;
    @XmlElement(name = "Country", required = true)
    protected String country;

    /**
     * Gets the value of the addressId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the street1 property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the street2 property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * Sets the value of the street2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipCode property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountry(String value) {
        this.country = value;
    }

}
