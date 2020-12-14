package fr.diginamic.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "donneesEconomiques")
public class DonneesEconomiques {
	
	@XmlElement
	private Pib pib;
	
	@XmlElement
	private String monnaie;

	/**
	 * @return the pib
	 */
	public Pib getPib() {
		return pib;
	}

	/**
	 * @param pib the pib to set
	 */
	public void setPib(Pib pib) {
		this.pib = pib;
	}

	/**
	 * @return the monnaie
	 */
	public String getMonnaie() {
		return monnaie;
	}

	/**
	 * @param monnaie the monnaie to set
	 */
	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	

}
