package fr.diginamic.jackson.old;

public class ChiffreAffaire {
	
	private int annee;
	private double montant;
	private String unite;
	/**
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}
	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}
	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	/**
	 * @return the unite
	 */
	public String getUnite() {
		return unite;
	}
	/**
	 * @param unite the unite to set
	 */
	public void setUnite(String unite) {
		this.unite = unite;
	}
	@Override
	public String toString() {
		return "ChiffreAffaire [annee=" + annee + ", montant=" + montant + ", unite=" + unite + "]";
	}
	
	

}
