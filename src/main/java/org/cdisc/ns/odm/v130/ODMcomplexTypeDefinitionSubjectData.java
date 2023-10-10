//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.10 at 03:40:48 PM PKT 
//


package org.cdisc.ns.odm.v130;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionDiscrepancyNotes;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionSubjectGroupData;


/**
 * <p>Java class for ODMcomplexTypeDefinition-SubjectData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-SubjectData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}InvestigatorRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}SiteRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}SubjectDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SubjectDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}SubjectDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SubjectData", propOrder = {
    "auditRecord",
    "signature",
    "investigatorRef",
    "siteRef",
    "annotation",
    "studyEventData",
    "subjectDataElementExtension"
})
public class ODMcomplexTypeDefinitionSubjectData
    implements Serializable
{

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "InvestigatorRef")
    protected ODMcomplexTypeDefinitionInvestigatorRef investigatorRef;
    @XmlElement(name = "SiteRef")
    protected ODMcomplexTypeDefinitionSiteRef siteRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "StudyEventData")
    protected List<ODMcomplexTypeDefinitionStudyEventData> studyEventData;
    @XmlElements({
        @XmlElement(name = "SubjectGroupData", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionSubjectGroupData.class),
        @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionAuditLogs.class),
        @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionDiscrepancyNotes.class)
    })
    protected List<Serializable> subjectDataElementExtension;
    @XmlAttribute(name = "SubjectKey", required = true)
    protected String subjectKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "StudySubjectID", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String studySubjectID;
    @XmlAttribute(name = "UniqueIdentifier", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String uniqueIdentifier;
    @XmlAttribute(name = "Status", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String status;
    @XmlAttribute(name = "SecondaryID", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String secondaryID;
    @XmlAttribute(name = "DateOfBirth", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlAttribute(name = "YearOfBirth", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected BigInteger yearOfBirth;
    @XmlAttribute(name = "Sex", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String sex;
    @XmlAttribute(name = "Epoch", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String epoch;
    @XmlAttribute(name = "StudyCalendar", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String studyCalendar;

    /**
     * Gets the value of the auditRecord property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    /**
     * Sets the value of the auditRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    public boolean isSetAuditRecord() {
        return (this.auditRecord!= null);
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    public boolean isSetSignature() {
        return (this.signature!= null);
    }

    /**
     * Gets the value of the investigatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionInvestigatorRef }
     *     
     */
    public ODMcomplexTypeDefinitionInvestigatorRef getInvestigatorRef() {
        return investigatorRef;
    }

    /**
     * Sets the value of the investigatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionInvestigatorRef }
     *     
     */
    public void setInvestigatorRef(ODMcomplexTypeDefinitionInvestigatorRef value) {
        this.investigatorRef = value;
    }

    public boolean isSetInvestigatorRef() {
        return (this.investigatorRef!= null);
    }

    /**
     * Gets the value of the siteRef property.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSiteRef }
     *     
     */
    public ODMcomplexTypeDefinitionSiteRef getSiteRef() {
        return siteRef;
    }

    /**
     * Sets the value of the siteRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSiteRef }
     *     
     */
    public void setSiteRef(ODMcomplexTypeDefinitionSiteRef value) {
        this.siteRef = value;
    }

    public boolean isSetSiteRef() {
        return (this.siteRef!= null);
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the studyEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudyEventData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudyEventData> getStudyEventData() {
        if (studyEventData == null) {
            studyEventData = new ArrayList<ODMcomplexTypeDefinitionStudyEventData>();
        }
        return this.studyEventData;
    }

    public boolean isSetStudyEventData() {
        return ((this.studyEventData!= null)&&(!this.studyEventData.isEmpty()));
    }

    public void unsetStudyEventData() {
        this.studyEventData = null;
    }

    /**
     * Gets the value of the subjectDataElementExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectDataElementExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectDataElementExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionSubjectGroupData }
     * {@link OCodmComplexTypeDefinitionAuditLogs }
     * {@link OCodmComplexTypeDefinitionDiscrepancyNotes }
     * 
     * 
     */
    public List<Serializable> getSubjectDataElementExtension() {
        if (subjectDataElementExtension == null) {
            subjectDataElementExtension = new ArrayList<Serializable>();
        }
        return this.subjectDataElementExtension;
    }

    public boolean isSetSubjectDataElementExtension() {
        return ((this.subjectDataElementExtension!= null)&&(!this.subjectDataElementExtension.isEmpty()));
    }

    public void unsetSubjectDataElementExtension() {
        this.subjectDataElementExtension = null;
    }

    /**
     * Gets the value of the subjectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectKey() {
        return subjectKey;
    }

    /**
     * Sets the value of the subjectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectKey(String value) {
        this.subjectKey = value;
    }

    public boolean isSetSubjectKey() {
        return (this.subjectKey!= null);
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    public boolean isSetTransactionType() {
        return (this.transactionType!= null);
    }

    /**
     * Gets the value of the studySubjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudySubjectID() {
        return studySubjectID;
    }

    /**
     * Sets the value of the studySubjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudySubjectID(String value) {
        this.studySubjectID = value;
    }

    public boolean isSetStudySubjectID() {
        return (this.studySubjectID!= null);
    }

    /**
     * Gets the value of the uniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Sets the value of the uniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIdentifier(String value) {
        this.uniqueIdentifier = value;
    }

    public boolean isSetUniqueIdentifier() {
        return (this.uniqueIdentifier!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the secondaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryID() {
        return secondaryID;
    }

    /**
     * Sets the value of the secondaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryID(String value) {
        this.secondaryID = value;
    }

    public boolean isSetSecondaryID() {
        return (this.secondaryID!= null);
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    public boolean isSetDateOfBirth() {
        return (this.dateOfBirth!= null);
    }

    /**
     * Gets the value of the yearOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Sets the value of the yearOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearOfBirth(BigInteger value) {
        this.yearOfBirth = value;
    }

    public boolean isSetYearOfBirth() {
        return (this.yearOfBirth!= null);
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    public boolean isSetSex() {
        return (this.sex!= null);
    }

    /**
     * Gets the value of the epoch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpoch() {
        return epoch;
    }

    /**
     * Sets the value of the epoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpoch(String value) {
        this.epoch = value;
    }

    public boolean isSetEpoch() {
        return (this.epoch!= null);
    }

    /**
     * Gets the value of the studyCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyCalendar() {
        return studyCalendar;
    }

    /**
     * Sets the value of the studyCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyCalendar(String value) {
        this.studyCalendar = value;
    }

    public boolean isSetStudyCalendar() {
        return (this.studyCalendar!= null);
    }

}
