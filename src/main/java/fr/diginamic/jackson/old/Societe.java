package fr.diginamic.jackson.old;

import java.util.ArrayList;
import java.util.List;

public class Societe {
	
	private String nom;
	private SiegeSocial siegeSocial;
	private List<Fondateur> fondateurs = new ArrayList<>();
	private List<ChiffreAffaire> chiffreAffaire = new ArrayList<>();
	
	
	/**
	 * 
	 */
	public Societe() {
		super();
	}
	/**
	 * @param nom
	 */
	public Societe(String nom) {
		super();
		this.nom = nom;
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
	 * @return the siegeSocial
	 */
	public SiegeSocial getSiegeSocial() {
		return siegeSocial;
	}
	/**
	 * @param siegeSocial the siegeSocial to set
	 */
	public void setSiegeSocial(SiegeSocial siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
	/**
	 * @return the fondateurs
	 */
	public List<Fondateur> getFondateurs() {
		return fondateurs;
	}
	/**
	 * @param fondateurs the fondateurs to set
	 */
	public void setFondateurs(List<Fondateur> fondateurs) {
		this.fondateurs = fondateurs;
	}
	/**
	 * @return the chiffreAffaire
	 */
	public List<ChiffreAffaire> getChiffreAffaire() {
		return chiffreAffaire;
	}
	/**
	 * @param chiffreAffaire the chiffreAffaire to set
	 */
	public void setChiffreAffaire(List<ChiffreAffaire> chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	

}
