//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 09:37:57 PM EST 
//


package org.cdisc.ns.odm.v121;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FormDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FormDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ArchiveLayout" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}FormDefElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FormDefAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FormDefAttributeExtension"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FormDef", propOrder = {
    "itemGroupRef",
    "archiveLayout"
})
public class ODMcomplexTypeDefinitionFormDef {

    @XmlElement(name = "ItemGroupRef", required = true)
    protected List<ODMcomplexTypeDefinitionItemGroupRef> itemGroupRef;
    @XmlElement(name = "ArchiveLayout")
    protected List<ODMcomplexTypeDefinitionArchiveLayout> archiveLayout;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Repeating", required = true)
    protected YesOrNo repeating;

    /**
     * Gets the value of the itemGroupRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemGroupRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemGroupRef> getItemGroupRef() {
        if (itemGroupRef == null) {
            itemGroupRef = new ArrayList<ODMcomplexTypeDefinitionItemGroupRef>();
        }
        return this.itemGroupRef;
    }

    /**
     * Gets the value of the archiveLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archiveLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchiveLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionArchiveLayout }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionArchiveLayout> getArchiveLayout() {
        if (archiveLayout == null) {
            archiveLayout = new ArrayList<ODMcomplexTypeDefinitionArchiveLayout>();
        }
        return this.archiveLayout;
    }

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the repeating property.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getRepeating() {
        return repeating;
    }

    /**
     * Sets the value of the repeating property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setRepeating(YesOrNo value) {
        this.repeating = value;
    }

}
