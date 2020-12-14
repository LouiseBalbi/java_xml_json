package fr.diginamic.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "donneesDemographiques")
public class DonneesDemographiques {
	
	@XmlElement
	protected Population population;
	
	@XmlElement
	protected Fecondite fecondite;

	/**
	 * @return the population
	 */
	public Population getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(Population population) {
		this.population = population;
	}

	/**
	 * @return the fecondite
	 */
	public Fecondite getFecondite() {
		return fecondite;
	}

	/**
	 * @param fecondite the fecondite to set
	 */
	public void setFecondite(Fecondite fecondite) {
		this.fecondite = fecondite;
	}
	
	

}
