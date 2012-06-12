package com.acme.model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supplier", propOrder = {
        "supplierId",
        "supplierName"
})
@XmlRootElement(name = "Supplier",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class Supplier {

    @XmlElement(name = "SupplierId", required = true)
    protected String supplierId;
    @XmlElement(name = "SupplierName", required = true)
    protected String supplierName;

    /**
     * Gets the value of the supplierId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSupplierId(String value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the supplierName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSupplierName(String value) {
        this.supplierName = value;
    }

}
