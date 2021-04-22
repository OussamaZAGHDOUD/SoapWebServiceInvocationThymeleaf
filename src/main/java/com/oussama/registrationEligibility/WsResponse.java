//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.04.22 à 11:27:10 PM CET 
//


package com.oussama.registrationEligibility;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="scoreOfApplicant"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="criteriaMismatch" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isEligible",
    "scoreOfApplicant",
    "criteriaMismatch"
})
@XmlRootElement(name = "wsResponse")
public class WsResponse {

    protected boolean isEligible;
    protected double scoreOfApplicant;
    @XmlElement(required = true)
    protected List<String> criteriaMismatch;

    /**
     * Obtient la valeur de la propriété isEligible.
     * 
     */
    public boolean isIsEligible() {
        return isEligible;
    }

    /**
     * Définit la valeur de la propriété isEligible.
     * 
     */
    public void setIsEligible(boolean value) {
        this.isEligible = value;
    }

    /**
     * Obtient la valeur de la propriété scoreOfApplicant.
     * 
     */
    public double getScoreOfApplicant() {
        return scoreOfApplicant;
    }

    /**
     * Définit la valeur de la propriété scoreOfApplicant.
     * 
     */
    public void setScoreOfApplicant(double value) {
        this.scoreOfApplicant = value;
    }

    /**
     * Gets the value of the criteriaMismatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaMismatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaMismatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCriteriaMismatch() {
        if (criteriaMismatch == null) {
            criteriaMismatch = new ArrayList<String>();
        }
        return this.criteriaMismatch;
    }

}
