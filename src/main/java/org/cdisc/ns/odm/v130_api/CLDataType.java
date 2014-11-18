//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 09:37:57 PM EST 
//


package org.cdisc.ns.odm.v130_api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CLDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CLDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="string"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CLDataType")
@XmlEnum
public enum CLDataType {

    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    CLDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CLDataType fromValue(String v) {
        for (CLDataType c: CLDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
