package fr.diginamic.jaxb;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import fr.diginamic.jaxb.beans.PaysListe;
;

public class TestXml {

	public static void main(String[] args) throws Exception{
		
		JAXBContext context = JAXBContext.newInstance(PaysListe.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		PaysListe racine = (PaysListe) unmarshaller.unmarshal(new File("src\\main\\resources\\fr\\diginamic\\xml\\formatageXml.xml"));

		System.out.println(racine);
		System.out.println(racine.getPays());
		List<PaysListe.Pays> liste = racine.getPays();
		
		for(PaysListe.Pays pays: liste) {
			System.out.println("Nom pays : " + pays.getNom());
			System.out.println("Date : " + pays.getDateDeReleve());
			System.out.println("fecondite : " + pays.getDonneesDemographiques().getFecondite().getValue());
			System.out.println("population : " + pays.getDonneesDemographiques().getPopulation().getValue());
			System.out.println("PIB : " + pays.getDonneesEconomiques().getPib().getValue());
			System.out.println("Monnaie : " + pays.getDonneesEconomiques().getMonnaie());
			
		}
	}

}
