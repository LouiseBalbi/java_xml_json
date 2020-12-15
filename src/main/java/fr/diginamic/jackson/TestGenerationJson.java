package fr.diginamic.jackson;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.diginamic.jackson.beans.Fondateur;
import fr.diginamic.jackson.old.Societe;

public class TestGenerationJson {

	public static void main(String[] args) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		
		List<Societe> listeSociete = new ArrayList<>();

		Societe societe = new Societe("Societe");
		Societe societe2 = new Societe("Societe2");
		Societe societe3 = new Societe("Societe3");
		Societe societe4 = new Societe("Societe4");

		listeSociete.add(societe);
		listeSociete.add(societe2);
		listeSociete.add(societe3);
		listeSociete.add(societe4);
		
		mapper.writeValue(new File("src/main/resources/monFichier.json"), listeSociete);

	}

}
