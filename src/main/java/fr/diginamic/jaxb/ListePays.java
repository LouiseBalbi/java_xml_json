package fr.diginamic.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "paysListe")
public class ListePays {
	
	@XmlElement
	protected List<Pays> paysListe;

	/**
	 * @return the paysListe
	 */
	public List<Pays> getPaysListe() {
		return paysListe;
	}

	/**
	 * @param paysListe the paysListe to set
	 */
	public void setPaysListe(List<Pays> paysListe) {
		this.paysListe = paysListe;
	}
	
	
	

}
