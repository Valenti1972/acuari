package pecera;

public class Organisme {
	String NomOrganisme;
	String Especie;
	Llum TipusLlum;
	double TempMax;
	double TempMin;
	double PHMax;
	double PHMin;
	
	//CONTRUCTOR
	//******************************************************************
	public Organisme(String nomOrganisme, String especie, Llum tipusLlum,
	        double tempMax, double tempMin, double pHMax, double pHMin) throws IllegalArgumentException {
	    if (nomOrganisme == null || especie == null || tipusLlum == null) {
	        throw new IllegalArgumentException("Els paràmetres no poden ser null.");
	    }
	    if (tempMax > 40 || tempMin < 14 || pHMax > 8 || pHMin < 0) {
	        throw new IllegalArgumentException("Els valors de temperatura i pH han de ser vàlids.");
	    }
	    NomOrganisme = nomOrganisme;
	    Especie = especie;
	    TipusLlum = tipusLlum;
	    TempMax = tempMax;
	    TempMin = tempMin;
	    PHMax = pHMax;
	    PHMin = pHMin;
	}
	
	//GETTERS 
	//*******************************************************************
	public String getNomOrganisme() {		return NomOrganisme;	}
	public String getEspecie() {		return Especie;				}
	public double getTempMax() {		return TempMax;				}
	public double getTempMin() {		return TempMin;				}
	public double getPHMax() {			return PHMax;				}
	public double getPHMin() {			return PHMin;				}
	
	//MODIFIQUEM PER EXTREURE EL NOM COMPLERT
	public String getTipusLlum() {	
		String necessitatsLlum = "";
        if (TipusLlum == Llum.A) {
            necessitatsLlum = "Alta";
        } else if (TipusLlum == Llum.M) {
            necessitatsLlum = "Mitjanes";
        } else if (TipusLlum == Llum.B) {
            necessitatsLlum = "Baixa";
        }
		return necessitatsLlum;	
	}
	
}
