//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.05 at 12:24:05 AM EDT 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditPointType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EditPointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Monitoring"/&gt;
 *     &lt;enumeration value="DataManagement"/&gt;
 *     &lt;enumeration value="DBAudit"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
