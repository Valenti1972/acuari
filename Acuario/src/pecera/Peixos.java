package pecera;

public class Peixos extends Organisme{

	String Procedencia;
	Dieta TipusMenjar;
	double longitud;
	
	
	
	
	
	//EL CONSTRUCTOR TE UNA EXCEPCIO PER CONTROLAR EL TAMNANY DEL PEIX
	public Peixos(String nomOrganisme, String especie, Llum tipusLlum, double tempMax, double tempMin, double pHMax,
	        double pHMin, String procedencia, Dieta tipusMenjar, double longitud) throws IllegalArgumentException {
	    super(nomOrganisme, especie, tipusLlum, tempMax, tempMin, pHMax, pHMin);
	    Procedencia = procedencia;

	    if (tipusMenjar == null) {
	        tipusMenjar = Dieta.A; // Asignar un valor predeterminado si es null
	    }
	    
	    if (longitud <= 0) {
	        throw new IllegalArgumentException("La longitud del peix ha de ser un valor positiu.");
	    }
	    
	    TipusMenjar = tipusMenjar;
	    this.longitud = longitud;
	}
 	/**GETTERS */
	public String getProcedencia() {	return Procedencia;	}
	
	public String getTipusMenjar() {
	    String dieta;
	    if (TipusMenjar == Dieta.A) {
	        dieta = "Algues";
	    } else if (TipusMenjar == Dieta.O) {
	        dieta = "Omnivor";
	    } else if (TipusMenjar == Dieta.F) {
	        dieta = "Fulles";
	    } else {
	        dieta = "Desconegut";
	    }
	    return dieta;    
	}
	
	public Double getLongitud() {		return longitud;	}
	
	//SETTERS
	public void setProcedencia(String procedencia) {	Procedencia = procedencia;	}
	public void setTipusMenjar(Dieta tipusMenjar) {		TipusMenjar = tipusMenjar; 	}
	
	
	//CONTROLEM AMB EXCEPCIONS EL TAMANY DEL PEIX
	public void setLongitud(double longitud) throws IllegalArgumentException {
        if (longitud <= 0) {
            throw new IllegalArgumentException("La longitud del peix ha de ser un valor positiu.");
        }

        this.longitud = longitud;
    }
	// public void setLongitud(Double longitud) { 		this.longitud = longitud;	}
	// TOSTRING
	@Override
	public String toString() {
	    return "Nom del Peix: "+ NomOrganisme + ", Especie: " + Especie + "\n"+ " Procedencia: " + Procedencia + "\n" +
	    		" Tipus de Dieta: " + getTipusMenjar() + " Longitud del peix: " + longitud +"\n"+
	    		" Quantitat de Llum: " + getTipusLlum() + ", Tempetura Maxima:" + TempMax + " Temperatura Min:" + TempMin 
	    		+ "\n"+ " PH Maxim: " + PHMax + ", PH Minim: " + PHMin;
	}
}
