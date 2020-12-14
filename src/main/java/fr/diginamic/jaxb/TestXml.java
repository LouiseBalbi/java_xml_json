package fr.diginamic.jaxb;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class TestXml {

	public static void main(String[] args) throws Exception{
		
		JAXBContext context = JAXBContext.newInstance(ListePays.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		ListePays racine = (ListePays) unmarshaller.unmarshal(new File("src\\main\\resources\\fr\\diginamic\\xml\\formatageXml.xml"));

		System.out.println(racine.getPaysListe());
		List<Pays> liste = racine.getPaysListe();
		
		for(Pays pays: liste) {
			System.out.println("Nom pays : " + pays.getNom());
		}
	}

}
