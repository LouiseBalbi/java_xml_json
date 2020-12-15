package fr.diginamic.jackson.old;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Fondateur {
	
	private String prenom;
	private String nom;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate naissance;
	private String villeNaissance;
	private String etatNaissance;
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
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
	 * @return the naissance
	 */
	public LocalDate getNaissance() {
		return naissance;
	}
	/**
	 * @param naissance the naissance to set
	 */
	public void setNaissance(LocalDate naissance) {
		this.naissance = naissance;
	}
	/**
	 * @return the villeNaissance
	 */
	public String getVilleNaissance() {
		return villeNaissance;
	}
	/**
	 * @param villeNaissance the villeNaissance to set
	 */
	public void setVilleNaissance(String villeNaissance) {
		this.villeNaissance = villeNaissance;
	}
	/**
	 * @return the etatNaissance
	 */
	public String getEtatNaissance() {
		return etatNaissance;
	}
	/**
	 * @param etatNaissance the etatNaissance to set
	 */
	public void setEtatNaissance(String etatNaissance) {
		this.etatNaissance = etatNaissance;
	}
	@Override
	public String toString() {
		return "Fondateur [prenom=" + prenom + ", nom=" + nom + ", naissance=" + naissance + "]";
	}
	
	

}
