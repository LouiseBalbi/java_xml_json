package fr.diginamic.jackson;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class TestJson {

	public static void main(String[] args) throws Exception {
		
		ObjectMapper mapper = new ObjectMapper();
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		List<Societe> societes = mapper.readValue(new File("src\\main\\resources\\fr\\diginamic\\json\\tpJson.json"), collType);

		
		for(Societe s: societes) {
			System.out.println("Nom : " + s.getNom());
			System.out.println("Nom fondateur 1 : " + s.getFondateurs().get(0).toString());
		}
		
	}

}
