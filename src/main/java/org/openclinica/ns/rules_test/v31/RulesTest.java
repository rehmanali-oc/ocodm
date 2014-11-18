//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.17 at 09:37:57 PM EST 
//


package org.openclinica.ns.rules_test.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.rules.v31.Rules;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}Rules"/>
 *         &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/RulesTest/v3.1}Parameters" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/RulesTest/v3.1}RulesTestMessages" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rules",
    "valid",
    "parameters",
    "rulesTestMessages"
})
@XmlRootElement(name = "RulesTest")
public class RulesTest {

    @XmlElement(name = "Rules", namespace = "http://www.openclinica.org/ns/rules/v3.1", required = true)
    protected Rules rules;
    @XmlElement(name = "Valid")
    protected boolean valid;
    @XmlElement(name = "Parameters", required = true)
    protected List<ParameterType> parameters;
    @XmlElement(name = "RulesTestMessages", required = true)
    protected List<RulesTestMessagesType> rulesTestMessages;

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link Rules }
     *     
     */
    public Rules getRules() {
        return rules;
    }

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rules }
     *     
     */
    public void setRules(Rules value) {
        this.rules = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterType }
     * 
     * 
     */
    public List<ParameterType> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<ParameterType>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the rulesTestMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rulesTestMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRulesTestMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RulesTestMessagesType }
     * 
     * 
     */
    public List<RulesTestMessagesType> getRulesTestMessages() {
        if (rulesTestMessages == null) {
            rulesTestMessages = new ArrayList<RulesTestMessagesType>();
        }
        return this.rulesTestMessages;
    }

}
