package fr.diginamic.jaxb.old;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "pays")
public class Pays {
	
	@XmlElement
	private String nom;
	@XmlElement
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate dateDeReleve;
	@XmlElement
	private DonneesDemographiques donneesDemographiques;
	@XmlElement
	private DonneesEconomiques donneesEconomiques;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the dateDeReleve
	 */
	public LocalDate getDateDeReleve() {
		return dateDeReleve;
	}
	/**
	 * @param dateDeReleve the dateDeReleve to set
	 */
	public void setDateDeReleve(LocalDate dateDeReleve) {
		this.dateDeReleve = dateDeReleve;
	}
	/**
	 * @return the donneesDemographiques
	 */
	public DonneesDemographiques getDonneesDemographiques() {
		return donneesDemographiques;
	}
	/**
	 * @param donneesDemographiques the donneesDemographiques to set
	 */
	public void setDonneesDemographiques(DonneesDemographiques donneesDemographiques) {
		this.donneesDemographiques = donneesDemographiques;
	}
	/**
	 * @return the donneesEconomiques
	 */
	public DonneesEconomiques getDonneesEconomiques() {
		return donneesEconomiques;
	}
	/**
	 * @param donneesEconomiques the donneesEconomiques to set
	 */
	public void setDonneesEconomiques(DonneesEconomiques donneesEconomiques) {
		this.donneesEconomiques = donneesEconomiques;
	}
	
	

}
