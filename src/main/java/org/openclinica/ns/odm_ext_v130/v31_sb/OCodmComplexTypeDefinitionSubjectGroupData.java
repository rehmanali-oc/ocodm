//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.13 at 11:07:00 AM EDT 
//


package org.openclinica.ns.odm_ext_v130.v31_sb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-SubjectGroupData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-SubjectGroupData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}SubjectGroupDataElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}SubjectGroupDataAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-sb}SubjectGroupDataAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-SubjectGroupData")
public class OCodmComplexTypeDefinitionSubjectGroupData {

    @XmlAttribute(name = "StudyGroupClassID", required = true)
    protected String studyGroupClassID;
    @XmlAttribute(name = "StudyGroupClassName")
    protected String studyGroupClassName;
    @XmlAttribute(name = "StudyGroupName")
    protected String studyGroupName;

    /**
     * Gets the value of the studyGroupClassID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupClassID() {
        return studyGroupClassID;
    }

    /**
     * Sets the value of the studyGroupClassID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupClassID(String value) {
        this.studyGroupClassID = value;
    }

    /**
     * Gets the value of the studyGroupClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupClassName() {
        return studyGroupClassName;
    }

    /**
     * Sets the value of the studyGroupClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupClassName(String value) {
        this.studyGroupClassName = value;
    }

    /**
     * Gets the value of the studyGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupName() {
        return studyGroupName;
    }

    /**
     * Sets the value of the studyGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupName(String value) {
        this.studyGroupName = value;
    }

}
