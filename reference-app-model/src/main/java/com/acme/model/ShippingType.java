package com.acme.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ShippingType")
@XmlEnum
public enum ShippingType {

    @XmlEnumValue("Next Day - Overnight")
    NEXT_DAY_OVERNIGHT("Next Day - Overnight"),
    @XmlEnumValue("Expedited - 2-3 Business Days")
    EXPEDITED_2_3_BUSINESS_DAYS("Expedited - 2-3 Business Days"),
    @XmlEnumValue("Standard Ground - 5-7 Business Days")
    STANDARD_GROUND_5_7_BUSINESS_DAYS("Standard Ground - 5-7 Business Days");
    private final String value;

    ShippingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingType fromValue(String v) {
        for (ShippingType c : ShippingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
