//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.15 at 10:35:12 AM CET 
//


package fr.diginamic.jaxb.beans;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.diginamic.jaxb.beans package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.diginamic.jaxb.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaysListe }
     * 
     */
    public PaysListe createPaysListe() {
        return new PaysListe();
    }

    /**
     * Create an instance of {@link PaysListe.Pays }
     * 
     */
    public PaysListe.Pays createPaysListePays() {
        return new PaysListe.Pays();
    }

    /**
     * Create an instance of {@link DateDeReleve }
     * 
     */
    public DateDeReleve createDateDeReleve() {
        return new DateDeReleve();
    }

    /**
     * Create an instance of {@link DonneesDemographiques }
     * 
     */
    public DonneesDemographiques createDonneesDemographiques() {
        return new DonneesDemographiques();
    }

    /**
     * Create an instance of {@link Population }
     * 
     */
    public Population createPopulation() {
        return new Population();
    }

    /**
     * Create an instance of {@link Fecondite }
     * 
     */
    public Fecondite createFecondite() {
        return new Fecondite();
    }

    /**
     * Create an instance of {@link DonneesEconomiques }
     * 
     */
    public DonneesEconomiques createDonneesEconomiques() {
        return new DonneesEconomiques();
    }

    /**
     * Create an instance of {@link Pib }
     * 
     */
    public Pib createPib() {
        return new Pib();
    }

}