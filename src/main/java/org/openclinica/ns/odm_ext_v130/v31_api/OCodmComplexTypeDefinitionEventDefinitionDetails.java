//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.13 at 11:07:00 AM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-EventDefinitionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-EventDefinitionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}EventDefinitionDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}EventDefinitionDetailsAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}EventDefinitionDetailsAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-EventDefinitionDetails", propOrder = {
    "description",
    "category"
})
public class OCodmComplexTypeDefinitionEventDefinitionDetails {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Category")
    protected String category;
    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the studyEventOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventOID() {
        return studyEventOID;
    }

    /**
     * Sets the value of the studyEventOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventOID(String value) {
        this.studyEventOID = value;
    }

}
