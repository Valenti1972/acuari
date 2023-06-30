package pecera;

public class Planta extends Organisme {
	TipusDePlanta tipusplanta;
	// Constructor
	  public Planta(String nomOrganisme, String especie, Llum tipusLlum, double tempMax, 
			  double tempMin, double pHMax,double pHMin, TipusDePlanta tipusplanta)
			throws IllegalArgumentException {
	        super(nomOrganisme, especie, tipusLlum, tempMax, tempMin, pHMax, pHMin);

	        if (tipusplanta == null) {
	            throw new IllegalArgumentException("El tipus de planta no pot ser null.");
	        }

	        this.tipusplanta = tipusplanta;
	    }
 
	//Getters
	public String getTipusplanta() {
		String tipusPlanta = "";
        if (tipusplanta == TipusDePlanta.T) {
            tipusPlanta = "Tija";
        } else if (tipusplanta == TipusDePlanta.B) {
            tipusPlanta = "Bulb";
        } else if (tipusplanta == TipusDePlanta.A) {
            tipusPlanta = "Arrels";
        }
		return tipusPlanta;	}
	 
	//Setters
	/*public void setTipusplanta(TipusDePlanta tipusplanta) throws IllegalArgumentException {
	        if (tipusplanta == null) {
	            throw new IllegalArgumentException("El tipus de planta no pot ser null.");
	        }
	        this.tipusplanta = tipusplanta;
	}*/
	//TO STRING
	public String toString() {
		return "Nom de la Planta: "  +  NomOrganisme  + "\n"+ " Especie de la planta: "  + Especie + 
				" Tipus de Planta: " +  getTipusplanta() + 	" Tipus de Llum: " + getTipusLlum() +
				"\n" + "TempMax: " + TempMax + " TempMin=" + TempMin + ", PHMax=" + PHMax
				+ ", PHMin=" + PHMin;
	}
}
