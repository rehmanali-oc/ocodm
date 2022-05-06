//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.05 at 12:24:05 AM EDT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ODMcomplexTypeDefinition-Signature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Signature"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}UserRef"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}LocationRef"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}SignatureRef"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}DateTimeStamp"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}CryptoBindingManifest" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}SignatureElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SignatureAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SignatureAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Signature", propOrder = {
    "userRef",
    "locationRef",
    "signatureRef",
    "dateTimeStamp",
    "cryptoBindingManifest"
})
public class ODMcomplexTypeDefinitionSignature
    implements Serializable
{

    @XmlElement(name = "UserRef", required = true)
    protected ODMcomplexTypeDefinitionUserRef userRef;
    @XmlElement(name = "LocationRef", required = true)
    protected ODMcomplexTypeDefinitionLocationRef locationRef;
    @XmlElement(name = "SignatureRef", required = true)
    protected ODMcomplexTypeDefinitionSignatureRef signatureRef;
    @XmlElement(name = "DateTimeStamp", required = true)
    protected ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp;
    @XmlElement(name = "CryptoBindingManifest")
    protected ODMcomplexTypeDefinitionCryptoBindingManifest cryptoBindingManifest;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the userRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public ODMcomplexTypeDefinitionUserRef getUserRef() {
        return userRef;
    }

    /**
     * Sets the value of the userRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public void setUserRef(ODMcomplexTypeDefinitionUserRef value) {
        this.userRef = value;
    }

    public boolean isSetUserRef() {
        return (this.userRef!= null);
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public ODMcomplexTypeDefinitionLocationRef getLocationRef() {
        return locationRef;
    }

    /**
     * Sets the value of the locationRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public void setLocationRef(ODMcomplexTypeDefinitionLocationRef value) {
        this.locationRef = value;
    }

    public boolean isSetLocationRef() {
        return (this.locationRef!= null);
    }

    /**
     * Gets the value of the signatureRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignatureRef }
     *     
     */
    public ODMcomplexTypeDefinitionSignatureRef getSignatureRef() {
        return signatureRef;
    }

    /**
     * Sets the value of the signatureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignatureRef }
     *     
     */
    public void setSignatureRef(ODMcomplexTypeDefinitionSignatureRef value) {
        this.signatureRef = value;
    }

    public boolean isSetSignatureRef() {
        return (this.signatureRef!= null);
    }

    /**
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public ODMcomplexTypeDefinitionDateTimeStamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public void setDateTimeStamp(ODMcomplexTypeDefinitionDateTimeStamp value) {
        this.dateTimeStamp = value;
    }

    public boolean isSetDateTimeStamp() {
        return (this.dateTimeStamp!= null);
    }

    /**
     * Gets the value of the cryptoBindingManifest property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionCryptoBindingManifest }
     *     
     */
    public ODMcomplexTypeDefinitionCryptoBindingManifest getCryptoBindingManifest() {
        return cryptoBindingManifest;
    }

    /**
     * Sets the value of the cryptoBindingManifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionCryptoBindingManifest }
     *     
     */
    public void setCryptoBindingManifest(ODMcomplexTypeDefinitionCryptoBindingManifest value) {
        this.cryptoBindingManifest = value;
    }

    public boolean isSetCryptoBindingManifest() {
        return (this.cryptoBindingManifest!= null);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    public boolean isSetID() {
        return (this.id!= null);
    }

}
