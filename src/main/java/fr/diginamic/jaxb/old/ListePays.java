package fr.diginamic.jaxb.old;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "paysListe")
public class ListePays {
	
	@XmlElement()
	protected List<Pays> pays;

	/**
	 * @return the pays
	 */
	public List<Pays> getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}

	
	
	

}
