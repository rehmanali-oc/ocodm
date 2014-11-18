//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 09:37:57 PM EST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EditPointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Monitoring"/>
 *     &lt;enumeration value="DataManagement"/>
 *     &lt;enumeration value="DBAudit"/>
 *     &lt;maxLength value="14"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EditPointType")
@XmlEnum
public enum EditPointType {

    @XmlEnumValue("Monitoring")
    MONITORING("Monitoring"),
    @XmlEnumValue("DataManagement")
    DATA_MANAGEMENT("DataManagement"),
    @XmlEnumValue("DBAudit")
    DB_AUDIT("DBAudit");
    private final String value;

    EditPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EditPointType fromValue(String v) {
        for (EditPointType c: EditPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
