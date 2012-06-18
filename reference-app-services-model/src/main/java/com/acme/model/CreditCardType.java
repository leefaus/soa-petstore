package com.acme.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CreditCardType")
@XmlEnum
public enum CreditCardType {

    VISA("VISA"),
    @XmlEnumValue("MasterCard")
    MASTER_CARD("MasterCard"),
    AMEX("AMEX"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    @XmlEnumValue("Diners Club")
    DINERS_CLUB("Diners Club");
    private final String value;

    CreditCardType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditCardType fromValue(String v) {
        for (CreditCardType c : CreditCardType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
