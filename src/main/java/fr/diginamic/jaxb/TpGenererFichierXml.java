package fr.diginamic.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import fr.diginamic.jaxb.beans.PaysListe;

public class TpGenererFichierXml {

	public static void main(String[] args) throws Exception{
		
		JAXBContext jc = JAXBContext.newInstance(PaysListe.Pays.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		PaysListe liste = new PaysListe();
		
		PaysListe.Pays pays = new PaysListe.Pays("Grece");

		liste.getPays().add(pays);
		File os = new File ( "src\\main\\resources\\fr\\diginamic\\xml\\testMarsh.xml" );
		marshaller.marshal(pays, os);

	}

}
