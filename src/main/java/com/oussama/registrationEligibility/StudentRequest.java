//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.04.22 à 04:15:53 AM CET 
//


package com.oussama.registrationEligibility;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="studentName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="graduationScore"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="numberOfCertifications" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="javaLastYearScore"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
    "studentName",
    "age",
    "graduationScore",
    "numberOfCertifications",
    "javaLastYearScore"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    @XmlElement(required = true)
    protected String studentName;
    protected int age;
    protected double graduationScore;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfCertifications;
    protected double javaLastYearScore;

    /**
     * Obtient la valeur de la propriété studentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Définit la valeur de la propriété studentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Obtient la valeur de la propriété age.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Définit la valeur de la propriété age.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Obtient la valeur de la propriété graduationScore.
     * 
     */
    public double getGraduationScore() {
        return graduationScore;
    }

    /**
     * Définit la valeur de la propriété graduationScore.
     * 
     */
    public void setGraduationScore(double value) {
        this.graduationScore = value;
    }

    /**
     * Obtient la valeur de la propriété numberOfCertifications.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCertifications() {
        return numberOfCertifications;
    }

    /**
     * Définit la valeur de la propriété numberOfCertifications.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCertifications(BigInteger value) {
        this.numberOfCertifications = value;
    }

    /**
     * Obtient la valeur de la propriété javaLastYearScore.
     * 
     */
    public double getJavaLastYearScore() {
        return javaLastYearScore;
    }

    /**
     * Définit la valeur de la propriété javaLastYearScore.
     * 
     */
    public void setJavaLastYearScore(double value) {
        this.javaLastYearScore = value;
    }

}
