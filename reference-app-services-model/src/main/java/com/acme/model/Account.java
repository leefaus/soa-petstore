package com.acme.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
        "accountId",
        "userName",
        "lastName",
        "firstName",
        "emailAddress",
        "homePhone",
        "cellPhone",
        "homeAddress",
        "creditCard"
})
@XmlRootElement(name = "Account",
        namespace = "http://pets.acme.com/schemas/jpetstore")
public class Account {

    @XmlElement(name = "AccountId", required = true)
    protected String accountId;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "EmailAddress", required = true)
    protected String emailAddress;
    @XmlElement(name = "HomePhone", required = true)
    protected String homePhone;
    @XmlElement(name = "CellPhone", required = false)
    protected String cellPhone;
    @XmlElement(name = "HomeAddress", required = true)
    protected Address homeAddress;
    @XmlElement(name = "CreditCard")
    protected List<CreditCard> creditCard;

    /**
     * Gets the value of the accountId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the userName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the homePhone property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the cellPhone property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets the value of the cellPhone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Gets the value of the homeAddress property.
     *
     * @return possible object is
     *         {@link Address }
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     *
     * @param value allowed object is
     *              {@link Address }
     */
    public void setHomeAddress(Address value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the creditCard property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCard property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCard().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCard }
     */
    public List<CreditCard> getCreditCard() {
        if (creditCard == null) {
            creditCard = new ArrayList<CreditCard>();
        }
        return this.creditCard;
    }

}
